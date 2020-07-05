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

    Admin verify(Admin admin);

    /**
     * 读入文件操作
     * @param path 文件路径
     * @return List 数据
     */
    List<String[]> readFile(String path);

    /**
     * 读入文件
     * @param path
     */
    void readFileByRandomAccess(String path, String userName);
}
