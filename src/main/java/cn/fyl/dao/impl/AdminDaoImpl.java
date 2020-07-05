package cn.fyl.dao.impl;

import cn.fyl.dao.AdminDao;
import cn.fyl.domain.Admin;
import cn.fyl.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 管理员实现
 * @author fyl
 */
public class AdminDaoImpl implements AdminDao {
    private static Connection connection;
    static {
        connection = JDBCUtils.getConnection();
    }
    private String sql;
    private Admin admin;

    @Override
    public Admin queryByUserNameAndPassword(String userName, String password) {
        sql = "select * from admin where userName = ? and passwd = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                userName = resultSet.getString("userName");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String sex = resultSet.getString("sex");
                password = "没有密码";
                String phone = resultSet.getString("phone");
                admin = new Admin(userName, name, password, phone, sex, age);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return admin;
    }
}
