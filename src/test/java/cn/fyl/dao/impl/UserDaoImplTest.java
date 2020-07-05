package cn.fyl.dao.impl;

import cn.fyl.domain.User;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class UserDaoImplTest {
    UserDaoImpl userDaoImpl = new UserDaoImpl();

    @Test
    public void queryByUserNameAndPassword() {
        String userName = "lb";
        String password = "123456";
        User user = userDaoImpl.queryByUserNameAndPassword(userName, password);
        assertNotNull(user);
    }

    @Test
    public void addUser() {
        int insertNumber = 0;
        for (int i = 30; i < 20030; i++) {
            User user = new User("符玉涟" + String.valueOf(i), "fyl" + String.valueOf(i), 18, "女", "123456", "15873321992", "18级5班");
            boolean isSuccess = userDaoImpl.addUser(user);
            if (isSuccess) {
                insertNumber++;
            }
        }
        System.out.println("成功添加了 " + insertNumber + " 条数据 ");
    }

    @Test
    public void testQueryByUserNameAndPassword() {
    }

    @Test
    public void deleteUser() {
        int deleteNumber = 0;
        for (int i = 30; i < 10030; i++) {
            boolean isSuccess = userDaoImpl.deleteUser(i);
            if (isSuccess) {
                deleteNumber++;
            }
        }
        System.out.println("成功删除了 " + deleteNumber + " 条数据");
    }

    @Test
    public void getAll() {
        HashMap<Integer, User> allUser = userDaoImpl.getAll();
        for (User item : allUser.values()) {
            System.out.println(item);
        }
    }
}