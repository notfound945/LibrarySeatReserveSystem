package cn.fyl.service.impl;

import cn.fyl.dao.impl.UserDaoImpl;
import cn.fyl.domain.User;
import cn.fyl.service.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fyl
 * Service 实现类
 */
public class ServiceImpl implements Service {

    public ServiceImpl() {
    }

    /**
     * 用户验证业务
     */
    @Override
    public User verify(User user) {
        User tempUser = new User();
        UserDaoImpl userDaoImplement = new UserDaoImpl();
        try {
            tempUser = userDaoImplement.queryByUserNameAndPassword(user.getUserName(), user.getPasswd());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        if (tempUser != null) {
            System.out.println("登录成功");
            return tempUser;
        } else {
            System.out.println("登录失败");
            return null;
        }
    }

    /**
     * 读入文件操作
     * @param path
     * @return
     */
    @Override
    public List<String[]> readFile(String path) {
        List<String[]> list = new ArrayList<String[]>();
        try {
            String encoding = "GBK";
            File file = new File(path);
            if (file.isFile() && file.exists()) {
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;

                while ((lineTxt = bufferedReader.readLine()) != null) {
                    String[] temp = lineTxt.split(",");
                    list.add(temp);
                }
                bufferedReader.close();
                read.close();
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return list;
    }
}
