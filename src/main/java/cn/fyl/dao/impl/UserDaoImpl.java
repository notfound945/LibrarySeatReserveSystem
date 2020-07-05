package cn.fyl.dao.impl;

import cn.fyl.dao.UserDao;
import cn.fyl.domain.User;
import cn.fyl.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

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
    public HashMap<Integer, User> getAll() {
        HashMap<Integer, User> hashMap = new HashMap<>();
        sql = "select * from user ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            int no = 0;
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String userName = resultSet.getString("userName");
                int age = resultSet.getInt("age");
                String sex = resultSet.getString("sex");
                String password = resultSet.getString("passwd");
                String phone = resultSet.getString("phone");
                String grade = resultSet.getString("grade");
                String description = resultSet.getString("description");
                User user = new User(name, userName, age, sex, password, phone, grade, description);
                hashMap.put(no, user);
                no++;
            }
            return hashMap;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * 根据 id 查找用户
     *
     * @param userName
     * @return
     */
    @Override
    public User queryByUserName(String userName) {
        sql = "select * from user where username = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                userName = resultSet.getString("userName");
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                int age = resultSet.getInt("age");
                String phone = resultSet.getString("phone");
                String password = "无密码";
                String grade = resultSet.getString("grade");
                String description = resultSet.getString("description");
                User user = new User(id, userName, name, age, sex, password, phone, grade, description);
                return user;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * 添加用户数据
     *
     * @param user 添加的用户
     * @return
     */
    @Override
    public boolean addUser(User user) {
        // 判断是否存在同名用户
        if (queryByUserName(user.getUserName()) == null) {
            sql = "insert into user(userName, name, age, sex, passwd, phone, grade, description) values(?, ?, ?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, user.getUserName());
                preparedStatement.setString(2, user.getName());
                preparedStatement.setString(3, String.valueOf(user.getAge()));
                preparedStatement.setString(4, user.getSex());
                preparedStatement.setString(5, user.getPasswd());
                preparedStatement.setString(6, user.getPhone());
                preparedStatement.setString(7, user.getGrade());
                preparedStatement.setString(8, user.getDescription());
                int insertNumber = preparedStatement.executeUpdate();
                if (insertNumber > 0) {
                    return true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
        return false;
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
    public User queryByUserNameAndPassword(String userName, String password) {
        sql = "select * from user where userName = ? and passwd = ?";
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
                String description = resultSet.getString(9);
                user = new User(id, userName, name, age, sex, password, phone, grade, description);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    /**
     * 修改用户
     *
     * @param user
     */
    @Override
    public boolean modifyUserInfo(User user) {
        // 判断是否需要修改密码
        if (user.getPasswd().equals("")) {
            sql = "update user set name=?,age=?,sex=?,phone=?,grade=?,description=? where id = ?";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, user.getName());
                preparedStatement.setString(2, String.valueOf(user.getAge()));
                preparedStatement.setString(3, user.getSex());
                preparedStatement.setString(4, user.getPhone());
                preparedStatement.setString(5, user.getGrade());
                preparedStatement.setString(6, user.getDescription());
                preparedStatement.setString(7, String.valueOf(user.getId()));
                int modifyNumber = preparedStatement.executeUpdate();
                if (modifyNumber > 0) {
                    return true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }
        } else {
            sql = "update user set name=?,age=?,sex=?,phone=?,passwd=?,grade=?,description=? where id = ?";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, user.getName());
                preparedStatement.setString(2, String.valueOf(user.getAge()));
                preparedStatement.setString(3, user.getSex());
                preparedStatement.setString(4, user.getPhone());
                preparedStatement.setString(5, user.getPasswd());
                preparedStatement.setString(6, user.getGrade());
                preparedStatement.setString(7, user.getDescription());
                preparedStatement.setString(8, String.valueOf(user.getId()));
                int modifyNumber = preparedStatement.executeUpdate();
                if (modifyNumber > 0) {
                    return true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
        return false;
    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @Override
    public boolean deleteUser(String userName) {
        sql = "delete from user where userName = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            int deleteNumber = preparedStatement.executeUpdate();
            if (deleteNumber > 0) {
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
        return false;
    }
}
