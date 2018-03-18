package com.swjtu.SYWeiServers.util;

/**
 * Created by Administrator on 2018/3/18.
 */

import com.swjtu.SYWeiServers.entity.Hotel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@SuppressWarnings("finally")
public class DataSourceFactory {

    //酒店数据工作缓存数量
    private static final int MaxDataSourceSize=10;
    //端口超时时间
    private static final int TimeOut = 2000;

    //酒店数据工厂缓存
    private static Map<Integer,SqlSessionFactory> dataSoruce;

    static{
        dataSoruce = new HashMap<Integer, SqlSessionFactory>(MaxDataSourceSize);
    }

    //删除第一个元素
    private static void removeFirstMap(){
        for (Integer key : dataSoruce.keySet()) {
            dataSoruce.remove(key);
            break;
        }
    }

    //删除酒店缓存
    public static void removeHotel(int hotelid){
        dataSoruce.remove(hotelid);
    }

    //检测连接是否可用

    public static boolean isConnection(Hotel hotel){
        Boolean result = false;
        try{
            //检查端口是否开放
//            Socket client = new Socket();
//            SocketAddress socketAddress = new InetSocketAddress(hotel.getIp(),Integer.parseInt(hotel.getPort()));
//            client.connect(socketAddress,TimeOut);
//            client.close();

            result = true;
        }
        catch(Exception e){
            e.printStackTrace();
            result = false;
        }
        finally{
            return result;
        }
    }

    private static SqlSessionFactory createSqlSessionFactory(Integer id){
        SqlSessionFactory _sqlSessionFactory = null;
        try{
            Hotel hotel = HotelFactory.getHotelById(id);
            if(hotel != null && isConnection(hotel)){
                //数据库匹配           Oracle/Mysql
//                String driver="oracle.jdbc.driver.OracleDriver",url="jdbc:oracle:thin:@"+hotel.getIp()+":"+hotel.getPort()+":"+hotel.getSid();
                ///mysql
                String driver = "com.mysql.jdbc.Driver";
                String url = hotel.getDbName();
                String userName = "root";
                String password = "123456";
                //url = "jdbc:mysql://"+hotel.getIp()+":"+hotel.getPort()+"/"+hotel.getDatabase();
                //初始化数据库属性
                Properties properties = new Properties();
                properties.setProperty("jdbc.driver",driver);
                properties.setProperty("jdbc.url", url);
                properties.setProperty("jdbc.username", userName);
                properties.setProperty("jdbc.password", password);
                Reader reader = Resources.getResourceAsReader(HotelFactory.configuration);
                //创建数据工厂
                SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
                _sqlSessionFactory = builder.build(reader, properties);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            return _sqlSessionFactory;
        }
    }

    //根据酒店id获取Mapper
    @SuppressWarnings("unchecked")
    public static <T> T getMapper(Integer id,Class<?> clazz){
        SqlSessionFactory sqlSessionFactory = dataSoruce.get(id);
        if(sqlSessionFactory==null){
            //创建数据工厂
            sqlSessionFactory = createSqlSessionFactory(id);
            if(sqlSessionFactory != null){
                //排序算法 删除Map序列第一个元素，并将当前元素移至Map序列的首位
                if(dataSoruce.size()>=MaxDataSourceSize){
                    removeFirstMap();
                }
                dataSoruce.put(id, sqlSessionFactory);
            }
            else
                return null;
        }
        /*else{
            //排序算法 将当前元素移至Map序列的首位
            dataSoruce.remove(id);
            dataSoruce.put(id, sqlSessionFactory);
        }*/
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Object idal = sqlSession.getMapper(clazz);
        return (T)IDALProxy.bind(idal, sqlSession);
    }

    //动态加载  SqlSession提交，释放
    public static class IDALProxy implements InvocationHandler {
        private Object idal;
        private SqlSession sqlSession;

        private IDALProxy(Object idal, SqlSession sqlSession) {
            this.idal = idal;
            this.sqlSession = sqlSession;
        }

        public static Object bind(Object idal, SqlSession sqlSession) {
            return Proxy.newProxyInstance(idal.getClass().getClassLoader(),idal.getClass().getInterfaces(), new IDALProxy(idal, sqlSession));
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object object = null;
            try {
                object = method.invoke(idal, args);
            } catch(Exception e) {
                sqlSession.rollback();
                e.printStackTrace();

            } finally {
                sqlSession.commit();
                sqlSession.clearCache();
                sqlSession.close();
            }
            return object;
        }
    }

}
