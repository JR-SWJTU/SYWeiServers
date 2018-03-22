package com.swjtu.SYWeiServers.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

/**
 * Created by Administrator on 2018/3/18.
 */
public class MainDataSourceFactory {

    public static SqlSessionFactory sqlSessionFactory = null;
    //数据库属性值
    public static final String jdbc_properties="resource/db.properties";
    //数据库配置文件
    public final static String configuration = "mybatis/configuration.xml";

    //创建本地酒店管理数据库
    static{
        try {
            Properties properties = new Properties();
            InputStream in = Resources.getResourceAsStream(jdbc_properties);
            properties.load(in);
            String driver = properties.getProperty("jdbc.driver");
            String url = properties.getProperty("jdbc.url");
            String username = properties.getProperty("jdbc.username");
            String password = properties.getProperty("jdbc.password");
            properties.setProperty("jdbc.driver",driver);
            properties.setProperty("jdbc.url", url);
            properties.setProperty("jdbc.username",username);
            properties.setProperty("jdbc.password",password);
            Reader reader = Resources.getResourceAsReader(configuration);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = builder.build(reader, properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
