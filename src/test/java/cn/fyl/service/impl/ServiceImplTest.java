package cn.fyl.service.impl;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ServiceImplTest {
    ServiceImpl serviceImpl = new ServiceImpl();

    /**
     * 测试读取文件
     */
    @Test
    public void readFileByRandomAccess() {
        serviceImpl.readFileByRandomAccess("src/main/resources/loginLog.txt");
    }

    /**
     * 测试读取日志文件
     */
    @Test
    public void readLogFile() {
        List<String[]> logFile = serviceImpl.readLogFile("src/main/resources/loginLog.txt");
        assertNotNull(logFile);
    }
}