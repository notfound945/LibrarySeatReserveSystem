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
    public void readFile() {
        List<String[]> list = serviceImpl.readFile("src/main/resources/loginLog.txt");
        System.out.println(list);
        assertNotNull(list);
    }

    /**
     * 测试读取文件
     */
    @Test
    public void readFileByRandomAccess() {
        serviceImpl.readFileByRandomAccess("src/main/resources/loginLog.txt", "admin");
    }
}