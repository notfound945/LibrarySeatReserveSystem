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

    /**
     * 添加用户测试
     */
    @Test
    public void addUser() {
        int insertNumber = 0;
        for (int i = 30; i < 230; i++) {
            User user = new User( "fyl" + String.valueOf(i),"符玉涟" + String.valueOf(i), 18, "女", "123456", "15873321992", "18级5班", "常与同好争天下，\n" +
                    "不共傻瓜论长短。");
            boolean isSuccess = userDaoImpl.addUser(user);
            if (isSuccess) {
                insertNumber++;
            }
        }
        System.out.println("成功添加了 " + insertNumber + " 条数据 ");
    }

    /**
     * 通过用户名和密码登录测试
     */
    @Test
    public void testQueryByUserNameAndPassword() {
        User queryByUserNameAndPassword = userDaoImpl.queryByUserNameAndPassword("fyl", "123456");
        assertNotNull(queryByUserNameAndPassword);
    }

    /**
     * 根据用户名删除用户
     */
    @Test
    public void deleteUser() {
        int deleteNumber = 0;
        for (int i = 31; i < 10030; i++) {
            boolean isSuccess = userDaoImpl.deleteUser("符玉涟" + i);
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
        assertNotNull(allUser);
    }

    @Test
    public void queryByUserName() {
        User user = userDaoImpl.queryByUserName("fyl");
        assertNotNull(user);
    }
}