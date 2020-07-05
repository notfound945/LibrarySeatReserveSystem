package cn.fyl.domain;

/**
 * @author fyl
 * 管理员类
 */
public class Admin {
    private String userName;
    private String name;
    private String password;
    private String phone;
    private String sex;
    private int age;

    public Admin() {
    }

    /**
     * 初始化管理员
     * @param userName 管理员用户名
     * @param name 管理员姓名
     * @param password 管理员密码
     * @param phone 管理员手机号
     * @param sex 管理员性别
     * @param age 管理员年龄
     */
    public Admin(String userName, String name, String password, String phone, String sex, int age) {
        this.userName = userName;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.sex = sex;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
