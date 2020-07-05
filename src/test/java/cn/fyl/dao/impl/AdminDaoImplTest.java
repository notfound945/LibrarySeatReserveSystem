package cn.fyl.dao.impl;

import cn.fyl.domain.Admin;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminDaoImplTest {

    private AdminDaoImpl adminDaoImpl = new AdminDaoImpl();
    @Test
    public void queryByUserNameAndPassword() {
        Admin admin = adminDaoImpl.queryByUserNameAndPassword("#fyl", "rootroot");
        assertNotNull(admin);
    }
}