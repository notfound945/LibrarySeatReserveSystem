/*
 * Created by JFormDesigner on Sun Jul 05 17:24:27 CST 2020
 */

package cn.fyl.view.mainview.admin;

import cn.fyl.dao.impl.UserDaoImpl;
import cn.fyl.domain.Admin;
import cn.fyl.domain.User;
import cn.fyl.service.impl.ServiceImpl;
import cn.fyl.view.dialog.ProxyOkDialog;
import cn.fyl.view.login.LoginView;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/**
 * @author fyl
 */
public class MainViewAdmin extends JFrame {
    private UserDaoImpl userDaoImpl = new UserDaoImpl();
    private ServiceImpl serviceImpl = new ServiceImpl();
    HashMap<Integer, User> allUser = new HashMap<>();
    private int selectNo = -1;
    private Admin admin;

    public MainViewAdmin(Admin admin) {
        initComponents();
        this.admin = admin;
        init();
    }

    /**
     * 组件数据初始化
     */
    private void init() {
        serviceImpl.writeLogFile("src/main/resources/loginLog.txt", this.admin.getUserName());
        loadAllUser();
        loadLoginLog();
    }

    /**
     * 从本地文件中获取登录日志
     */
    private void loadLoginLog() {
        System.out.println("处理日志文件 ");
        List<String[]> logFile = serviceImpl.readLogFile("src/main/resources/loginLog.txt");
    }

    /**
     * 获取所有用户信息
     */
    private void loadAllUser() {
        allUser.clear();
        allUser = userDaoImpl.getAll();
        int length = allUser.size();
        String[] data = new String[length];
        this.titleLabel.setText(String.format("%-16s", "用户ID") + String.format("%-16s", "姓名") + String.format("%-16s", "用户名") + String.format("%-16s", "性别") + String.format("%-16s", "年龄") + String.format("%-16s", "手机号"));
        for (int i = 0; i < length; i++) {
            data[i] = String.format("%-16s", allUser.get(i).getId()) + String.format("%-16s", allUser.get(i).getName()) + String.format("%-16s", allUser.get(i).getUserName()) + String.format("%-16s", allUser.get(i).getSex()) + String.format("%-16s", allUser.get(i).getAge() + String.format("%20s", allUser.get(i).getPhone()));
        }
        this.userList.setModel(new AbstractListModel<String>() {
            String[] values = data;

            @Override
            public int getSize() {
                return values.length;
            }

            @Override
            public String getElementAt(int i) {
                return values[i];
            }
        });
        this.totalNumber.setText("当前共有 " + allUser.size() + " 名用户");
    }

    /**
     * 删除用户
     *
     * @param e
     */
    private void deleteButtonMouseReleased(MouseEvent e) {
        if (this.selectNo >= 0) {
            String userName = allUser.get(this.selectNo).getUserName();
            boolean isSuccess = this.userDaoImpl.deleteUser(userName);
            if (isSuccess) {
                new ProxyOkDialog(this, "操作成功", "删除成功", "删除用户 " + userName + " 成功", "").setVisible(true);
                loadAllUser();
            } else {
                new ProxyOkDialog(this, "操作失败", "删除失败", "删除用户 " + userName + " 失败", userName + "用户不存在，可能已经被删除。").setVisible(true);
            }
        } else {
            new ProxyOkDialog(this, "请选择", "删除失败", "你没有选择任何用户", "请选择用户后再进行删除").setVisible(true);
        }
    }

    private void cancelButtonMouseReleased(MouseEvent e) {
        System.exit(0);
    }

    private void switchUserButtonMouseReleased(MouseEvent e) {
        this.admin = null;
        dispose();
        new LoginView().setVisible(true);
    }

    private void userListValueChanged(ListSelectionEvent e) {
        this.selectNo = this.userList.getSelectedIndex();
    }

    private void refreshMouseReleased(MouseEvent e) {
        loadAllUser();
    }

    private void clearLogFileMouseReleased(MouseEvent e) {
        File logFile = new File("src/main/resources/loginLog.txt");
        File fylFile = new File("src/main/resources/fyl_log.txt");
        if (logFile.isFile() || fylFile.isFile()) {
            logFile.delete();
            fylFile.delete();
            new ProxyOkDialog(this, "日志删除成功", "日志清除成功", "日志文件清除成功", "").setVisible(true);
        } else {
            new ProxyOkDialog(this, "日志删除失败", "日志清除失败", "日志文件清除失败", "日志文件不存在，可能已被删除。").setVisible(true);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - notfound
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        tabbedPane2 = new JTabbedPane();
        panel2 = new JPanel();
        titleLabel = new JLabel();
        deleteButton = new JButton();
        refresh = new JButton();
        scrollPane1 = new JScrollPane();
        userList = new JList<>();
        totalNumber = new JLabel();
        buttonBar = new JPanel();
        clearLogFile = new JButton();
        switchUserButton = new JButton();
        exitButton = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("\u56fe\u4e66\u9986\u5ea7\u4f4d\u9884\u5b9a\u7cfb\u7edf-\u7ba1\u7406\u7aef");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.
                    swing.border.EmptyBorder(0, 0, 0, 0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax.swing.border
                    .TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dia\u006cog"
                    , java.awt.Font.BOLD, 12), java.awt.Color.red), dialogPane.getBorder
                    ()));
            dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                @Override
                public void propertyChange(java
                                                   .beans.PropertyChangeEvent e) {
                    if ("bord\u0065r".equals(e.getPropertyName())) throw new RuntimeException
                            ();
                }
            });
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new MigLayout(
                        "fill,insets dialog,hidemode 3",
                        // columns
                        "[fill]",
                        // rows
                        "[]"));

                //======== tabbedPane1 ========
                {
                    tabbedPane1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));

                    //======== panel1 ========
                    {
                        panel1.setLayout(new MigLayout(
                                "fill,hidemode 3",
                                // columns
                                "[fill]" +
                                        "[fill]",
                                // rows
                                "[]" +
                                        "[]" +
                                        "[]" +
                                        "[]" +
                                        "[]" +
                                        "[]" +
                                        "[]"));

                        //======== tabbedPane2 ========
                        {
                            tabbedPane2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));

                            //======== panel2 ========
                            {
                                panel2.setLayout(new MigLayout(
                                        "hidemode 3",
                                        // columns
                                        "[fill]" +
                                                "[fill]" +
                                                "[fill]" +
                                                "[fill]",
                                        // rows
                                        "[]" +
                                                "[]" +
                                                "[]" +
                                                "[]" +
                                                "[]"));

                                //---- titleLabel ----
                                titleLabel.setText("\u7528\u6237ID    -    \u7528\u6237\u540d    -     \u59d3\u540d    -    \u6027\u522b    -    \u5e74\u9f84");
                                titleLabel.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel2.add(titleLabel, "cell 0 0");

                                //---- deleteButton ----
                                deleteButton.setText("\u5220\u9664\u7528\u6237");
                                deleteButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                deleteButton.addMouseListener(new MouseAdapter() {
                                    @Override
                                    public void mouseReleased(MouseEvent e) {
                                        deleteButtonMouseReleased(e);
                                    }
                                });
                                panel2.add(deleteButton, "cell 1 0");

                                //---- refresh ----
                                refresh.setText("\u5237\u65b0");
                                refresh.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                refresh.addMouseListener(new MouseAdapter() {
                                    @Override
                                    public void mouseReleased(MouseEvent e) {
                                        refreshMouseReleased(e);
                                    }
                                });
                                panel2.add(refresh, "cell 3 0");

                                //======== scrollPane1 ========
                                {

                                    //---- userList ----
                                    userList.setModel(new AbstractListModel<String>() {
                                        String[] values = {
                                                "\u7b26\u7389\u6d9f20031",
                                                "fyl",
                                                "\u7b26\u7389\u6d9f20032",
                                                "\u7b26\u7389\u6d9f20054",
                                                "\u7b26\u7389\u6d9f20034",
                                                "\u7b26\u7389\u6d9f200245",
                                                "\u7b26\u7389\u6d9f20031",
                                                "\u7b26\u7389\u6d9f20032",
                                                "\u7b26\u7389\u6d9f20054",
                                                "\u7b26\u7389\u6d9f20034",
                                                "\u7b26\u7389\u6d9f200245"
                                        };

                                        @Override
                                        public int getSize() {
                                            return values.length;
                                        }

                                        @Override
                                        public String getElementAt(int i) {
                                            return values[i];
                                        }
                                    });
                                    userList.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                    userList.addListSelectionListener(e -> userListValueChanged(e));
                                    scrollPane1.setViewportView(userList);
                                }
                                panel2.add(scrollPane1, "cell 0 2 4 1,dock center");

                                //---- totalNumber ----
                                totalNumber.setText("\u5171\u6709 100 \u540d\u7528\u6237");
                                totalNumber.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                                panel2.add(totalNumber, "cell 0 4");
                            }
                            tabbedPane2.addTab("\u6240\u6709\u7528\u6237", panel2);
                        }
                        panel1.add(tabbedPane2, "cell 0 0,dock center");
                    }
                    tabbedPane1.addTab("\u7528\u6237\u7ba1\u7406", panel1);
                }
                contentPanel.add(tabbedPane1, "cell 0 0");
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setLayout(new MigLayout(
                        "insets dialog,alignx right",
                        // columns
                        "[fill]" +
                                "[button,fill]" +
                                "[button,fill]",
                        // rows
                        null));

                //---- clearLogFile ----
                clearLogFile.setText("\u6e05\u9664\u65e5\u5fd7");
                clearLogFile.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                clearLogFile.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        clearLogFileMouseReleased(e);
                    }
                });
                buttonBar.add(clearLogFile, "cell 0 0");

                //---- switchUserButton ----
                switchUserButton.setText("\u5207\u6362\u7528\u6237");
                switchUserButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                switchUserButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        switchUserButtonMouseReleased(e);
                    }
                });
                buttonBar.add(switchUserButton, "cell 1 0");

                //---- exitButton ----
                exitButton.setText("\u9000\u51fa");
                exitButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                exitButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        cancelButtonMouseReleased(e);
                    }
                });
                buttonBar.add(exitButton, "cell 2 0");
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(1000, 600);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - notfound
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTabbedPane tabbedPane2;
    private JPanel panel2;
    private JLabel titleLabel;
    private JButton deleteButton;
    private JButton refresh;
    private JScrollPane scrollPane1;
    private JList<String> userList;
    private JLabel totalNumber;
    private JPanel buttonBar;
    private JButton clearLogFile;
    private JButton switchUserButton;
    private JButton exitButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
