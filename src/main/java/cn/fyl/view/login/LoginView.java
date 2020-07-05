/*
 * Created by JFormDesigner on Wed Jun 24 23:21:14 CST 2020
 */

package cn.fyl.view.login;

import cn.fyl.domain.Admin;
import cn.fyl.domain.User;
import cn.fyl.service.impl.ServiceImpl;
import cn.fyl.view.dialog.ProcessLoading;
import cn.fyl.view.dialog.ProxyOkDialog;
import cn.fyl.view.mainview.admin.MainViewAdmin;
import cn.fyl.view.mainview.student.MainViewStudent;
import cn.fyl.view.register.Register;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.beansbinding.BindingGroup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 * @author notfound
 */
public class LoginView extends JFrame {
    private Admin admin = new Admin();
    private User user = new User();
    private ServiceImpl serviceImpl = new ServiceImpl();
    private ProcessLoading processLoading = new ProcessLoading(this);
    private boolean isAdmin = false;

    public LoginView() {
        initComponents();
    }

    private void button2MouseReleased(MouseEvent e) {
        this.dispose();
        new Register().setVisible(true);
        // TODO add your code here
    }

    /**
     * 表单检查
     *
     * @return
     */
    private boolean check() {
        String userName = userNameTextField.getText();
        String password = passwordField.getText();
        if ("".equals(userName) || "".equals(password)) {
            new ProxyOkDialog(this, "检验不通过", "表单信息不完整", "用户名或密码未填写", "请检查后重试。").setVisible(true);
            return false;
        } else {
            // 判断是否为管理员登录
            if (userName.substring(0, 1).equals("#")) {
                this.isAdmin = true;
            }
            processLoading.setVisible(true);
            if (isAdmin) {
                admin.setUserName(userName);
                admin.setPassword(password);
            } else {
                user.setUserName(userName);
                user.setPasswd(password);
            }
            return true;
        }
    }

    /**
     * 用户验证
     *
     * @return
     */
    private boolean verify() {
        if (check()) {
            User user1 = serviceImpl.verify(user);
            Admin admin1 = serviceImpl.verify(admin);
            if (user1 != null || admin1 != null) {
                user = user1;
                admin = admin1;
                return true;
            } else {
                new ProxyOkDialog(this, "认证失败", "登录失败", "用户名或密码错误", "请核对后重试。").setVisible(true);
                return false;
            }
        }
        return false;
    }

    private void loginButtonMouseReleased(MouseEvent e) {
        Login();
        // TODO add your code here
    }

    /**
     * 登录
     */
    private void Login() {
        if (verify()) {
            if (isAdmin) {
                new ProxyOkDialog(this, "认证通过", "登录成功", "欢迎管理员 " + this.admin.getName(), "").setVisible(true);
                this.dispose();
                new MainViewAdmin(admin).setVisible(true);
            } else {
                new ProxyOkDialog(this, "认证通过", "登录成功", "欢迎 " + this.user.getName(), "").setVisible(true);
                this.dispose();
                new MainViewStudent(user).setVisible(true);
            }
        }
        processLoading.dispose();
    }

    private void registerButtonMouseReleased(MouseEvent e) {
        this.dispose();
        new Register().setVisible(true);
    }

    private void passwordFieldKeyReleased(KeyEvent e) {
        if (e.getKeyCode() == 10) {
            Login();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - notfound
        label1 = new JLabel();
        label2 = new JLabel();
        userNameTextField = new JTextField();
        label3 = new JLabel();
        passwordField = new JPasswordField();
        loginButton = new JButton();
        registerButton = new JButton();

        //======== this ========
        setTitle("\u767b\u5f55\u7cfb\u7edf");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imgs/information.png")).getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[24,fill]" +
            "[20,fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]0" +
            "[fill]0" +
            "[fill]" +
            "[fill]0" +
            "[fill]" +
            "[fill]0" +
            "[fill]" +
            "[fill]0" +
            "[fill]" +
            "[fill]0" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("\u56fe\u4e66\u9986\u5ea7\u4f4d\u9884\u5b9a\u7cfb\u7edf");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
        contentPane.add(label1, "cell 10 1 14 1,alignx center,growx 0");

        //---- label2 ----
        label2.setText("\u7528\u6237\u540d");
        label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
        contentPane.add(label2, "cell 10 3,alignx left,growx 0");

        //---- userNameTextField ----
        userNameTextField.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
        contentPane.add(userNameTextField, "cell 16 3 8 1");

        //---- label3 ----
        label3.setText("\u5bc6\u7801");
        label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
        contentPane.add(label3, "cell 10 5,alignx left,growx 0");

        //---- passwordField ----
        passwordField.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                passwordFieldKeyReleased(e);
            }
        });
        contentPane.add(passwordField, "cell 16 5 8 1");

        //---- loginButton ----
        loginButton.setText("\u767b\u5f55");
        loginButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                loginButtonMouseReleased(e);
            }
        });
        contentPane.add(loginButton, "cell 10 7");

        //---- registerButton ----
        registerButton.setText("\u6ce8\u518c");
        registerButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
        registerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                registerButtonMouseReleased(e);
            }
        });
        contentPane.add(registerButton, "cell 23 7");
        setSize(500, 380);
        setLocationRelativeTo(getOwner());

        //---- bindings ----
        bindingGroup = new BindingGroup();
        bindingGroup.bind();
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - notfound
    private JLabel label1;
    private JLabel label2;
    private JTextField userNameTextField;
    private JLabel label3;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;
    private BindingGroup bindingGroup;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
