package cn.fyl.domain;

/**
 * @author fyl
 * User 实体
 */
public class User {
    private int id;
    private String userName;
    private String name;
    private int age;
    private String sex;
    private String passwd;
    private String phone;
    private String grade;

    public User() {
        this.id = 1;
        this.name = "init";
        this.userName = "init";
        this.age = 16;
        this.grade = "init";
        this.passwd = "init";
        this.sex = "保密";
        this.phone = "12345678910";
    }

    public User(int id, String userName, String name, int age, String sex, String passwd, String phone, String grade) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.passwd = passwd;
        this.phone = phone;
        this.grade = grade;
    }

    public User(String userName, String name, int age, String sex, String passwd, String phone, String grade) {
        this.userName = userName;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.passwd = passwd;
        this.phone = phone;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", passwd='" + passwd + '\'' +
                ", phone='" + phone + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
