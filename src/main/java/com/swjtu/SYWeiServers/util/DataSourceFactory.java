package com.swjtu.SYWeiServers.util;

/**
 * Created by Administrator on 2018/3/18.
 */

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

    //数据库驱动
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    //数据库地址
    private static String url = "jdbc:sqlserver://localhost:1433;databaseName=";
    //数据库用户名
    private static String userName = "sa";
    //数据库连接密码
    private static String password = "654321";


    //最大数据库连接数量（采用数据库连接池思想）
    private static final int MaxDataSourceSize=10;
    //端口超时时间
    private static final int TimeOut = 2000;
    //数据库连接池，一个id对应一个数据库连接，数量超过后自动将最早创建的连接去除
    private static Map<String,SqlSessionFactory> dataSoruce;

    static{
        dataSoruce = new HashMap<String, SqlSessionFactory>(MaxDataSourceSize);
    }

    //删除第一个元素
    private static void removeFirstMap(){
        for (String key : dataSoruce.keySet()) {
            dataSoruce.remove(key);
            break;
        }
    }

    //删除数据库连接池中的数据库连接
    public static void removeHotel(String companyId){
        dataSoruce.remove(companyId);
    }

    //检测连接是否可用
//    public static boolean isConnection(Hotel hotel){
//        Boolean result = false;
//        try{
//            //检查端口是否开放
//            Socket client = new Socket();
//            SocketAddress socketAddress = new InetSocketAddress(hotel.getIp(),Integer.parseInt(hotel.getPort()));
//            client.connect(socketAddress,TimeOut);
//            client.close();
//
//            result = true;
//        }
//        catch(Exception e){
//            e.printStackTrace();
//            result = false;
//        }
//        finally{
//            return result;
//        }
//    }

    /**
     * 传入数据库名称，获取数据库连接
     * @param dbName
     * @return
     */
    private static SqlSessionFactory createSqlSessionFactory(String dbName){
        SqlSessionFactory _sqlSessionFactory = null;
        try{
            //拼接连接
            String dataSourceUrl = url + dbName;
            //初始化数据库属性
            Properties properties = new Properties();
            properties.setProperty("jdbc.driver",driver);
            properties.setProperty("jdbc.url", url);
            properties.setProperty("jdbc.username", userName);
            properties.setProperty("jdbc.password", password);
            Reader reader = Resources.getResourceAsReader(MainDataSourceFactory.configuration);
            //创建数据工厂
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            _sqlSessionFactory = builder.build(reader, properties);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            return _sqlSessionFactory;
        }
    }

    /**
     * 根据公司id从数据库连接池中获取数据连接，然后获取相应的dao
     * @param companyId
     * @param clazz
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T getMapper(String companyId, String dbName, Class<?> clazz){
        SqlSessionFactory sqlSessionFactory = dataSoruce.get(companyId);
        if(sqlSessionFactory==null){
            //创建数据工厂
            sqlSessionFactory = createSqlSessionFactory(dbName);
            if(sqlSessionFactory != null){
                //排序算法 删除Map序列第一个元素，并将当前元素移至Map序列的首位
                if(dataSoruce.size()>=MaxDataSourceSize){
                    removeFirstMap();
                }
                dataSoruce.put(companyId, sqlSessionFactory);
            }
            else
                return null;
        }
        //获取数据库连接
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //根据传入的class类型获取相应的dao
        Object idal = sqlSession.getMapper(clazz);
        //返回dao
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
