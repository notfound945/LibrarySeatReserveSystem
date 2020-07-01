package cn.fyl.utils;

import cn.fyl.view.dialog.login.connectiondatabase.IsError;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * JDBC 类
 * @author fyl
 */
public class JDBCUtils {
    private static DataSource dataSource;

    static {
        try {
            Properties pro = new Properties();
            pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            System.out.println("找不到jdbc.properties文件！");
        } catch (Exception e) {
            System.out.println("创建druid连接池失败！");
        }finally {
            if(dataSource == null){
                System.out.println("dataSource为null");
            }
        }
    }

    public static Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            new IsError().setVisible(true);
        }
        return null;

    }

    public static void close(Connection connection) {
        close(null, null, connection);
    }
    public static void close(Statement statement,Connection connection){
        close(null,statement,connection);
    }

    public static void close(ResultSet resultSet,Statement statement,Connection connection){
        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static DataSource getDataSource(){
        return dataSource;
    }
}
