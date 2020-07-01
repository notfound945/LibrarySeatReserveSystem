package cn.fyl.dao.impl;

import cn.fyl.dao.UserDao;
import cn.fyl.domain.User;
import cn.fyl.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author fyl
 * 实现User接口类
 */
public class UserDaoImpl implements UserDao {
    private static Connection connection;
    static {
        connection = JDBCUtils.getConnection();
    }
    private String sql;
    private User user;
    /**
     * 查询所有 User
     *
     * @return
     */
    @Override
    public List<Map<String, Object>> findAll() {
        return null;
    }

    /**
     * 根据 id 查找用户
     *
     * @param id
     * @return
     */
    @Override
    public User queryByID(int id) {
        sql = "select * from user where id = ?";
        return null;
    }

    /**
     * 根据用户名查找用户
     *
     * @param name
     * @return
     */
    @Override
    public User queryByName(String name) {
        return null;
    }

    /**
     * 根据用户名和密码查找用户
     *
     * @param userName
     * @param password
     * @return
     */
    @Override
    public User queryByUserNameAndPassword(String userName, String password) throws SQLException {
        sql = "select * from user where userName = ? and passwd = ?";
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
            user = new User(id, userName, name, age, sex, password, phone, grade);
        }
        return user;
    }

    /**
     * 修改用户
     *
     * @param user
     */
    @Override
    public void modifyInfo(User user) {

    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @Override
    public boolean deleteUser(int id) {
        return false;
    }
}
