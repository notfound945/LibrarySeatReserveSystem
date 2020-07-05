package cn.fyl.dao.impl;

import cn.fyl.dao.AdminDao;
import cn.fyl.domain.User;
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
    private User user;
    @Override
    public User queryByUserNameAndPassword(String userName, String password) {
        sql = "select * from admin where userName = ? and passwd = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                userName = resultSet.getString(2);
                String name = resultSet.getString(3);
                int age = resultSet.getInt(4);
                String sex = resultSet.getString(5);
                password = "没有密码";
                String phone = resultSet.getString(7);
                String grade = resultSet.getString(8);
                user = new User(userName, name, age, sex, password, phone, grade);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }
}
