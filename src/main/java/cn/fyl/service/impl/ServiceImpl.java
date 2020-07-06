package cn.fyl.service.impl;

import cn.fyl.dao.impl.AdminDaoImpl;
import cn.fyl.dao.impl.UserDaoImpl;
import cn.fyl.domain.Admin;
import cn.fyl.domain.User;
import cn.fyl.service.Service;

import java.io.*;
import java.nio.charset.StandardCharsets;
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
     * @param user 普通用户对象
     */
    @Override
    public User verify(User user) {
        User tempUser = new User();
        UserDaoImpl userDaoImplement = new UserDaoImpl();
        tempUser = userDaoImplement.queryByUserNameAndPassword(user.getUserName(), user.getPasswd());
        if (tempUser != null) {
            return tempUser;
        } else {
            return null;
        }
    }

    /**
     *  验证管理员
     * @param admin 管理员对象
     * @return tempAdmin 管理员
     */
    @Override
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
     * 写入登录日志文件
     * @param path 文件路径
     * @param userName 用户名
     */
    @Override
    public void writeLogFile(String path, String userName) {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        String week = new SimpleDateFormat("EEEE").format(new Date());
        try {
            File file = new File(path);
            String line;
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            while (randomAccessFile.getFilePointer() < randomAccessFile.length()) {
                line = randomAccessFile.readLine();
            }
//            randomAccessFile.writeBytes(System.lineSeparator());
            String newLine = "\n" + date + "\t" + time  + "\t" + week + "\t" + userName;
            randomAccessFile.writeUTF(newLine);
            randomAccessFile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 读入文件数据
     * @param path 文件路径
     */
    public void readFileByRandomAccess(String path) {
        try {
            File file = new File(path);
            String line;
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            System.out.println("登录日志：");
            while (randomAccessFile.getFilePointer() < randomAccessFile.length()) {
                line = randomAccessFile.readLine();
                String output = new String(line.getBytes("ISO-8859-1"), "UTF-8");
                System.out.println(output);
            }
            randomAccessFile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 读取并处理日志文件操作
     * @param path 文件路径
     * @return list List对象
     */
    @Override
    public List<String[]> readLogFile(String path) {
        List<String[]> list = new ArrayList<String[]>();
        try {
            String encoding = "UTF-8";
            File file = new File(path);
            if (file.isFile() && file.exists()) {
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;

                File tempFile = new File("src/main/resources/fyl_log.txt");
                RandomAccessFile randomAccessFile = new RandomAccessFile(tempFile, "rw");
                // 清空已存在文件的内容
                randomAccessFile.setLength(0);
                while (randomAccessFile.getFilePointer() < randomAccessFile.length()) {
                    String line = randomAccessFile.readLine();
                    System.out.println(line);
                }
                // 根据字段判断 输出到新的分类文件
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    System.out.println(lineTxt);
                    String[] temp = lineTxt.split("\t");
                    list.add(temp);
                    if (temp.length == 4) {
                        // 将登录用户名包含为 fyl 的登录日志提取出来
                        if (temp[3].indexOf("fyl") >= 0) {
                            randomAccessFile.writeBytes(System.lineSeparator());
                            String outLine = temp[3] + " \t " + temp[2] + "\t" + temp[1] + "\t" + temp[0];
                            randomAccessFile.writeBytes(outLine);
                        }
                    }
                }
                randomAccessFile.close();
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
