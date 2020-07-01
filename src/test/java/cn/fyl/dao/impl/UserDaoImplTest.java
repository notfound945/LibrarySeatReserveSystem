package cn.fyl.dao.impl;

import cn.fyl.domain.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    @Test
    public void queryByUserNameAndPassword() {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        User phl = userDaoImpl.queryByUserNameAndPassword("fyl", "123456");
        assertNotNull(phl);
    }
}