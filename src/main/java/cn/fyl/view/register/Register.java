/*
 * Created by JFormDesigner on Thu Jun 25 16:06:04 CST 2020
 */

package cn.fyl.view.register;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import cn.fyl.dao.UserDao;
import cn.fyl.dao.impl.UserDaoImpl;
import cn.fyl.domain.User;
import cn.fyl.view.dialog.ProxyOkDialog;
import cn.fyl.view.login.LoginView;
import net.miginfocom.swing.*;

/**
 * @author notfound
 */
public class Register extends JFrame {
    private String sex = "保密";
    private ButtonGroup seatButtonGroup = new ButtonGroup();
    private UserDaoImpl userDaoImpl = new UserDaoImpl();
    public Register() {
        initComponents();
        init();
    }
    
    public void init() {
        seatButtonGroup.add(this.serectRadioButton);
        seatButtonGroup.add(this.manRadioButton);
        seatButtonGroup.add(this.womanRadioButton);
    }

    private void cancelButtonMouseReleased(MouseEvent e) {
        this.dispose();
        new LoginView().setVisible(true);
    }

    private void okButtonMouseReleased(MouseEvent e) {
        String userName = this.userNameTextField.getText();
        String name = this.nameTextField.getText();
        ButtonModel selection = this.seatButtonGroup.getSelection();
        int age = this.ageComboBox.getSelectedIndex() + 16;
        String grade = this.gradeTextField.getText();
        String phone = this.phoneTextField.getText();
        String password = this.passwordField.getText();

        if (verify(userName, name, age, sex, password, phone, grade)) {
            User user = new User(userName, name, age, sex, password, phone, grade);
            boolean isSuccess = this.userDaoImpl.addUser(user);
            if (isSuccess) {
                new ProxyOkDialog(this, "添加用户成功", "注册成功", "注册用户 " + userName + " 成功", "你现在可以用你新注册的用户进行登录了。").setVisible(true);
            } else {
                new ProxyOkDialog(this, "添加用户失败", "注册用户失败", "注册用户 " + userName + " 时失败", "可能用户名已被注册").setVisible(true);
            }
        }
    }

    private boolean verify(String userName, String name, int age, String sex, String password, String phone, String grade) {
        if (userName.equals("") || name.equals("") || age == 0 || sex.equals("") || password.equals("") || phone.equals("") || grade.equals("")) {
            new ProxyOkDialog(this, "检验失败", "提交表单不完整", "你提交的注册信息不完整", "请检查后再提交。").setVisible(true);
            return false;
        } else if (phone.length() != 11) {
            new ProxyOkDialog(this, "检验失败", "提交表单信息错误", "你提交的注册信息中手机号填写错误", "请检查后再提交。").setVisible(true);
            return false;
        } else if (!this.passwordField.getText().equals(this.confirmPasswordField.getText())) {
            new ProxyOkDialog(this, "检验失败", "提交表单信息错误", "你提交的注册信息中两次密码不一致", "请检查后再提交。").setVisible(true);
            return false;
        } else {
            this.userNameTextField.setText("");
            this.nameTextField.setText("");
            this.phoneTextField.setText("");
            this.passwordField.setText("");
            this.confirmPasswordField.setText("");
            this.gradeTextField.setText("");
        }
        return true;
    }

    private void serectRadioButtonActionPerformed(ActionEvent e) {
        this.sex = e.getActionCommand();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - notfound
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        nameTextField = new JTextField();
        label3 = new JLabel();
        userNameTextField = new JTextField();
        label9 = new JLabel();
        gradeTextField = new JTextField();
        label8 = new JLabel();
        serectRadioButton = new JRadioButton();
        manRadioButton = new JRadioButton();
        womanRadioButton = new JRadioButton();
        label6 = new JLabel();
        ageComboBox = new JComboBox<>();
        label7 = new JLabel();
        phoneTextField = new JTextField();
        label4 = new JLabel();
        passwordField = new JPasswordField();
        label5 = new JLabel();
        confirmPasswordField = new JPasswordField();
        buttonBar = new JPanel();
        okButton = new JButton();
        returnButton = new JButton();

        //======== this ========
        setTitle("\u6ce8\u518c\u7528\u6237");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
            javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax
            .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
            .awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
            .Color.red),dialogPane. getBorder()));dialogPane. addPropertyChangeListener(new java.beans.
            PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".
            equals(e.getPropertyName()))throw new RuntimeException();}});
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new MigLayout(
                    "fill,insets dialog,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
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
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label1 ----
                label1.setText("\u6ce8\u518c\u7528\u6237");
                label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                contentPanel.add(label1, "cell 2 0 3 1,alignx center,growx 0");

                //---- label2 ----
                label2.setText("\u59d3\u540d");
                label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label2, "cell 2 2");

                //---- nameTextField ----
                nameTextField.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(nameTextField, "cell 4 2");

                //---- label3 ----
                label3.setText("\u7528\u6237\u540d");
                label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label3, "cell 2 3");

                //---- userNameTextField ----
                userNameTextField.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(userNameTextField, "cell 4 3");

                //---- label9 ----
                label9.setText("\u6240\u6709\u9662\u7cfb\u73ed\u7ea7");
                label9.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label9, "cell 2 4");

                //---- gradeTextField ----
                gradeTextField.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(gradeTextField, "cell 4 4");

                //---- label8 ----
                label8.setText("\u6027\u522b");
                label8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label8, "cell 2 5");

                //---- serectRadioButton ----
                serectRadioButton.setText("\u4fdd\u5bc6");
                serectRadioButton.setSelected(true);
                serectRadioButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                serectRadioButton.addActionListener(e -> serectRadioButtonActionPerformed(e));
                contentPanel.add(serectRadioButton, "cell 4 5,alignx center,growx 0");

                //---- manRadioButton ----
                manRadioButton.setText("\u7537");
                manRadioButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                manRadioButton.addActionListener(e -> serectRadioButtonActionPerformed(e));
                contentPanel.add(manRadioButton, "cell 4 5,alignx center,growx 0");

                //---- womanRadioButton ----
                womanRadioButton.setText("\u5973");
                womanRadioButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                womanRadioButton.addActionListener(e -> serectRadioButtonActionPerformed(e));
                contentPanel.add(womanRadioButton, "cell 4 5,alignx center,growx 0");

                //---- label6 ----
                label6.setText("\u5e74\u9f84");
                label6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label6, "cell 2 6");

                //---- ageComboBox ----
                ageComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
                    "16",
                    "17",
                    "18",
                    "19",
                    "20",
                    "21",
                    "22",
                    "23",
                    "24",
                    "25",
                    "26"
                }));
                contentPanel.add(ageComboBox, "cell 4 6");

                //---- label7 ----
                label7.setText("\u624b\u673a\u53f7\u7801");
                label7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label7, "cell 2 7");

                //---- phoneTextField ----
                phoneTextField.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(phoneTextField, "cell 4 7");

                //---- label4 ----
                label4.setText("\u5bc6\u7801");
                label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label4, "cell 2 8");
                contentPanel.add(passwordField, "cell 4 8");

                //---- label5 ----
                label5.setText("\u786e\u8ba4\u5bc6\u7801");
                label5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label5, "cell 2 9");
                contentPanel.add(confirmPasswordField, "cell 4 9");
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setLayout(new MigLayout(
                    "insets dialog,alignx right",
                    // columns
                    "[button,fill]" +
                    "[button,fill]",
                    // rows
                    null));

                //---- okButton ----
                okButton.setText("\u6ce8\u518c");
                okButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                okButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        okButtonMouseReleased(e);
                    }
                });
                buttonBar.add(okButton, "cell 0 0");

                //---- returnButton ----
                returnButton.setText("\u8fd4\u56de\u767b\u5f55");
                returnButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                returnButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        cancelButtonMouseReleased(e);
                    }
                });
                buttonBar.add(returnButton, "cell 1 0");
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(700, 500);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - notfound
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JLabel label2;
    private JTextField nameTextField;
    private JLabel label3;
    private JTextField userNameTextField;
    private JLabel label9;
    private JTextField gradeTextField;
    private JLabel label8;
    private JRadioButton serectRadioButton;
    private JRadioButton manRadioButton;
    private JRadioButton womanRadioButton;
    private JLabel label6;
    private JComboBox<String> ageComboBox;
    private JLabel label7;
    private JTextField phoneTextField;
    private JLabel label4;
    private JPasswordField passwordField;
    private JLabel label5;
    private JPasswordField confirmPasswordField;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton returnButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
