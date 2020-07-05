package cn.fyl.dao;

import cn.fyl.domain.Admin;

import java.sql.SQLException;

public interface AdminDao {
    /**
     * 根据用户名和密码查找
     * @param userName 用户名
     * @param password 密码
     * @return User User实体
     * @throws SQLException 数据库异常
     */
    Admin queryByUserNameAndPassword(String userName, String password);
}
