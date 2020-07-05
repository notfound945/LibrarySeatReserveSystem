package cn.fyl.service;

import cn.fyl.domain.Admin;
import cn.fyl.domain.User;

import java.util.List;

/**
 * 抽象的Service类
 * @author fyl
 */
public abstract interface Service {

    /**
     * 普通用户验证业务
     * @return User User实体
     * @param user User实体
     */
    User verify(User user);

    /**
     * 管理员验证业务
     * @param admin 管理员对象
     * @return 管理员对象
     */
    Admin verify(Admin admin);

    /**
     * 读取日志文件操作
     * @param path 文件路径
     * @return List 数据
     */
    List<String[]> readLogFile(String path);

    /**
     * 读入文件
     * @param path
     */
    void readFileByRandomAccess(String path);

    /**
     * 写入日志文件
     * @param path
     * @param userName
     */
    void writeLogFile(String path, String userName);
}
