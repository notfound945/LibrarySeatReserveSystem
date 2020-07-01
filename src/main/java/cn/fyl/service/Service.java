package cn.fyl.service;

import cn.fyl.domain.User;

import java.util.List;

/**
 * 抽象的Service类
 * @author fyl
 */
public abstract interface Service {

    /**
     * 用户验证业务
     * @return User User实体
     * @param user User实体
     */
    User verify(User user);

    /**
     * 读入文件操作
     * @param path 文件路径
     * @return List 数据
     */
    List<String[]> readFile(String path);
}
