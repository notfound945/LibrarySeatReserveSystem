package cn.fyl.dao;

import cn.fyl.domain.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fyl
 * DAO接口
 */
public interface UserDao {
    /**
     * 查询所有 User
     * @return 键值对HashMap对象
     *
     */
    HashMap<Integer, ? extends User> getAll();

    /**
     * 根据 id 查找用户
     * @param id 用户ID
     * @return User用户对象
     */
    User queryByUserName(String userName);

    /**
     * 添加用户
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 根据姓名查找用户
     * @param name 用户名
     * @return User User实体对象
     */
    User queryByName(String name);

    /**
     * 根据用户名和密码查找
      * @param userName 用户名
     * @param password 密码
     * @return User User实体
     * @throws SQLException 数据库异常
     */
    User queryByUserNameAndPassword(String userName, String password) throws SQLException;

    /**
     * 修改用户
     * @param user User 对象
     */
    boolean modifyUserInfo(User user);

    /**
     * 删除用户
     * @param id 用户id
     * @return boolean 布尔值
     */
    boolean deleteUser(String userName);
}
