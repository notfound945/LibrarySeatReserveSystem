package cn.fyl.dao;


import cn.fyl.domain.Log;

import java.util.ArrayList;

/**
 * 日志类
 * @author fyl
 */
public interface LogDao {
    /**
     * 根据用户id获取日志
     * @return
     */
    ArrayList<Log> getUserLog(int userId);


    /**
     *
     * 写入日志信息
     * @param log
     * @param userId
     * @return
     */
    boolean setUserLog(Log log);
}
