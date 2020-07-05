/*
 * Created by JFormDesigner on Sun Jul 05 17:24:27 CST 2020
 */

package cn.fyl.view.mainview.admin;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.RandomAccessFile;
import javax.swing.*;

import cn.fyl.dao.impl.UserDaoImpl;
import cn.fyl.domain.Admin;
import cn.fyl.view.dialog.ProxyOkDialog;
import net.miginfocom.swing.*;

/**
 * @author notfound
 */
public class MainViewAdmin extends JFrame {
    private UserDaoImpl userDaoImpl = new UserDaoImpl();
    private Admin admin;
    public MainViewAdmin(Admin admin) {
        initComponents();
         this.admin = admin;
    }

    private void deleteButtonMouseReleased(MouseEvent e) {
        String userName = this.userNameTextField.getText();
        boolean isSuccess = this.userDaoImpl.deleteUser(userName);
        if (isSuccess) {
            new ProxyOkDialog(this, "操作成功", "删除成功", "删除用户 " + userName + " 成功", "").setVisible(true);
        } else {
            new ProxyOkDialog(this, "操作失败", "删除失败", "删除用户 " + userName + " 失败", userName + " 用户不存在，可能已经被删除。").setVisible(true);
        }

    }

    private void cancelButtonMouseReleased(MouseEvent e) {
        System.exit(0);
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
        refresh = new JButton();
        scrollPane1 = new JScrollPane();
        userList = new JList<>();
        panel3 = new JPanel();
        label1 = new JLabel();
        userNameTextField = new JTextField();
        deleteButton = new JButton();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("\u56fe\u4e66\u9986\u5ea7\u4f4d\u9884\u5b9a\u7cfb\u7edf-\u7ba1\u7406\u7aef");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
            EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border . TitledBorder. CENTER ,javax . swing
            . border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg", java .awt . Font. BOLD ,12 ) ,
            java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
            { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )
            throw new RuntimeException( ) ;} } );
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
                                    "[fill]",
                                    // rows
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]"));

                                //---- refresh ----
                                refresh.setText("\u5237\u65b0");
                                refresh.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel2.add(refresh, "cell 1 0");

                                //======== scrollPane1 ========
                                {

                                    //---- userList ----
                                    userList.setModel(new AbstractListModel<String>() {
                                        String[] values = {
                                            "fyl",
                                            "\u7b26\u7389\u6d9f20029",
                                            "\u7b26\u7389\u6d9f20030",
                                            "\u7b26\u7389\u6d9f20031",
                                            "\u7b26\u7389\u6d9f20032",
                                            "\u7b26\u7389\u6d9f20054",
                                            "\u7b26\u7389\u6d9f20034",
                                            "\u7b26\u7389\u6d9f200245"
                                        };
                                        @Override
                                        public int getSize() { return values.length; }
                                        @Override
                                        public String getElementAt(int i) { return values[i]; }
                                    });
                                    userList.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                    scrollPane1.setViewportView(userList);
                                }
                                panel2.add(scrollPane1, "cell 0 1,dock center");
                            }
                            tabbedPane2.addTab("\u6240\u6709\u7528\u6237", panel2);

                            //======== panel3 ========
                            {
                                panel3.setLayout(new MigLayout(
                                    "hidemode 3",
                                    // columns
                                    "[fill]" +
                                    "[fill]",
                                    // rows
                                    "[]" +
                                    "[]" +
                                    "[]"));
                            }
                            tabbedPane2.addTab("\u65e5\u5fd7\u7ba1\u7406", panel3);
                        }
                        panel1.add(tabbedPane2, "cell 0 0,dock center");

                        //---- label1 ----
                        label1.setText("\u7528\u6237\u540d\uff1a");
                        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                        panel1.add(label1, "cell 0 6");
                        panel1.add(userNameTextField, "cell 0 6");

                        //---- deleteButton ----
                        deleteButton.setText("\u5220\u9664\u7528\u6237");
                        deleteButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                        deleteButton.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseReleased(MouseEvent e) {
                                deleteButtonMouseReleased(e);
                            }
                        });
                        panel1.add(deleteButton, "cell 0 6");
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
                    "[button,fill]" +
                    "[button,fill]",
                    // rows
                    null));

                //---- okButton ----
                okButton.setText("\u5207\u6362\u7528\u6237");
                okButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                buttonBar.add(okButton, "cell 0 0");

                //---- cancelButton ----
                cancelButton.setText("\u9000\u51fa");
                cancelButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                cancelButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        cancelButtonMouseReleased(e);
                    }
                });
                buttonBar.add(cancelButton, "cell 1 0");
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
    private JButton refresh;
    private JScrollPane scrollPane1;
    private JList<String> userList;
    private JPanel panel3;
    private JLabel label1;
    private JTextField userNameTextField;
    private JButton deleteButton;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
