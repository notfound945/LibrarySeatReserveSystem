package cn.fyl.dao.impl;

import cn.fyl.domain.Log;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LogDaoImplTest {

    @Test
    public void getUserLog() {
        LogDaoImpl logDaoImpl = new LogDaoImpl();
        ArrayList<Log> userLog = logDaoImpl.getUserLog(1);
        assertNotNull(userLog);
    }
}