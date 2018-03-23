package com.swjtu.SYWeiServers.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
    /**
     * 创建新数据库
     * @param dbname 数据库名称
     * @return 是否创建成功
     */
    public static boolean createNewDB(String dbname){
        Connection conn = null;
        Statement stmt = null;
        try{
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String url = "jdbc:sqlserver://127.0.0.1:1433;database=Main";
            String username = "sa";
            String password = "Root123";
            String newSql = "E:/newsql.Sql";

            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            if (conn == null){
                return false;
            }
            stmt = conn.createStatement();
            //读取并执行sql脚本
            String sql = ToolHelper.readFile(newSql);
            sql = ToolHelper.replaceDBName(sql, dbname);
            String[] arrSql = sql.split("GO");
            for(int i = 0; i < arrSql.length; i++){
                stmt.execute(arrSql[i]);
            }
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        } finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                stmt = null;
            }
        }
    }
}
