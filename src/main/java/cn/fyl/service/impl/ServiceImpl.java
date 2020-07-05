package cn.fyl.service.impl;

import cn.fyl.dao.impl.AdminDaoImpl;
import cn.fyl.dao.impl.UserDaoImpl;
import cn.fyl.domain.Admin;
import cn.fyl.domain.User;
import cn.fyl.service.Service;

import java.io.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author fyl
 * Service 实现类
 */
public class ServiceImpl implements Service {

    public ServiceImpl() {
    }

    /**
     * 普通用户验证业务
     */
    @Override
    public User verify(User user) {
        User tempUser = new User();
        UserDaoImpl userDaoImplement = new UserDaoImpl();
        tempUser = userDaoImplement.queryByUserNameAndPassword(user.getUserName(), user.getPasswd());
        if (tempUser != null) {
            System.out.println("登录成功");
            return tempUser;
        } else {
            System.out.println("登录失败");
            return null;
        }
    }

    /**
     *
     */
    public Admin verify(Admin admin) {
        Admin tempAdmin = new Admin();
        AdminDaoImpl adminDaoImpl = new AdminDaoImpl();
        tempAdmin = adminDaoImpl.queryByUserNameAndPassword(admin.getUserName(), admin.getPassword());
        if (tempAdmin != null) {
            return tempAdmin;
        } else {
            return null;
        }
    }


    /**
     * 读入文件数据
     * @param path
     */
    public void readFileByRandomAccess(String path, String userName) {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        String week = new SimpleDateFormat("EEEE").format(new Date());
        try {
            File file = new File(path);
            String line;
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            System.out.println("登录日志：");
            while (randomAccessFile.getFilePointer() < randomAccessFile.length()) {
                line = randomAccessFile.readLine();
                System.out.println(line);
            }
            randomAccessFile.writeBytes(System.lineSeparator());
            String newLine = date + " - " + time  + " - " + week + " - " + userName;
            randomAccessFile.writeUTF(newLine);
            randomAccessFile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
                    String[] temp = lineTxt.split("/t");
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
