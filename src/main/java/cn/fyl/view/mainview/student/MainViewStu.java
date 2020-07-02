/*
 * Created by JFormDesigner on Thu Jun 25 12:47:12 CST 2020
 */

package cn.fyl.view.mainview.student;

import cn.fyl.dao.impl.SeatDaoImpl;
import cn.fyl.domain.User;
import cn.fyl.service.impl.ServiceImpl;
import cn.fyl.view.login.LoginView;
import javafx.scene.control.RadioButton;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * @author fyl
 */
public class MainViewStu extends JFrame {
    private ServiceImpl serviceImpl = new ServiceImpl();
    private SeatDaoImpl seatDaoImpl = new SeatDaoImpl();
    private int floor = 1;
    private Timer time;
    private User user;

    public MainViewStu(User user) {
        initComponents();
        // 获取当前登录用户
        this.user = user;
        // 初始化界面标签
        init();
        System.out.println("MainView user" + user);
    }

    /**
     * 初始化组件数据
     */
    private void init() {
        initSeat(this.floor);
        loadTime();
        loadUserInfo();
    }

    /**
     * 根据楼层加载座位
     */
    private void initSeat(int f) {
        resetSelect();
        Component[] components = this.viewSeat.getComponents();
        HashMap<Integer, ArrayList<Integer>> seat = seatDaoImpl.getSeat(f);
        int total = seat.size() * 14;
        int select = 0;
        if (!seat.isEmpty()) {
            for (int k = 0; k < 10; k++) {
                ArrayList<Integer> integers = seat.get(k + 1);
                if (integers != null) {
                    for (int i = k * 14, j = 0; j < integers.size(); i++, j++) {
                        components[i].setEnabled(integers.get(j) == 0);
                        if (integers.get(j) == 0) {
                            select++;
                        }
                    }
                } else {
                    for (int i = k * 14, j = 0; j < 14; i++, j++) {
                        components[i].setEnabled(false);
                    }
                }
            }
        } else {
            for (int k = 0; k < 10; k++) {
                for (int i = k * 14, j = 0; j < 14; i++, j++) {
                    components[i].setEnabled(false);
                }
            }
        }
        seat.clear();
        // 输出楼层座位数量信息
        this.totalNumber.setText(String.valueOf(total));
        this.selectNumber.setText(String.valueOf(select));
    }

    /**
     * 渲染用户数据到组件
     */
    private void loadUserInfo() {
        this.userName.setText(this.user.getUserName());
        this.name.setText(this.user.getName());
        this.sex.setText(this.user.getSex());
        this.age.setText(String.valueOf(this.user.getAge()));
        this.grade.setText(this.user.getGrade());
        this.phone.setText(this.user.getPasswd());
    }

    /**
     * 加载实时时间
     */
    private void loadTime() {
        time = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLabel.setText(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EEEE").format(new Date()));
            }
        });
        time.start();
    }

    private void exitButtonMouseReleased(MouseEvent e) {
        // TODO add your code here
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: add custom component creation code here
    }

    private void switchUserButtonMouseReleased(MouseEvent e) {
        this.dispose();
        this.user = null;
        new LoginView().setVisible(true);
    }

    /**
     * 楼层
     *
     * @param e 事件
     */
    private void floorComboBoxFocusGained(FocusEvent e) {
        System.out.println("楼层获得焦点 刷新 ");
        initSeat(this.floor);
    }

    private void refreshButtonMouseReleased(MouseEvent e) {
        initSeat(this.floor);
    }

    private void floorComboBoxItemStateChanged(ItemEvent e) {
        switch (e.getStateChange()) {
            case ItemEvent.SELECTED:
                System.out.println("选中了 " + e.getItem());
                String f = (String) e.getItem();
                switch (f.substring(3, 4)) {
                    case "一":
                        this.floor = 1;
                        initSeat(this.floor);
                        break;
                    case "二":
                        this.floor = 2;
                        initSeat(this.floor);
                        break;
                    case "三":
                        this.floor = 3;
                        initSeat(this.floor);
                        break;
                    case "四":
                        this.floor = 4;
                        initSeat(this.floor);
                        break;
                    case "五":
                        this.floor = 5;
                        initSeat(this.floor);
                        break;
                }
                break;
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - notfound
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        label49 = new JLabel();
        label50 = new JLabel();
        scrollPane3 = new JScrollPane();
        textArea3 = new JTextArea();
        panel2 = new JPanel();
        tabbedPane3 = new JTabbedPane();
        viewSeat = new JPanel();
        radioButton1 = new JRadioButton();
        radioButton3 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton4 = new JRadioButton();
        radioButton5 = new JRadioButton();
        radioButton6 = new JRadioButton();
        radioButton7 = new JRadioButton();
        radioButton8 = new JRadioButton();
        radioButton9 = new JRadioButton();
        radioButton10 = new JRadioButton();
        radioButton11 = new JRadioButton();
        radioButton12 = new JRadioButton();
        radioButton13 = new JRadioButton();
        radioButton14 = new JRadioButton();
        radioButton15 = new JRadioButton();
        radioButton16 = new JRadioButton();
        radioButton17 = new JRadioButton();
        radioButton18 = new JRadioButton();
        radioButton19 = new JRadioButton();
        radioButton20 = new JRadioButton();
        radioButton21 = new JRadioButton();
        radioButton22 = new JRadioButton();
        radioButton23 = new JRadioButton();
        radioButton24 = new JRadioButton();
        radioButton25 = new JRadioButton();
        radioButton26 = new JRadioButton();
        radioButton27 = new JRadioButton();
        radioButton28 = new JRadioButton();
        radioButton29 = new JRadioButton();
        radioButton30 = new JRadioButton();
        radioButton31 = new JRadioButton();
        radioButton32 = new JRadioButton();
        radioButton33 = new JRadioButton();
        radioButton34 = new JRadioButton();
        radioButton35 = new JRadioButton();
        radioButton36 = new JRadioButton();
        radioButton37 = new JRadioButton();
        radioButton38 = new JRadioButton();
        radioButton39 = new JRadioButton();
        radioButton40 = new JRadioButton();
        radioButton41 = new JRadioButton();
        radioButton42 = new JRadioButton();
        radioButton43 = new JRadioButton();
        radioButton44 = new JRadioButton();
        radioButton45 = new JRadioButton();
        radioButton46 = new JRadioButton();
        radioButton47 = new JRadioButton();
        radioButton48 = new JRadioButton();
        radioButton49 = new JRadioButton();
        radioButton50 = new JRadioButton();
        radioButton51 = new JRadioButton();
        radioButton52 = new JRadioButton();
        radioButton53 = new JRadioButton();
        radioButton54 = new JRadioButton();
        radioButton55 = new JRadioButton();
        radioButton56 = new JRadioButton();
        radioButton57 = new JRadioButton();
        radioButton58 = new JRadioButton();
        radioButton59 = new JRadioButton();
        radioButton60 = new JRadioButton();
        radioButton61 = new JRadioButton();
        radioButton62 = new JRadioButton();
        radioButton63 = new JRadioButton();
        radioButton64 = new JRadioButton();
        radioButton65 = new JRadioButton();
        radioButton66 = new JRadioButton();
        radioButton67 = new JRadioButton();
        radioButton68 = new JRadioButton();
        radioButton69 = new JRadioButton();
        radioButton70 = new JRadioButton();
        radioButton71 = new JRadioButton();
        radioButton72 = new JRadioButton();
        radioButton73 = new JRadioButton();
        radioButton74 = new JRadioButton();
        radioButton75 = new JRadioButton();
        radioButton76 = new JRadioButton();
        radioButton77 = new JRadioButton();
        radioButton78 = new JRadioButton();
        radioButton79 = new JRadioButton();
        radioButton80 = new JRadioButton();
        radioButton81 = new JRadioButton();
        radioButton82 = new JRadioButton();
        radioButton83 = new JRadioButton();
        radioButton84 = new JRadioButton();
        radioButton85 = new JRadioButton();
        radioButton86 = new JRadioButton();
        radioButton87 = new JRadioButton();
        radioButton88 = new JRadioButton();
        radioButton89 = new JRadioButton();
        radioButton90 = new JRadioButton();
        radioButton91 = new JRadioButton();
        radioButton92 = new JRadioButton();
        radioButton93 = new JRadioButton();
        radioButton94 = new JRadioButton();
        radioButton95 = new JRadioButton();
        radioButton96 = new JRadioButton();
        radioButton97 = new JRadioButton();
        radioButton98 = new JRadioButton();
        radioButton99 = new JRadioButton();
        radioButton100 = new JRadioButton();
        radioButton101 = new JRadioButton();
        radioButton102 = new JRadioButton();
        radioButton103 = new JRadioButton();
        radioButton104 = new JRadioButton();
        radioButton105 = new JRadioButton();
        radioButton106 = new JRadioButton();
        radioButton107 = new JRadioButton();
        radioButton108 = new JRadioButton();
        radioButton109 = new JRadioButton();
        radioButton110 = new JRadioButton();
        radioButton111 = new JRadioButton();
        radioButton112 = new JRadioButton();
        radioButton113 = new JRadioButton();
        radioButton114 = new JRadioButton();
        radioButton115 = new JRadioButton();
        radioButton116 = new JRadioButton();
        radioButton117 = new JRadioButton();
        radioButton118 = new JRadioButton();
        radioButton119 = new JRadioButton();
        radioButton120 = new JRadioButton();
        radioButton121 = new JRadioButton();
        radioButton122 = new JRadioButton();
        radioButton123 = new JRadioButton();
        radioButton124 = new JRadioButton();
        radioButton125 = new JRadioButton();
        radioButton126 = new JRadioButton();
        radioButton127 = new JRadioButton();
        radioButton128 = new JRadioButton();
        radioButton129 = new JRadioButton();
        radioButton130 = new JRadioButton();
        radioButton131 = new JRadioButton();
        radioButton132 = new JRadioButton();
        radioButton133 = new JRadioButton();
        radioButton134 = new JRadioButton();
        radioButton135 = new JRadioButton();
        radioButton136 = new JRadioButton();
        radioButton137 = new JRadioButton();
        radioButton138 = new JRadioButton();
        radioButton139 = new JRadioButton();
        radioButton140 = new JRadioButton();
        label17 = new JLabel();
        floorComboBox = new JComboBox<>();
        refreshButton = new JButton();
        button2 = new JButton();
        label46 = new JLabel();
        timeLabel = new JLabel();
        label18 = new JLabel();
        totalNumber = new JLabel();
        label20 = new JLabel();
        selectNumber = new JLabel();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        label25 = new JLabel();
        label26 = new JLabel();
        label27 = new JLabel();
        label28 = new JLabel();
        label29 = new JLabel();
        label30 = new JLabel();
        label41 = new JLabel();
        label42 = new JLabel();
        label43 = new JLabel();
        label44 = new JLabel();
        label45 = new JLabel();
        label31 = new JLabel();
        label32 = new JLabel();
        label33 = new JLabel();
        label34 = new JLabel();
        label35 = new JLabel();
        label36 = new JLabel();
        label37 = new JLabel();
        label38 = new JLabel();
        label39 = new JLabel();
        label40 = new JLabel();
        panel8 = new JPanel();
        label16 = new JLabel();
        scrollPane4 = new JScrollPane();
        list1 = new JList<>();
        label19 = new JLabel();
        scrollPane5 = new JScrollPane();
        textArea4 = new JTextArea();
        panel3 = new JPanel();
        tabbedPane4 = new JTabbedPane();
        panel10 = new JPanel();
        label21 = new JLabel();
        userName = new JLabel();
        label47 = new JLabel();
        name = new JLabel();
        label48 = new JLabel();
        sex = new JLabel();
        label51 = new JLabel();
        age = new JLabel();
        label53 = new JLabel();
        grade = new JLabel();
        label52 = new JLabel();
        phone = new JLabel();
        label54 = new JLabel();
        description = new JLabel();
        panel12 = new JPanel();
        label62 = new JLabel();
        modifyUserName = new JTextField();
        label63 = new JLabel();
        modifyName = new JTextField();
        label64 = new JLabel();
        radioButton141 = new JRadioButton();
        radioButton142 = new JRadioButton();
        radioButton143 = new JRadioButton();
        label65 = new JLabel();
        comboBox1 = new JComboBox<>();
        label68 = new JLabel();
        modifyGrade = new JTextField();
        label66 = new JLabel();
        textField7 = new JTextField();
        label67 = new JLabel();
        textField8 = new JTextField();
        button1 = new JButton();
        label69 = new JLabel();
        scrollPane6 = new JScrollPane();
        textArea5 = new JTextArea();
        panel4 = new JPanel();
        tabbedPane2 = new JTabbedPane();
        panel5 = new JPanel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        panel6 = new JPanel();
        label1 = new JLabel();
        label3 = new JLabel();
        label2 = new JLabel();
        label4 = new JLabel();
        label6 = new JLabel();
        label9 = new JLabel();
        label5 = new JLabel();
        label8 = new JLabel();
        label7 = new JLabel();
        label10 = new JLabel();
        panel7 = new JPanel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        buttonBar = new JPanel();
        switchUserButton = new JButton();
        exitButton = new JButton();

        //======== this ========
        setTitle("\u56fe\u4e66\u9986\u5ea7\u4f4d\u9884\u5b9a\u7cfb\u7edf-\u5b66\u751f\u7aef V1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0
            ,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM
            ,new java.awt.Font("D\u0069al\u006fg",java.awt.Font.BOLD,12),java.awt.Color.red),
            dialogPane. getBorder()));dialogPane. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
            ){if("\u0062or\u0064er".equals(e.getPropertyName()))throw new RuntimeException();}});
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new MigLayout(
                    "fillx,insets dialog,hidemode 3",
                    // columns
                    "[fill]",
                    // rows
                    "[]"));

                //======== tabbedPane1 ========
                {
                    tabbedPane1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));

                    //======== panel1 ========
                    {
                        panel1.setLayout(new MigLayout(
                            "fillx,hidemode 3",
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
                            "[]" +
                            "[]" +
                            "[]" +
                            "[]" +
                            "[]" +
                            "[]"));

                        //---- label49 ----
                        label49.setText("\u672c\u9986\u516c\u793a");
                        label49.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 30));
                        panel1.add(label49, "cell 0 1 26 1,alignx center,growx 0");

                        //---- label50 ----
                        label50.setText("2020-06-11");
                        panel1.add(label50, "cell 0 2 26 1,alignx center,growx 0");

                        //======== scrollPane3 ========
                        {

                            //---- textArea3 ----
                            textArea3.setText("     \u75ab\u60c5\u5c31\u662f\u547d\u4ee4\uff0c\u9632\u63a7\u5c31\u662f\u8d23\u4efb\u3002\u5f20\u5bb6\u754c\u6821\u533a\u56fe\u4e66\u9986\u4fe1\u606f\u6280\u672f\u90e8\u5168\u4f53\u5de5\u4f5c\u4eba\u5458\u575a\u51b3\u843d\u5b9e\u5b66\u6821\u5173\u4e8e\u65b0\u578b\u51a0\u72b6\u75c5\u6bd2\u80ba\u708e\u75ab\u60c5\u9632\u63a7\u5de5\u4f5c\u90e8\u7f72\uff0c\u4ee5\u53ca\u56fe\u4e66\u9986\u7684\u5177\u4f53\u5de5\u4f5c\u5b89\u6392\uff0c\u5171\u514b\u65f6\u8270\uff0c\u79d1\u5b66\u9632\u63a7\uff0c\u540c\u65f6\u9075\u4ece\u201c\u505c\u8bfe\u4e0d\u505c\u5b66\uff0c\u95ed\u9986\u4e0d\u505c\u5de5\u201d\u7684\u5b97\u65e8\u3002\u5728\u75ab\u60c5\u671f\u95f4\uff0c\u4e25\u6293\u843d\u5b9e\uff0c\u63d0\u524d\u9884\u9632\uff0c\u5728\u4fdd\u969c\u5b89\u5168\u7684\u540c\u65f6\u5c3d\u6700\u5927\u53ef\u80fd\u4e3a\u8bfb\u8005\u63d0\u4f9b\u4fe1\u606f\u670d\u52a1\u3002\n\n     \u6839\u636e\u5b66\u6821\u8981\u6c42\uff0c\u5728\u56fe\u4e66\u9986\u7684\u7edf\u4e00\u90e8\u7f72\u4e0b\uff0c\u5f20\u5bb6\u754c\u6821\u533a\u56fe\u4e66\u9986\u4fe1\u606f\u6280\u672f\u90e8\u5168\u4f53\u5de5\u4f5c\u4eba\u5458\u505a\u5230\u4e86\u5c3d\u91cf\u5c11\u51fa\u95e8\uff0c\u5c3d\u91cf\u5c11\u805a\u4f1a\uff0c\u5e76\u6bcf\u5929\u5c31\u81ea\u8eab\u8eab\u4f53\u72b6\u51b5\u5b9e\u884c0\u62a5\u544a2\u6b21\uff0c\u5bf9\u4e8e\u6682\u5c45\u5916\u5730\u7684\u5de5\u4f5c\u4eba\u5458\uff0c\u4e25\u683c\u9075\u5b88\u5b66\u6821\u76f8\u5173\u89c4\u5b9a\uff0c\u5b9e\u884c\u672c\u4eba\u7533\u8bf7\uff0c\u56fe\u4e66\u9986\u53ca\u5b66\u6821\u5c42\u5c42\u5ba1\u6279\u7684\u5236\u5ea6\u3002\u515a\u5458\u5145\u5206\u53d1\u6325\u5148\u950b\u6a21\u8303\u4f5c\u7528\uff0c\u4e0d\u4fe1\u8c23\uff0c\u4e0d\u4f20\u8c23\uff0c\u4ee4\u884c\u7981\u6b62\uff0c\u5728\u9632\u75ab\u5de5\u4f5c\u4e2d\u52c7\u6311\u91cd\u62c5\uff0c\u79ef\u6781\u4f20\u64ad\u6b63\u80fd\u91cf\u548c\u79d1\u5b66\u9632\u62a4\u63aa\u65bd\u3002\u6309\u7167\u5b66\u6821\u8981\u6c42\u4e0a\u73ed\u540e\uff0c\u6bcf\u5929\u575a\u6301\u81ea\u6d4b\u4f53\u6e29\u5e76\u767b\u8bb0\u5165\u9986\uff0c\u540c\u65f6\u4fdd\u6301\u5ba4\u5185\u6e05\u6d01\u548c\u7a7a\u6c14\u6d41\u901a\u3002\n\n     \u75ab\u60c5\u671f\u95f4\uff0c\u5168\u4f53\u5de5\u4f5c\u4eba\u5458\u5c3d\u6700\u5927\u52aa\u529b\u4e3a\u8bfb\u8005\u63d0\u4f9b\u4fe1\u606f\u670d\u52a1\uff0c\u8fdb\u884c\u8bfe\u9898\u8ddf\u8e2a\u670d\u52a12\u9879\uff0c\u4e3a\u8bfb\u8005\u8fdc\u7a0b\u63a8\u9001\u6587\u732e300\u4f59\u7bc7\u3002\u901a\u8fc7QQ\u7fa4\uff0c\u5fae\u4fe1\u7fa4\u53ca\u65f6\u5411\u5e08\u751f\u8bfb\u8005\u53d1\u9001\u76f8\u5173\u6570\u636e\u5e93\u514d\u8d39\u670d\u52a1\u901a\u77e5\u3001\u5728\u7ebf\u8f85\u5bfc\u901a\u77e5\u7b49\u3002\u540c\u65f6\uff0c\u5c06\u4e2a\u4eba\u77e5\u7f51\u6f2b\u6e38\u8d26\u6237\u63d0\u4f9b\u7ed9\u6025\u9700\u7684\u8bfb\u8005\u4f7f\u7528\u3002\u5b8c\u6210\u672c\u79d1\u6bd5\u4e1a\u751f\u8bba\u6587\u67e5\u91cd490\u7bc7\u3002\u79ef\u6781\u7b79\u5907\u6bd5\u4e1a\u751f\u7535\u5b50\u79bb\u6821\u5de5\u4f5c\uff0c\u4fdd\u969c\u7f51\u7edc\u901a\u7545\uff0c\u5c06\u6821\u533a\u5404\u4e2a\u5b66\u9662300\u4f59\u540d\u8bfb\u8005\u7684\u6b20\u4e66\u60c5\u51b5\u8fdb\u884c\u4e86\u5177\u4f53\u7edf\u8ba1\uff0c\u5e76\u53ca\u65f6\u4f20\u9012\u7ed9\u6821\u533a\u5404\u4e2a\u5b66\u9662\u3002\u4e3a\u4e86\u4fdd\u969c\u5b89\u5168\u3001\u907f\u514d\u62e5\u6324\u3001\u7b80\u5316\u7a0b\u5e8f\uff0c\u63d0\u524d\u5bf9\u76f8\u5173\u56fe\u4e66\u8d85\u671f\u8fdb\u884c\u5904\u7406600\u4f59\u6761\u3002\u53e6\u5916\uff0c\u6839\u636e\u5b66\u6821\u5b89\u6392\uff0c\u76f8\u5173\u4eba\u5458\u53c2\u4e0e\u5b8c\u6210\u4e86\u56fe\u60c5\u4e13\u7855\u7684\u7ebf\u4e0a\u590d\u8bd5\u3001\u9762\u8bd5\u5de5\u4f5c\uff0c\u6309\u8d28\u6309\u91cf\u5b8c\u6210\u4e86\u56fe\u60c5\u4e13\u4e1a\u7855\u58eb\u7684\u7ebf\u4e0a\u6559\u5b66\u5de5\u4f5c36\u8bfe\u65f6\uff0c\u7ebf\u4e0a\u6307\u5bfc\u7814\u7a76\u751f\u67e5\u9605\u76f8\u5173\u8d44\u659910\u4f59\u6b21\u3002\n\n    \u540c\u65f6\u5229\u7528\u75ab\u60c5\u671f\u95f4\u4e2a\u4eba\u65f6\u95f4\u76f8\u5bf9\u8f83\u591a\u7684\u673a\u4f1a\uff0c\u5f20\u5bb6\u754c\u6821\u533a\u56fe\u4e66\u9986\u4fe1\u606f\u6280\u672f\u90e8\u76f8\u5173\u4eba\u5458\u79ef\u6781\u64b0\u5199\u5e76\u53d1\u8868\u8bba\u6587\uff0c\u7533\u62a5\u56fd\u5bb6\u7ea7\u8bfe\u98981\u9879\uff0c\u4ee5\u826f\u597d\u7c7b\u7b49\u7ea7\u7ed3\u9898\u7701\u7ea7\u8bfe\u98981\u9879\u3002\n\n     \u540c\u5fc3\u534f\u529b\u6218\u75ab\u60c5\uff0c\u4fe1\u606f\u670d\u52a1\u4e0d\u505c\u6b47\uff0c\u6211\u4eec\u5c06\u7ee7\u7eed\u575a\u5b88\u5c97\u4f4d\uff0c\u7262\u8bb0\u4f7f\u547d\uff0c\u4e0d\u5fd8\u521d\u5fc3\uff0c\u5145\u5206\u53d1\u6325\u4fe1\u606f\u670d\u52a1\u8005\u7684\u4f18\u52bf\uff0c\u4f20\u64ad\u6b63\u80fd\u91cf\uff0c\u4f20\u9012\u65b0\u77e5\u8bc6\u3002\uff08\u6587\uff1a\u8c2d\u51ef\u6ce2\uff09");
                            textArea3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
                            textArea3.setEditable(false);
                            textArea3.setLineWrap(true);
                            scrollPane3.setViewportView(textArea3);
                        }
                        panel1.add(scrollPane3, "cell 0 4 26 12,dock center");
                    }
                    tabbedPane1.addTab("\u6b22\u8fce", panel1);

                    //======== panel2 ========
                    {
                        panel2.setLayout(new MigLayout(
                            "fillx,hidemode 3",
                            // columns
                            "[fill]",
                            // rows
                            "[]"));

                        //======== tabbedPane3 ========
                        {
                            tabbedPane3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));

                            //======== viewSeat ========
                            {
                                viewSeat.setLayout(new MigLayout(
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

                                //---- radioButton1 ----
                                radioButton1.setEnabled(false);
                                radioButton1.setText("A1");
                                viewSeat.add(radioButton1, "cell 1 6,alignx center,growx 0");

                                //---- radioButton3 ----
                                radioButton3.setText("C1");
                                viewSeat.add(radioButton3, "cell 4 6,alignx center,growx 0");

                                //---- radioButton2 ----
                                radioButton2.setText("B1");
                                viewSeat.add(radioButton2, "cell 3 6,alignx center,growx 0");

                                //---- radioButton4 ----
                                radioButton4.setText("D1");
                                viewSeat.add(radioButton4, "cell 6 6,alignx center,growx 0");

                                //---- radioButton5 ----
                                radioButton5.setText("E1");
                                viewSeat.add(radioButton5, "cell 7 6,alignx center,growx 0");

                                //---- radioButton6 ----
                                radioButton6.setText("F1");
                                viewSeat.add(radioButton6, "cell 8 6,alignx center,growx 0");

                                //---- radioButton7 ----
                                radioButton7.setText("G1");
                                viewSeat.add(radioButton7, "cell 10 6,alignx center,growx 0");

                                //---- radioButton8 ----
                                radioButton8.setText("H1");
                                viewSeat.add(radioButton8, "cell 11 6,alignx center,growx 0");

                                //---- radioButton9 ----
                                radioButton9.setText("I1");
                                viewSeat.add(radioButton9, "cell 12 6,alignx center,growx 0");

                                //---- radioButton10 ----
                                radioButton10.setText("J1");
                                viewSeat.add(radioButton10, "cell 14 6,alignx center,growx 0");

                                //---- radioButton11 ----
                                radioButton11.setText("K1");
                                viewSeat.add(radioButton11, "cell 15 6,alignx center,growx 0");

                                //---- radioButton12 ----
                                radioButton12.setText("L1");
                                viewSeat.add(radioButton12, "cell 16 6,alignx center,growx 0");

                                //---- radioButton13 ----
                                radioButton13.setText("M1");
                                viewSeat.add(radioButton13, "cell 18 6,alignx center,growx 0");

                                //---- radioButton14 ----
                                radioButton14.setText("N1");
                                viewSeat.add(radioButton14, "cell 19 6,alignx center,growx 0");

                                //---- radioButton15 ----
                                radioButton15.setText("A2");
                                viewSeat.add(radioButton15, "cell 1 7,alignx center,growx 0");

                                //---- radioButton16 ----
                                radioButton16.setText("B2");
                                viewSeat.add(radioButton16, "cell 3 7,alignx center,growx 0");

                                //---- radioButton17 ----
                                radioButton17.setText("C2");
                                viewSeat.add(radioButton17, "cell 4 7,alignx center,growx 0");

                                //---- radioButton18 ----
                                radioButton18.setText("D2");
                                viewSeat.add(radioButton18, "cell 6 7,alignx center,growx 0");

                                //---- radioButton19 ----
                                radioButton19.setText("E2");
                                viewSeat.add(radioButton19, "cell 7 7,alignx center,growx 0");

                                //---- radioButton20 ----
                                radioButton20.setText("F2");
                                viewSeat.add(radioButton20, "cell 8 7,alignx center,growx 0");

                                //---- radioButton21 ----
                                radioButton21.setText("G2");
                                viewSeat.add(radioButton21, "cell 10 7,alignx center,growx 0");

                                //---- radioButton22 ----
                                radioButton22.setText("H2");
                                viewSeat.add(radioButton22, "cell 11 7,alignx center,growx 0");

                                //---- radioButton23 ----
                                radioButton23.setText("I2");
                                viewSeat.add(radioButton23, "cell 12 7,alignx center,growx 0");

                                //---- radioButton24 ----
                                radioButton24.setText("J2");
                                viewSeat.add(radioButton24, "cell 14 7,alignx center,growx 0");

                                //---- radioButton25 ----
                                radioButton25.setText("K2");
                                viewSeat.add(radioButton25, "cell 15 7,alignx center,growx 0");

                                //---- radioButton26 ----
                                radioButton26.setText("L2");
                                viewSeat.add(radioButton26, "cell 16 7,alignx center,growx 0");

                                //---- radioButton27 ----
                                radioButton27.setText("M2");
                                viewSeat.add(radioButton27, "cell 18 7,alignx center,growx 0");

                                //---- radioButton28 ----
                                radioButton28.setText("N2");
                                viewSeat.add(radioButton28, "cell 19 7,alignx center,growx 0");

                                //---- radioButton29 ----
                                radioButton29.setText("A3");
                                viewSeat.add(radioButton29, "cell 1 9,alignx center,growx 0");

                                //---- radioButton30 ----
                                radioButton30.setText("B3");
                                viewSeat.add(radioButton30, "cell 3 9,alignx center,growx 0");

                                //---- radioButton31 ----
                                radioButton31.setText("C3");
                                viewSeat.add(radioButton31, "cell 4 9,alignx center,growx 0");

                                //---- radioButton32 ----
                                radioButton32.setText("D3");
                                viewSeat.add(radioButton32, "cell 6 9,alignx center,growx 0");

                                //---- radioButton33 ----
                                radioButton33.setText("E3");
                                viewSeat.add(radioButton33, "cell 7 9,alignx center,growx 0");

                                //---- radioButton34 ----
                                radioButton34.setText("F3");
                                viewSeat.add(radioButton34, "cell 8 9,alignx center,growx 0");

                                //---- radioButton35 ----
                                radioButton35.setText("G3");
                                viewSeat.add(radioButton35, "cell 10 9,alignx center,growx 0");

                                //---- radioButton36 ----
                                radioButton36.setText("H3");
                                viewSeat.add(radioButton36, "cell 11 9,alignx center,growx 0");

                                //---- radioButton37 ----
                                radioButton37.setText("I3");
                                viewSeat.add(radioButton37, "cell 12 9,alignx center,growx 0");

                                //---- radioButton38 ----
                                radioButton38.setText("J3");
                                viewSeat.add(radioButton38, "cell 14 9,alignx center,growx 0");

                                //---- radioButton39 ----
                                radioButton39.setText("K3");
                                viewSeat.add(radioButton39, "cell 15 9,alignx center,growx 0");

                                //---- radioButton40 ----
                                radioButton40.setText("L3");
                                viewSeat.add(radioButton40, "cell 16 9,alignx center,growx 0");

                                //---- radioButton41 ----
                                radioButton41.setText("M3");
                                viewSeat.add(radioButton41, "cell 18 9,alignx center,growx 0");

                                //---- radioButton42 ----
                                radioButton42.setText("N3");
                                viewSeat.add(radioButton42, "cell 19 9,alignx center,growx 0");

                                //---- radioButton43 ----
                                radioButton43.setText("A4");
                                viewSeat.add(radioButton43, "cell 1 10,alignx center,growx 0");

                                //---- radioButton44 ----
                                radioButton44.setText("B4");
                                viewSeat.add(radioButton44, "cell 3 10,alignx center,growx 0");

                                //---- radioButton45 ----
                                radioButton45.setText("C4");
                                viewSeat.add(radioButton45, "cell 4 10,alignx center,growx 0");

                                //---- radioButton46 ----
                                radioButton46.setText("D4");
                                viewSeat.add(radioButton46, "cell 6 10,alignx center,growx 0");

                                //---- radioButton47 ----
                                radioButton47.setText("E4");
                                viewSeat.add(radioButton47, "cell 7 10,alignx center,growx 0");

                                //---- radioButton48 ----
                                radioButton48.setText("F4");
                                viewSeat.add(radioButton48, "cell 8 10,alignx center,growx 0");

                                //---- radioButton49 ----
                                radioButton49.setText("G4");
                                viewSeat.add(radioButton49, "cell 10 10,alignx center,growx 0");

                                //---- radioButton50 ----
                                radioButton50.setText("H4");
                                viewSeat.add(radioButton50, "cell 11 10,alignx center,growx 0");

                                //---- radioButton51 ----
                                radioButton51.setText("I4");
                                viewSeat.add(radioButton51, "cell 12 10,alignx center,growx 0");

                                //---- radioButton52 ----
                                radioButton52.setText("J4");
                                viewSeat.add(radioButton52, "cell 14 10,alignx center,growx 0");

                                //---- radioButton53 ----
                                radioButton53.setText("K4");
                                viewSeat.add(radioButton53, "cell 15 10,alignx center,growx 0");

                                //---- radioButton54 ----
                                radioButton54.setText("L4");
                                viewSeat.add(radioButton54, "cell 16 10,alignx center,growx 0");

                                //---- radioButton55 ----
                                radioButton55.setText("M4");
                                viewSeat.add(radioButton55, "cell 18 10,alignx center,growx 0");

                                //---- radioButton56 ----
                                radioButton56.setText("N4");
                                viewSeat.add(radioButton56, "cell 19 10,alignx center,growx 0");

                                //---- radioButton57 ----
                                radioButton57.setText("A5");
                                viewSeat.add(radioButton57, "cell 1 12,alignx center,growx 0");

                                //---- radioButton58 ----
                                radioButton58.setText("B5");
                                viewSeat.add(radioButton58, "cell 3 12,alignx center,growx 0");

                                //---- radioButton59 ----
                                radioButton59.setText("C5");
                                viewSeat.add(radioButton59, "cell 4 12,alignx center,growx 0");

                                //---- radioButton60 ----
                                radioButton60.setText("D5");
                                viewSeat.add(radioButton60, "cell 6 12,alignx center,growx 0");

                                //---- radioButton61 ----
                                radioButton61.setText("E5");
                                viewSeat.add(radioButton61, "cell 7 12,alignx center,growx 0");

                                //---- radioButton62 ----
                                radioButton62.setText("F5");
                                viewSeat.add(radioButton62, "cell 8 12,alignx center,growx 0");

                                //---- radioButton63 ----
                                radioButton63.setText("G5");
                                viewSeat.add(radioButton63, "cell 10 12,alignx center,growx 0");

                                //---- radioButton64 ----
                                radioButton64.setText("H5");
                                viewSeat.add(radioButton64, "cell 11 12,alignx center,growx 0");

                                //---- radioButton65 ----
                                radioButton65.setText("I5");
                                viewSeat.add(radioButton65, "cell 12 12,alignx center,growx 0");

                                //---- radioButton66 ----
                                radioButton66.setText("J5");
                                viewSeat.add(radioButton66, "cell 14 12,alignx center,growx 0");

                                //---- radioButton67 ----
                                radioButton67.setText("K5");
                                viewSeat.add(radioButton67, "cell 15 12,alignx center,growx 0");

                                //---- radioButton68 ----
                                radioButton68.setText("L5");
                                viewSeat.add(radioButton68, "cell 16 12,alignx center,growx 0");

                                //---- radioButton69 ----
                                radioButton69.setText("M5");
                                viewSeat.add(radioButton69, "cell 18 12,alignx center,growx 0");

                                //---- radioButton70 ----
                                radioButton70.setText("N5");
                                viewSeat.add(radioButton70, "cell 19 12,alignx center,growx 0");

                                //---- radioButton71 ----
                                radioButton71.setText("A6");
                                viewSeat.add(radioButton71, "cell 1 13,alignx center,growx 0");

                                //---- radioButton72 ----
                                radioButton72.setText("B6");
                                viewSeat.add(radioButton72, "cell 3 13,alignx center,growx 0");

                                //---- radioButton73 ----
                                radioButton73.setText("C6");
                                viewSeat.add(radioButton73, "cell 4 13,alignx center,growx 0");

                                //---- radioButton74 ----
                                radioButton74.setText("D6");
                                viewSeat.add(radioButton74, "cell 6 13,alignx center,growx 0");

                                //---- radioButton75 ----
                                radioButton75.setText("E6");
                                viewSeat.add(radioButton75, "cell 7 13,alignx center,growx 0");

                                //---- radioButton76 ----
                                radioButton76.setText("F6");
                                viewSeat.add(radioButton76, "cell 8 13,alignx center,growx 0");

                                //---- radioButton77 ----
                                radioButton77.setText("G6");
                                viewSeat.add(radioButton77, "cell 10 13,alignx center,growx 0");

                                //---- radioButton78 ----
                                radioButton78.setText("H6");
                                viewSeat.add(radioButton78, "cell 11 13,alignx center,growx 0");

                                //---- radioButton79 ----
                                radioButton79.setText("I6");
                                viewSeat.add(radioButton79, "cell 12 13,alignx center,growx 0");

                                //---- radioButton80 ----
                                radioButton80.setText("J6");
                                viewSeat.add(radioButton80, "cell 14 13,alignx center,growx 0");

                                //---- radioButton81 ----
                                radioButton81.setText("K6");
                                viewSeat.add(radioButton81, "cell 15 13,alignx center,growx 0");

                                //---- radioButton82 ----
                                radioButton82.setText("L6");
                                viewSeat.add(radioButton82, "cell 16 13,alignx center,growx 0");

                                //---- radioButton83 ----
                                radioButton83.setText("M6");
                                viewSeat.add(radioButton83, "cell 18 13,alignx center,growx 0");

                                //---- radioButton84 ----
                                radioButton84.setText("N6");
                                viewSeat.add(radioButton84, "cell 19 13,alignx center,growx 0");

                                //---- radioButton85 ----
                                radioButton85.setText("A7");
                                viewSeat.add(radioButton85, "cell 1 15,alignx center,growx 0");

                                //---- radioButton86 ----
                                radioButton86.setText("B7");
                                viewSeat.add(radioButton86, "cell 3 15,alignx center,growx 0");

                                //---- radioButton87 ----
                                radioButton87.setText("C7");
                                viewSeat.add(radioButton87, "cell 4 15,alignx center,growx 0");

                                //---- radioButton88 ----
                                radioButton88.setText("D7");
                                viewSeat.add(radioButton88, "cell 6 15,alignx center,growx 0");

                                //---- radioButton89 ----
                                radioButton89.setText("E7");
                                viewSeat.add(radioButton89, "cell 7 15,alignx center,growx 0");

                                //---- radioButton90 ----
                                radioButton90.setText("F7");
                                viewSeat.add(radioButton90, "cell 8 15,alignx center,growx 0");

                                //---- radioButton91 ----
                                radioButton91.setText("G7");
                                viewSeat.add(radioButton91, "cell 10 15,alignx center,growx 0");

                                //---- radioButton92 ----
                                radioButton92.setText("H7");
                                viewSeat.add(radioButton92, "cell 11 15,alignx center,growx 0");

                                //---- radioButton93 ----
                                radioButton93.setText("I7");
                                viewSeat.add(radioButton93, "cell 12 15,alignx center,growx 0");

                                //---- radioButton94 ----
                                radioButton94.setText("J7");
                                viewSeat.add(radioButton94, "cell 14 15,alignx center,growx 0");

                                //---- radioButton95 ----
                                radioButton95.setText("K7");
                                viewSeat.add(radioButton95, "cell 15 15,alignx center,growx 0");

                                //---- radioButton96 ----
                                radioButton96.setText("L7");
                                viewSeat.add(radioButton96, "cell 16 15,alignx center,growx 0");

                                //---- radioButton97 ----
                                radioButton97.setText("M7");
                                viewSeat.add(radioButton97, "cell 18 15,alignx center,growx 0");

                                //---- radioButton98 ----
                                radioButton98.setText("N7");
                                viewSeat.add(radioButton98, "cell 19 15,alignx center,growx 0");

                                //---- radioButton99 ----
                                radioButton99.setText("A8");
                                viewSeat.add(radioButton99, "cell 1 16,alignx center,growx 0");

                                //---- radioButton100 ----
                                radioButton100.setText("B8");
                                viewSeat.add(radioButton100, "cell 3 16,alignx center,growx 0");

                                //---- radioButton101 ----
                                radioButton101.setText("C8");
                                viewSeat.add(radioButton101, "cell 4 16,alignx center,growx 0");

                                //---- radioButton102 ----
                                radioButton102.setText("D8");
                                viewSeat.add(radioButton102, "cell 6 16,alignx center,growx 0");

                                //---- radioButton103 ----
                                radioButton103.setText("E8");
                                viewSeat.add(radioButton103, "cell 7 16,alignx center,growx 0");

                                //---- radioButton104 ----
                                radioButton104.setText("F8");
                                viewSeat.add(radioButton104, "cell 8 16,alignx center,growx 0");

                                //---- radioButton105 ----
                                radioButton105.setText("G8");
                                viewSeat.add(radioButton105, "cell 10 16,alignx center,growx 0");

                                //---- radioButton106 ----
                                radioButton106.setText("H8");
                                viewSeat.add(radioButton106, "cell 11 16,alignx center,growx 0");

                                //---- radioButton107 ----
                                radioButton107.setText("I8");
                                viewSeat.add(radioButton107, "cell 12 16,alignx center,growx 0");

                                //---- radioButton108 ----
                                radioButton108.setText("J8");
                                viewSeat.add(radioButton108, "cell 14 16,alignx center,growx 0");

                                //---- radioButton109 ----
                                radioButton109.setText("K8");
                                viewSeat.add(radioButton109, "cell 15 16,alignx center,growx 0");

                                //---- radioButton110 ----
                                radioButton110.setText("L8");
                                viewSeat.add(radioButton110, "cell 16 16,alignx center,growx 0");

                                //---- radioButton111 ----
                                radioButton111.setText("M8");
                                viewSeat.add(radioButton111, "cell 18 16,alignx center,growx 0");

                                //---- radioButton112 ----
                                radioButton112.setText("N8");
                                viewSeat.add(radioButton112, "cell 19 16,alignx center,growx 0");

                                //---- radioButton113 ----
                                radioButton113.setText("A9");
                                viewSeat.add(radioButton113, "cell 1 18,alignx center,growx 0");

                                //---- radioButton114 ----
                                radioButton114.setText("B9");
                                viewSeat.add(radioButton114, "cell 3 18,alignx center,growx 0");

                                //---- radioButton115 ----
                                radioButton115.setText("C9");
                                viewSeat.add(radioButton115, "cell 4 18,alignx center,growx 0");

                                //---- radioButton116 ----
                                radioButton116.setText("D9");
                                viewSeat.add(radioButton116, "cell 6 18,alignx center,growx 0");

                                //---- radioButton117 ----
                                radioButton117.setText("E9");
                                viewSeat.add(radioButton117, "cell 7 18,alignx center,growx 0");

                                //---- radioButton118 ----
                                radioButton118.setText("F9");
                                viewSeat.add(radioButton118, "cell 8 18,alignx center,growx 0");

                                //---- radioButton119 ----
                                radioButton119.setText("G9");
                                viewSeat.add(radioButton119, "cell 10 18,alignx center,growx 0");

                                //---- radioButton120 ----
                                radioButton120.setText("H9");
                                viewSeat.add(radioButton120, "cell 11 18,alignx center,growx 0");

                                //---- radioButton121 ----
                                radioButton121.setText("I9");
                                viewSeat.add(radioButton121, "cell 12 18,alignx center,growx 0");

                                //---- radioButton122 ----
                                radioButton122.setText("J9");
                                viewSeat.add(radioButton122, "cell 14 18,alignx center,growx 0");

                                //---- radioButton123 ----
                                radioButton123.setText("K9");
                                viewSeat.add(radioButton123, "cell 15 18,alignx center,growx 0");

                                //---- radioButton124 ----
                                radioButton124.setText("L9");
                                viewSeat.add(radioButton124, "cell 16 18,alignx center,growx 0");

                                //---- radioButton125 ----
                                radioButton125.setText("M9");
                                viewSeat.add(radioButton125, "cell 18 18,alignx center,growx 0");

                                //---- radioButton126 ----
                                radioButton126.setText("N9");
                                viewSeat.add(radioButton126, "cell 19 18,alignx center,growx 0");

                                //---- radioButton127 ----
                                radioButton127.setText("A10");
                                viewSeat.add(radioButton127, "cell 1 19,alignx center,growx 0");

                                //---- radioButton128 ----
                                radioButton128.setText("B10");
                                viewSeat.add(radioButton128, "cell 3 19,alignx center,growx 0");

                                //---- radioButton129 ----
                                radioButton129.setText("C10");
                                viewSeat.add(radioButton129, "cell 4 19,alignx center,growx 0");

                                //---- radioButton130 ----
                                radioButton130.setText("D10");
                                viewSeat.add(radioButton130, "cell 6 19,alignx center,growx 0");

                                //---- radioButton131 ----
                                radioButton131.setText("E10");
                                viewSeat.add(radioButton131, "cell 7 19,alignx center,growx 0");

                                //---- radioButton132 ----
                                radioButton132.setText("F10");
                                viewSeat.add(radioButton132, "cell 8 19,alignx center,growx 0");

                                //---- radioButton133 ----
                                radioButton133.setText("G10");
                                viewSeat.add(radioButton133, "cell 10 19,alignx center,growx 0");

                                //---- radioButton134 ----
                                radioButton134.setText("H10");
                                viewSeat.add(radioButton134, "cell 11 19,alignx center,growx 0");

                                //---- radioButton135 ----
                                radioButton135.setText("I10");
                                viewSeat.add(radioButton135, "cell 12 19,alignx center,growx 0");

                                //---- radioButton136 ----
                                radioButton136.setText("J10");
                                viewSeat.add(radioButton136, "cell 14 19,alignx center,growx 0");

                                //---- radioButton137 ----
                                radioButton137.setText("K10");
                                viewSeat.add(radioButton137, "cell 15 19,alignx center,growx 0");

                                //---- radioButton138 ----
                                radioButton138.setText("L10");
                                viewSeat.add(radioButton138, "cell 16 19,alignx center,growx 0");

                                //---- radioButton139 ----
                                radioButton139.setText("M10");
                                viewSeat.add(radioButton139, "cell 18 19,alignx center,growx 0");

                                //---- radioButton140 ----
                                radioButton140.setText("N10");
                                viewSeat.add(radioButton140, "cell 19 19,alignx center,growx 0");

                                //---- label17 ----
                                label17.setText("\u697c\u5c42");
                                label17.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                viewSeat.add(label17, "cell 0 0 2 1");

                                //---- floorComboBox ----
                                floorComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
                                    "\u56fe\u4e66\u9986\u4e00\u697c",
                                    "\u56fe\u4e66\u9986\u4e8c\u697c",
                                    "\u56fe\u4e66\u9986\u4e09\u697c",
                                    "\u56fe\u4e66\u9986\u56db\u697c",
                                    "\u56fe\u4e66\u9986\u4e94\u697c"
                                }));
                                floorComboBox.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                floorComboBox.setMaximumRowCount(5);
                                floorComboBox.addFocusListener(new FocusAdapter() {
                                    @Override
                                    public void focusGained(FocusEvent e) {
                                        floorComboBoxFocusGained(e);
                                    }
                                });
                                floorComboBox.addItemListener(e -> floorComboBoxItemStateChanged(e));
                                viewSeat.add(floorComboBox, "cell 0 0 2 1");

                                //---- refreshButton ----
                                refreshButton.setText("\u5237\u65b0");
                                refreshButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                refreshButton.addMouseListener(new MouseAdapter() {
                                    @Override
                                    public void mouseReleased(MouseEvent e) {
                                        refreshButtonMouseReleased(e);
                                    }
                                });
                                viewSeat.add(refreshButton, "cell 2 0 2 1,alignx center,growx 0");

                                //---- button2 ----
                                button2.setText("\u786e\u8ba4\u9884\u5b9a");
                                button2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                                button2.setForeground(new Color(255, 102, 102));
                                viewSeat.add(button2, "cell 4 0,alignx center,growx 0");

                                //---- label46 ----
                                label46.setText("\u5f53\u524d\u65f6\u95f4\uff1a");
                                label46.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
                                viewSeat.add(label46, "cell 14 0 2 1,alignx right,growx 0");

                                //---- timeLabel ----
                                timeLabel.setText("yyyy-MM-dd hh:mm:ss EEEE");
                                timeLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                                viewSeat.add(timeLabel, "cell 16 0 4 1");

                                //---- label18 ----
                                label18.setText("\u5ea7\u4f4d\u603b\u6570");
                                label18.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                viewSeat.add(label18, "cell 0 1 2 1,alignx right,growx 0");

                                //---- totalNumber ----
                                totalNumber.setText("0");
                                totalNumber.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                                viewSeat.add(totalNumber, "cell 0 1 2 1");

                                //---- label20 ----
                                label20.setText("\u53ef\u9884\u5b9a\u6570");
                                label20.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                viewSeat.add(label20, "cell 0 2 2 1,alignx right,growx 0");

                                //---- selectNumber ----
                                selectNumber.setText("0");
                                selectNumber.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                                viewSeat.add(selectNumber, "cell 0 2 2 1");

                                //---- label22 ----
                                label22.setText("A");
                                viewSeat.add(label22, "cell 1 4,alignx center,growx 0");

                                //---- label23 ----
                                label23.setText("B");
                                viewSeat.add(label23, "cell 3 4,alignx center,growx 0");

                                //---- label24 ----
                                label24.setText("C");
                                viewSeat.add(label24, "cell 4 4,alignx center,growx 0");

                                //---- label25 ----
                                label25.setText("D");
                                viewSeat.add(label25, "cell 6 4,alignx center,growx 0");

                                //---- label26 ----
                                label26.setText("E");
                                viewSeat.add(label26, "cell 7 4,alignx center,growx 0");

                                //---- label27 ----
                                label27.setText("F");
                                viewSeat.add(label27, "cell 8 4,alignx center,growx 0");

                                //---- label28 ----
                                label28.setText("G");
                                viewSeat.add(label28, "cell 10 4,alignx center,growx 0");

                                //---- label29 ----
                                label29.setText("H");
                                viewSeat.add(label29, "cell 11 4,alignx center,growx 0");

                                //---- label30 ----
                                label30.setText("I");
                                viewSeat.add(label30, "cell 12 4,alignx center,growx 0");

                                //---- label41 ----
                                label41.setText("J");
                                viewSeat.add(label41, "cell 14 4,alignx center,growx 0");

                                //---- label42 ----
                                label42.setText("K");
                                viewSeat.add(label42, "cell 15 4,alignx center,growx 0");

                                //---- label43 ----
                                label43.setText("L");
                                viewSeat.add(label43, "cell 16 4,alignx center,growx 0");

                                //---- label44 ----
                                label44.setText("M");
                                viewSeat.add(label44, "cell 18 4,alignx center,growx 0");

                                //---- label45 ----
                                label45.setText("N");
                                viewSeat.add(label45, "cell 19 4,alignx center,growx 0");

                                //---- label31 ----
                                label31.setText("1");
                                viewSeat.add(label31, "cell 0 6");

                                //---- label32 ----
                                label32.setText("2");
                                viewSeat.add(label32, "cell 0 7");

                                //---- label33 ----
                                label33.setText("3");
                                viewSeat.add(label33, "cell 0 9");

                                //---- label34 ----
                                label34.setText("4");
                                viewSeat.add(label34, "cell 0 10");

                                //---- label35 ----
                                label35.setText("5");
                                viewSeat.add(label35, "cell 0 12");

                                //---- label36 ----
                                label36.setText("6");
                                viewSeat.add(label36, "cell 0 13");

                                //---- label37 ----
                                label37.setText("7");
                                viewSeat.add(label37, "cell 0 15");

                                //---- label38 ----
                                label38.setText("8");
                                viewSeat.add(label38, "cell 0 16");

                                //---- label39 ----
                                label39.setText("9");
                                viewSeat.add(label39, "cell 0 18");

                                //---- label40 ----
                                label40.setText("10");
                                viewSeat.add(label40, "cell 0 19");
                            }
                            tabbedPane3.addTab("\u67e5\u770b\u5ea7\u4f4d", viewSeat);

                            //======== panel8 ========
                            {
                                panel8.setLayout(new MigLayout(
                                    "fill,hidemode 3",
                                    // columns
                                    "[fill]" +
                                    "[fill]" +
                                    "[fill]",
                                    // rows
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]"));

                                //---- label16 ----
                                label16.setText("\u9884\u5b9a\u65e5\u5fd7\uff1a");
                                label16.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
                                panel8.add(label16, "cell 0 0");

                                //======== scrollPane4 ========
                                {

                                    //---- list1 ----
                                    list1.setModel(new AbstractListModel<String>() {
                                        String[] values = {
                                            "\u4f60\u5df2\u6210\u529f\u9884\u5b9a\u4e86 \u56fe\u4e66\u9986\u4e00\u697c A2 \u53f7\u5ea7\u4f4d",
                                            "\u4f60\u5df2\u53d6\u6d88\u9884\u5b9a \u56fe\u4e66\u9986\u4e8c\u697c D9 \u53f7\u5ea7\u4f4d\uff01",
                                            "\u4f60\u5df2\u6210\u529f\u9884\u5b9a\u4e86 \u56fe\u4e66\u9986\u4e8c\u697c D9 \u53f7\u5ea7\u4f4d"
                                        };
                                        @Override
                                        public int getSize() { return values.length; }
                                        @Override
                                        public String getElementAt(int i) { return values[i]; }
                                    });
                                    list1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                    scrollPane4.setViewportView(list1);
                                }
                                panel8.add(scrollPane4, "cell 0 2 3 1,dock center");

                                //---- label19 ----
                                label19.setText("\u5185\u5bb9\u8be6\u60c5\uff1a");
                                label19.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
                                panel8.add(label19, "cell 0 3");

                                //======== scrollPane5 ========
                                {

                                    //---- textArea4 ----
                                    textArea4.setText("\u8bf7\u5728\u4e0a\u65b9\u9009\u62e9\u65e5\u5fd7\uff0c\u6b64\u5904\u5c06\u4f1a\u5bf9\u5e94\u5c55\u793a\u3002");
                                    textArea4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                    textArea4.setEditable(false);
                                    scrollPane5.setViewportView(textArea4);
                                }
                                panel8.add(scrollPane5, "cell 0 4 3 1,dock center");
                            }
                            tabbedPane3.addTab("\u9884\u5b9a\u6d88\u606f", panel8);
                        }
                        panel2.add(tabbedPane3, "cell 0 0,dock center");
                    }
                    tabbedPane1.addTab("\u9884\u5b9a\u4e2d\u5fc3", panel2);

                    //======== panel3 ========
                    {
                        panel3.setLayout(new MigLayout(
                            "hidemode 3",
                            // columns
                            "[fill]",
                            // rows
                            "[]"));

                        //======== tabbedPane4 ========
                        {
                            tabbedPane4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));

                            //======== panel10 ========
                            {
                                panel10.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.setLayout(new MigLayout(
                                    "fill,hidemode 3,align center center",
                                    // columns
                                    "[fill]" +
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
                                    "[]"));

                                //---- label21 ----
                                label21.setText("\u7528\u6237\u540d\uff1a");
                                label21.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.add(label21, "cell 0 1,alignx center,growx 0");

                                //---- userName ----
                                userName.setText("Unknown");
                                userName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.add(userName, "cell 1 1");

                                //---- label47 ----
                                label47.setText("\u59d3\u540d\uff1a");
                                label47.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.add(label47, "cell 0 2,alignx center,growx 0");

                                //---- name ----
                                name.setText("\u672a\u77e5");
                                name.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.add(name, "cell 1 2");

                                //---- label48 ----
                                label48.setText("\u6027\u522b\uff1a");
                                label48.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.add(label48, "cell 0 3,alignx center,growx 0");

                                //---- sex ----
                                sex.setText("\u5973");
                                sex.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.add(sex, "cell 1 3");

                                //---- label51 ----
                                label51.setText("\u5e74\u9f84\uff1a");
                                label51.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.add(label51, "cell 0 4,alignx center,growx 0");

                                //---- age ----
                                age.setText("18");
                                age.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.add(age, "cell 1 4");

                                //---- label53 ----
                                label53.setText("\u5b66\u9662\u73ed\u7ea7\uff1a");
                                label53.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.add(label53, "cell 0 5,alignx center,growx 0");

                                //---- grade ----
                                grade.setText("\u9ed8\u8ba4\u73ed\u7ea7");
                                grade.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.add(grade, "cell 1 5");

                                //---- label52 ----
                                label52.setText("\u8054\u7cfb\u624b\u673a\uff1a");
                                label52.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.add(label52, "cell 0 6,alignx center,growx 0");

                                //---- phone ----
                                phone.setText("15873321229");
                                phone.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.add(phone, "cell 1 6");

                                //---- label54 ----
                                label54.setText("\u4e2a\u6027\u7b7e\u540d\uff1a");
                                label54.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.add(label54, "cell 0 7,alignx center,growx 0");

                                //---- description ----
                                description.setText("\u5e38\u4e0e\u540c\u597d\u4e89\u5929\u4e0b\uff0c\n\u4e0d\u5171\u50bb\u74dc\u8bba\u957f\u77ed\u3002");
                                description.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel10.add(description, "cell 1 7 6 2");
                            }
                            tabbedPane4.addTab("\u4e2a\u4eba\u4fe1\u606f", panel10);

                            //======== panel12 ========
                            {
                                panel12.setLayout(new MigLayout(
                                    "fill,hidemode 3",
                                    // columns
                                    "[fill]" +
                                    "[fill]" +
                                    "[207,fill]" +
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

                                //---- label62 ----
                                label62.setText("\u7528\u6237\u540d\uff1a");
                                label62.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel12.add(label62, "cell 0 1,alignx center,growx 0");

                                //---- modifyUserName ----
                                modifyUserName.setEnabled(false);
                                modifyUserName.setEditable(false);
                                modifyUserName.setText("Unknown");
                                modifyUserName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel12.add(modifyUserName, "cell 1 1");

                                //---- label63 ----
                                label63.setText("\u59d3\u540d\uff1a");
                                label63.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel12.add(label63, "cell 0 2,alignx center,growx 0");

                                //---- modifyName ----
                                modifyName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                modifyName.setText("\u9ed8\u8ba4\u59d3\u540d");
                                panel12.add(modifyName, "cell 1 2");

                                //---- label64 ----
                                label64.setText("\u6027\u522b\uff1a");
                                label64.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel12.add(label64, "cell 0 3,alignx center,growx 0");

                                //---- radioButton141 ----
                                radioButton141.setText("\u4fdd\u5bc6");
                                radioButton141.setSelected(true);
                                panel12.add(radioButton141, "cell 1 3");

                                //---- radioButton142 ----
                                radioButton142.setText("\u7537");
                                radioButton142.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel12.add(radioButton142, "cell 1 3");

                                //---- radioButton143 ----
                                radioButton143.setText("\u5973");
                                radioButton143.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel12.add(radioButton143, "cell 1 3");

                                //---- label65 ----
                                label65.setText("\u5e74\u9f84\uff1a");
                                label65.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel12.add(label65, "cell 0 4,alignx center,growx 0");

                                //---- comboBox1 ----
                                comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
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
                                comboBox1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                comboBox1.setSelectedIndex(4);
                                panel12.add(comboBox1, "cell 1 4");

                                //---- label68 ----
                                label68.setText("\u73ed\u7ea7\uff1a");
                                label68.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel12.add(label68, "cell 0 5,alignx center,growx 0");

                                //---- modifyGrade ----
                                modifyGrade.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                modifyGrade.setText("18\u7ea7\u4e94\u73ed");
                                panel12.add(modifyGrade, "cell 1 5");

                                //---- label66 ----
                                label66.setText("\u5bc6\u7801\u66f4\u6539\uff1a");
                                label66.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel12.add(label66, "cell 0 6,alignx center,growx 0");

                                //---- textField7 ----
                                textField7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel12.add(textField7, "cell 1 6");

                                //---- label67 ----
                                label67.setText("\u5bc6\u7801\u786e\u8ba4\uff1a");
                                label67.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel12.add(label67, "cell 0 7,alignx center,growx 0");

                                //---- textField8 ----
                                textField8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel12.add(textField8, "cell 1 7");

                                //---- button1 ----
                                button1.setText("\u68c0\u67e5\u5bc6\u7801");
                                button1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel12.add(button1, "cell 2 7,alignx center,growx 0");

                                //---- label69 ----
                                label69.setText("\u4fee\u6539\u7b7e\u540d\uff1a");
                                label69.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel12.add(label69, "cell 0 8,alignx center,growx 0");

                                //======== scrollPane6 ========
                                {

                                    //---- textArea5 ----
                                    textArea5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                    scrollPane6.setViewportView(textArea5);
                                }
                                panel12.add(scrollPane6, "cell 1 8 3 3");
                            }
                            tabbedPane4.addTab("\u4fee\u6539\u4fe1\u606f", panel12);
                        }
                        panel3.add(tabbedPane4, "cell 0 0,dock center");
                    }
                    tabbedPane1.addTab("\u4e2a\u4eba\u4e2d\u5fc3", panel3);

                    //======== panel4 ========
                    {
                        panel4.setLayout(new MigLayout(
                            "hidemode 3",
                            // columns
                            "[fill]",
                            // rows
                            "[]"));

                        //======== tabbedPane2 ========
                        {
                            tabbedPane2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));

                            //======== panel5 ========
                            {
                                panel5.setLayout(new MigLayout(
                                    "hidemode 3",
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
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]"));

                                //---- label11 ----
                                label11.setText("\u7a0b\u5e8f\u7248\u672c\uff1a");
                                label11.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel5.add(label11, "cell 0 0");

                                //---- label12 ----
                                label12.setText("\u5b66\u751f\u7aef V 1.0");
                                label12.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel5.add(label12, "cell 2 0");

                                //---- label13 ----
                                label13.setText("\u53d1\u5e03\u65e5\u671f\uff1a");
                                label13.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel5.add(label13, "cell 0 1");

                                //---- label14 ----
                                label14.setText("2020/06/25");
                                panel5.add(label14, "cell 2 1");

                                //---- label15 ----
                                label15.setText("\u672c\u6b21\u66f4\u65b0\uff1a");
                                label15.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel5.add(label15, "cell 0 3");

                                //======== scrollPane2 ========
                                {

                                    //---- textArea2 ----
                                    textArea2.setText("release note - 2020.06.26 \n===================================== \n1.\u4f7f\u7528\u4e86\u57fa\u4e8eGoogle Material\u98ce\u683c\u7684Material-ui-swing\u505a\u7a97\u4f53\u754c\u9762\uff1b \n2.\u4f7f\u7528\u4e86\u53f7\u79f0Java\u8bed\u8a00\u4e2d\u6700\u597d\u7684\u6570\u636e\u5e93\u8fde\u63a5\u6c60Durid\uff0c\u63d0\u4f9b\u7684\u5f3a\u5927\u7684\u76d1\u63a7\u548c\u6269\u5c55\u529f\u80fd\uff1b \n3.\u4f7f\u7528\u6784\u5efa\u5de5\u5177Maven\u7ba1\u7406\u9879\u76ee\u4f9d\u8d56\u4e0e\u6784\u5efa\u9879\u76ee\uff1b \n4.\u4f7f\u7528\u4e86\u7248\u672c\u63a7\u5236\u5de5\u5177git\uff0c\u5e76\u4e0a\u4f20\u6e90\u7801\u81f3github\uff1b\n5.\u4f7f\u7528JFormDesigner\u8bbe\u8ba1\u7a0b\u5e8f\u754c\u9762\uff1b\n6.\u6dfb\u52a0\u4e86\u4f9d\u8d56\u5305\u5de5\u5177mysql jdbc\u3001log4j\u7b49\u3002");
                                    textArea2.setWrapStyleWord(true);
                                    textArea2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                    textArea2.setLineWrap(true);
                                    textArea2.setEditable(false);
                                    scrollPane2.setViewportView(textArea2);
                                }
                                panel5.add(scrollPane2, "cell 0 5 30 9,dock center");
                            }
                            tabbedPane2.addTab("\u7a0b\u5e8f\u4fe1\u606f", panel5);

                            //======== panel6 ========
                            {
                                panel6.setLayout(new MigLayout(
                                    "fill,hidemode 3,align right bottom",
                                    // columns
                                    "[fill]" +
                                    "[fill]",
                                    // rows
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]"));

                                //---- label1 ----
                                label1.setText("\u5f00\u53d1\u8005\uff1a");
                                label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel6.add(label1, "cell 0 0");

                                //---- label3 ----
                                label3.setText("\u7b26\u7389\u6d9f");
                                label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel6.add(label3, "cell 1 0");

                                //---- label2 ----
                                label2.setText("\u8054\u7cfb\u65b9\u5f0f\uff1a");
                                label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel6.add(label2, "cell 0 1");

                                //---- label4 ----
                                label4.setText("7758258");
                                label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel6.add(label4, "cell 1 1");

                                //---- label6 ----
                                label6.setText("\u5f00\u53d1\u8bed\u8a00\uff1a");
                                label6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel6.add(label6, "cell 0 2");

                                //---- label9 ----
                                label9.setText("Java");
                                label9.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel6.add(label9, "cell 1 2");

                                //---- label5 ----
                                label5.setText("\u5f00\u53d1\u5de5\u5177\uff1a");
                                label5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel6.add(label5, "cell 0 3");

                                //---- label8 ----
                                label8.setText("Intellij IDEA & JFormDesigner");
                                label8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel6.add(label8, "cell 1 3");

                                //---- label7 ----
                                label7.setText("\u5f00\u53d1\u65e5\u671f\uff1a");
                                label7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel6.add(label7, "cell 0 4");

                                //---- label10 ----
                                label10.setText("2020/06/22");
                                label10.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel6.add(label10, "cell 1 4");
                            }
                            tabbedPane2.addTab("\u7ef4\u62a4\u8005\u4fe1\u606f", panel6);

                            //======== panel7 ========
                            {
                                panel7.setLayout(new MigLayout(
                                    "hidemode 3",
                                    // columns
                                    "[fill]",
                                    // rows
                                    "[fill]"));

                                //======== scrollPane1 ========
                                {

                                    //---- textArea1 ----
                                    textArea1.setText("Copyright 2020 fyl      \n\nPermission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the \"Software\"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:  The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.  THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.");
                                    textArea1.setEditable(false);
                                    textArea1.setWrapStyleWord(true);
                                    textArea1.setLineWrap(true);
                                    scrollPane1.setViewportView(textArea1);
                                }
                                panel7.add(scrollPane1, "cell 0 0,dock center");
                            }
                            tabbedPane2.addTab("\u670d\u52a1\u534f\u8bae", panel7);
                        }
                        panel4.add(tabbedPane2, "cell 0 0,dock center");
                    }
                    tabbedPane1.addTab("\u5173\u4e8e", panel4);
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

                //---- switchUserButton ----
                switchUserButton.setText("\u5207\u6362\u7528\u6237");
                switchUserButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
                switchUserButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        switchUserButtonMouseReleased(e);
                        switchUserButtonMouseReleased(e);
                    }
                });
                buttonBar.add(switchUserButton, "cell 1 0");

                //---- exitButton ----
                exitButton.setText("\u9000\u51fa\u7a0b\u5e8f");
                exitButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
                exitButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        exitButtonMouseReleased(e);
                    }
                });
                buttonBar.add(exitButton, "cell 2 0");
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(1150, 750);
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton3);
        buttonGroup1.add(radioButton2);
        buttonGroup1.add(radioButton4);
        buttonGroup1.add(radioButton5);
        buttonGroup1.add(radioButton6);
        buttonGroup1.add(radioButton7);
        buttonGroup1.add(radioButton8);
        buttonGroup1.add(radioButton9);
        buttonGroup1.add(radioButton10);
        buttonGroup1.add(radioButton11);
        buttonGroup1.add(radioButton12);
        buttonGroup1.add(radioButton13);
        buttonGroup1.add(radioButton14);
        buttonGroup1.add(radioButton15);
        buttonGroup1.add(radioButton16);
        buttonGroup1.add(radioButton17);
        buttonGroup1.add(radioButton18);
        buttonGroup1.add(radioButton19);
        buttonGroup1.add(radioButton20);
        buttonGroup1.add(radioButton21);
        buttonGroup1.add(radioButton22);
        buttonGroup1.add(radioButton23);
        buttonGroup1.add(radioButton24);
        buttonGroup1.add(radioButton25);
        buttonGroup1.add(radioButton26);
        buttonGroup1.add(radioButton27);
        buttonGroup1.add(radioButton28);
        buttonGroup1.add(radioButton29);
        buttonGroup1.add(radioButton30);
        buttonGroup1.add(radioButton31);
        buttonGroup1.add(radioButton32);
        buttonGroup1.add(radioButton33);
        buttonGroup1.add(radioButton34);
        buttonGroup1.add(radioButton35);
        buttonGroup1.add(radioButton36);
        buttonGroup1.add(radioButton37);
        buttonGroup1.add(radioButton38);
        buttonGroup1.add(radioButton39);
        buttonGroup1.add(radioButton40);
        buttonGroup1.add(radioButton41);
        buttonGroup1.add(radioButton42);
        buttonGroup1.add(radioButton43);
        buttonGroup1.add(radioButton44);
        buttonGroup1.add(radioButton45);
        buttonGroup1.add(radioButton46);
        buttonGroup1.add(radioButton47);
        buttonGroup1.add(radioButton48);
        buttonGroup1.add(radioButton49);
        buttonGroup1.add(radioButton50);
        buttonGroup1.add(radioButton51);
        buttonGroup1.add(radioButton52);
        buttonGroup1.add(radioButton53);
        buttonGroup1.add(radioButton54);
        buttonGroup1.add(radioButton55);
        buttonGroup1.add(radioButton56);
        buttonGroup1.add(radioButton57);
        buttonGroup1.add(radioButton58);
        buttonGroup1.add(radioButton59);
        buttonGroup1.add(radioButton60);
        buttonGroup1.add(radioButton61);
        buttonGroup1.add(radioButton62);
        buttonGroup1.add(radioButton63);
        buttonGroup1.add(radioButton64);
        buttonGroup1.add(radioButton65);
        buttonGroup1.add(radioButton66);
        buttonGroup1.add(radioButton67);
        buttonGroup1.add(radioButton68);
        buttonGroup1.add(radioButton69);
        buttonGroup1.add(radioButton70);
        buttonGroup1.add(radioButton71);
        buttonGroup1.add(radioButton72);
        buttonGroup1.add(radioButton73);
        buttonGroup1.add(radioButton74);
        buttonGroup1.add(radioButton75);
        buttonGroup1.add(radioButton76);
        buttonGroup1.add(radioButton77);
        buttonGroup1.add(radioButton78);
        buttonGroup1.add(radioButton79);
        buttonGroup1.add(radioButton80);
        buttonGroup1.add(radioButton81);
        buttonGroup1.add(radioButton82);
        buttonGroup1.add(radioButton83);
        buttonGroup1.add(radioButton84);
        buttonGroup1.add(radioButton85);
        buttonGroup1.add(radioButton86);
        buttonGroup1.add(radioButton87);
        buttonGroup1.add(radioButton88);
        buttonGroup1.add(radioButton89);
        buttonGroup1.add(radioButton90);
        buttonGroup1.add(radioButton91);
        buttonGroup1.add(radioButton92);
        buttonGroup1.add(radioButton93);
        buttonGroup1.add(radioButton94);
        buttonGroup1.add(radioButton95);
        buttonGroup1.add(radioButton96);
        buttonGroup1.add(radioButton97);
        buttonGroup1.add(radioButton98);
        buttonGroup1.add(radioButton99);
        buttonGroup1.add(radioButton100);
        buttonGroup1.add(radioButton101);
        buttonGroup1.add(radioButton102);
        buttonGroup1.add(radioButton103);
        buttonGroup1.add(radioButton104);
        buttonGroup1.add(radioButton105);
        buttonGroup1.add(radioButton106);
        buttonGroup1.add(radioButton107);
        buttonGroup1.add(radioButton108);
        buttonGroup1.add(radioButton109);
        buttonGroup1.add(radioButton110);
        buttonGroup1.add(radioButton111);
        buttonGroup1.add(radioButton112);
        buttonGroup1.add(radioButton113);
        buttonGroup1.add(radioButton114);
        buttonGroup1.add(radioButton115);
        buttonGroup1.add(radioButton116);
        buttonGroup1.add(radioButton117);
        buttonGroup1.add(radioButton118);
        buttonGroup1.add(radioButton119);
        buttonGroup1.add(radioButton120);
        buttonGroup1.add(radioButton121);
        buttonGroup1.add(radioButton122);
        buttonGroup1.add(radioButton123);
        buttonGroup1.add(radioButton124);
        buttonGroup1.add(radioButton125);
        buttonGroup1.add(radioButton126);
        buttonGroup1.add(radioButton127);
        buttonGroup1.add(radioButton128);
        buttonGroup1.add(radioButton129);
        buttonGroup1.add(radioButton130);
        buttonGroup1.add(radioButton131);
        buttonGroup1.add(radioButton132);
        buttonGroup1.add(radioButton133);
        buttonGroup1.add(radioButton134);
        buttonGroup1.add(radioButton135);
        buttonGroup1.add(radioButton136);
        buttonGroup1.add(radioButton137);
        buttonGroup1.add(radioButton138);
        buttonGroup1.add(radioButton139);
        buttonGroup1.add(radioButton140);

        //---- buttonGroup2 ----
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(radioButton141);
        buttonGroup2.add(radioButton142);
        buttonGroup2.add(radioButton143);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - notfound
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JLabel label49;
    private JLabel label50;
    private JScrollPane scrollPane3;
    private JTextArea textArea3;
    private JPanel panel2;
    private JTabbedPane tabbedPane3;
    private JPanel viewSeat;
    private JRadioButton radioButton1;
    private JRadioButton radioButton3;
    private JRadioButton radioButton2;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JRadioButton radioButton6;
    private JRadioButton radioButton7;
    private JRadioButton radioButton8;
    private JRadioButton radioButton9;
    private JRadioButton radioButton10;
    private JRadioButton radioButton11;
    private JRadioButton radioButton12;
    private JRadioButton radioButton13;
    private JRadioButton radioButton14;
    private JRadioButton radioButton15;
    private JRadioButton radioButton16;
    private JRadioButton radioButton17;
    private JRadioButton radioButton18;
    private JRadioButton radioButton19;
    private JRadioButton radioButton20;
    private JRadioButton radioButton21;
    private JRadioButton radioButton22;
    private JRadioButton radioButton23;
    private JRadioButton radioButton24;
    private JRadioButton radioButton25;
    private JRadioButton radioButton26;
    private JRadioButton radioButton27;
    private JRadioButton radioButton28;
    private JRadioButton radioButton29;
    private JRadioButton radioButton30;
    private JRadioButton radioButton31;
    private JRadioButton radioButton32;
    private JRadioButton radioButton33;
    private JRadioButton radioButton34;
    private JRadioButton radioButton35;
    private JRadioButton radioButton36;
    private JRadioButton radioButton37;
    private JRadioButton radioButton38;
    private JRadioButton radioButton39;
    private JRadioButton radioButton40;
    private JRadioButton radioButton41;
    private JRadioButton radioButton42;
    private JRadioButton radioButton43;
    private JRadioButton radioButton44;
    private JRadioButton radioButton45;
    private JRadioButton radioButton46;
    private JRadioButton radioButton47;
    private JRadioButton radioButton48;
    private JRadioButton radioButton49;
    private JRadioButton radioButton50;
    private JRadioButton radioButton51;
    private JRadioButton radioButton52;
    private JRadioButton radioButton53;
    private JRadioButton radioButton54;
    private JRadioButton radioButton55;
    private JRadioButton radioButton56;
    private JRadioButton radioButton57;
    private JRadioButton radioButton58;
    private JRadioButton radioButton59;
    private JRadioButton radioButton60;
    private JRadioButton radioButton61;
    private JRadioButton radioButton62;
    private JRadioButton radioButton63;
    private JRadioButton radioButton64;
    private JRadioButton radioButton65;
    private JRadioButton radioButton66;
    private JRadioButton radioButton67;
    private JRadioButton radioButton68;
    private JRadioButton radioButton69;
    private JRadioButton radioButton70;
    private JRadioButton radioButton71;
    private JRadioButton radioButton72;
    private JRadioButton radioButton73;
    private JRadioButton radioButton74;
    private JRadioButton radioButton75;
    private JRadioButton radioButton76;
    private JRadioButton radioButton77;
    private JRadioButton radioButton78;
    private JRadioButton radioButton79;
    private JRadioButton radioButton80;
    private JRadioButton radioButton81;
    private JRadioButton radioButton82;
    private JRadioButton radioButton83;
    private JRadioButton radioButton84;
    private JRadioButton radioButton85;
    private JRadioButton radioButton86;
    private JRadioButton radioButton87;
    private JRadioButton radioButton88;
    private JRadioButton radioButton89;
    private JRadioButton radioButton90;
    private JRadioButton radioButton91;
    private JRadioButton radioButton92;
    private JRadioButton radioButton93;
    private JRadioButton radioButton94;
    private JRadioButton radioButton95;
    private JRadioButton radioButton96;
    private JRadioButton radioButton97;
    private JRadioButton radioButton98;
    private JRadioButton radioButton99;
    private JRadioButton radioButton100;
    private JRadioButton radioButton101;
    private JRadioButton radioButton102;
    private JRadioButton radioButton103;
    private JRadioButton radioButton104;
    private JRadioButton radioButton105;
    private JRadioButton radioButton106;
    private JRadioButton radioButton107;
    private JRadioButton radioButton108;
    private JRadioButton radioButton109;
    private JRadioButton radioButton110;
    private JRadioButton radioButton111;
    private JRadioButton radioButton112;
    private JRadioButton radioButton113;
    private JRadioButton radioButton114;
    private JRadioButton radioButton115;
    private JRadioButton radioButton116;
    private JRadioButton radioButton117;
    private JRadioButton radioButton118;
    private JRadioButton radioButton119;
    private JRadioButton radioButton120;
    private JRadioButton radioButton121;
    private JRadioButton radioButton122;
    private JRadioButton radioButton123;
    private JRadioButton radioButton124;
    private JRadioButton radioButton125;
    private JRadioButton radioButton126;
    private JRadioButton radioButton127;
    private JRadioButton radioButton128;
    private JRadioButton radioButton129;
    private JRadioButton radioButton130;
    private JRadioButton radioButton131;
    private JRadioButton radioButton132;
    private JRadioButton radioButton133;
    private JRadioButton radioButton134;
    private JRadioButton radioButton135;
    private JRadioButton radioButton136;
    private JRadioButton radioButton137;
    private JRadioButton radioButton138;
    private JRadioButton radioButton139;
    private JRadioButton radioButton140;
    private JLabel label17;
    private JComboBox<String> floorComboBox;
    private JButton refreshButton;
    private JButton button2;
    private JLabel label46;
    private JLabel timeLabel;
    private JLabel label18;
    private JLabel totalNumber;
    private JLabel label20;
    private JLabel selectNumber;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JLabel label25;
    private JLabel label26;
    private JLabel label27;
    private JLabel label28;
    private JLabel label29;
    private JLabel label30;
    private JLabel label41;
    private JLabel label42;
    private JLabel label43;
    private JLabel label44;
    private JLabel label45;
    private JLabel label31;
    private JLabel label32;
    private JLabel label33;
    private JLabel label34;
    private JLabel label35;
    private JLabel label36;
    private JLabel label37;
    private JLabel label38;
    private JLabel label39;
    private JLabel label40;
    private JPanel panel8;
    private JLabel label16;
    private JScrollPane scrollPane4;
    private JList<String> list1;
    private JLabel label19;
    private JScrollPane scrollPane5;
    private JTextArea textArea4;
    private JPanel panel3;
    private JTabbedPane tabbedPane4;
    private JPanel panel10;
    private JLabel label21;
    private JLabel userName;
    private JLabel label47;
    private JLabel name;
    private JLabel label48;
    private JLabel sex;
    private JLabel label51;
    private JLabel age;
    private JLabel label53;
    private JLabel grade;
    private JLabel label52;
    private JLabel phone;
    private JLabel label54;
    private JLabel description;
    private JPanel panel12;
    private JLabel label62;
    private JTextField modifyUserName;
    private JLabel label63;
    private JTextField modifyName;
    private JLabel label64;
    private JRadioButton radioButton141;
    private JRadioButton radioButton142;
    private JRadioButton radioButton143;
    private JLabel label65;
    private JComboBox<String> comboBox1;
    private JLabel label68;
    private JTextField modifyGrade;
    private JLabel label66;
    private JTextField textField7;
    private JLabel label67;
    private JTextField textField8;
    private JButton button1;
    private JLabel label69;
    private JScrollPane scrollPane6;
    private JTextArea textArea5;
    private JPanel panel4;
    private JTabbedPane tabbedPane2;
    private JPanel panel5;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    private JPanel panel6;
    private JLabel label1;
    private JLabel label3;
    private JLabel label2;
    private JLabel label4;
    private JLabel label6;
    private JLabel label9;
    private JLabel label5;
    private JLabel label8;
    private JLabel label7;
    private JLabel label10;
    private JPanel panel7;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JPanel buttonBar;
    private JButton switchUserButton;
    private JButton exitButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    /**
     * 取消所有选择
     */
    private void resetSelect() {
        this.radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);
        radioButton4.setSelected(false);
        radioButton5.setSelected(false);
        radioButton6.setSelected(false);
        radioButton7.setSelected(false);
        radioButton8.setSelected(false);
        radioButton9.setSelected(false);
        radioButton10.setSelected(false);
        radioButton11.setSelected(false);
        radioButton12.setSelected(false);
        radioButton13.setSelected(false);
        radioButton14.setSelected(false);
        radioButton15.setSelected(false);
        radioButton16.setSelected(false);
        radioButton17.setSelected(false);
        radioButton18.setSelected(false);
        radioButton19.setSelected(false);
        radioButton20.setSelected(false);
        radioButton21.setSelected(false);
        radioButton22.setSelected(false);
        radioButton23.setSelected(false);
        radioButton24.setSelected(false);
        radioButton25.setSelected(false);
        radioButton26.setSelected(false);
        radioButton27.setSelected(false);
        radioButton28.setSelected(false);
        radioButton29.setSelected(false);
        radioButton30.setSelected(false);
        radioButton31.setSelected(false);
        radioButton32.setSelected(false);
        radioButton33.setSelected(false);
        radioButton34.setSelected(false);
        radioButton35.setSelected(false);
        radioButton36.setSelected(false);
        radioButton37.setSelected(false);
        radioButton38.setSelected(false);
        radioButton39.setSelected(false);
        radioButton40.setSelected(false);
        radioButton41.setSelected(false);
        radioButton42.setSelected(false);
        radioButton43.setSelected(false);
        radioButton44.setSelected(false);
        radioButton45.setSelected(false);
        radioButton46.setSelected(false);
        radioButton47.setSelected(false);
        radioButton48.setSelected(false);
        radioButton49.setSelected(false);
        radioButton50.setSelected(false);
        radioButton51.setSelected(false);
        radioButton52.setSelected(false);
        radioButton53.setSelected(false);
        radioButton54.setSelected(false);
        radioButton55.setSelected(false);
        radioButton56.setSelected(false);
        radioButton57.setSelected(false);
        radioButton58.setSelected(false);
        radioButton59.setSelected(false);
        radioButton60.setSelected(false);
        radioButton61.setSelected(false);
        radioButton62.setSelected(false);
        radioButton63.setSelected(false);
        radioButton64.setSelected(false);
        radioButton65.setSelected(false);
        radioButton66.setSelected(false);
        radioButton67.setSelected(false);
        radioButton68.setSelected(false);
        radioButton69.setSelected(false);
        radioButton70.setSelected(false);
        radioButton71.setSelected(false);
        radioButton72.setSelected(false);
        radioButton73.setSelected(false);
        radioButton74.setSelected(false);
        radioButton75.setSelected(false);
        radioButton76.setSelected(false);
        radioButton77.setSelected(false);
        radioButton78.setSelected(false);
        radioButton79.setSelected(false);
        radioButton80.setSelected(false);
        radioButton81.setSelected(false);
        radioButton82.setSelected(false);
        radioButton83.setSelected(false);
        radioButton84.setSelected(false);
        radioButton85.setSelected(false);
        radioButton86.setSelected(false);
        radioButton87.setSelected(false);
        radioButton88.setSelected(false);
        radioButton89.setSelected(false);
        radioButton90.setSelected(false);
        radioButton91.setSelected(false);
        radioButton92.setSelected(false);
        radioButton93.setSelected(false);
        radioButton94.setSelected(false);
        radioButton95.setSelected(false);
        radioButton96.setSelected(false);
        radioButton97.setSelected(false);
        radioButton98.setSelected(false);
        radioButton99.setSelected(false);
        radioButton100.setSelected(false);
        radioButton101.setSelected(false);
        radioButton102.setSelected(false);
        radioButton103.setSelected(false);
        radioButton104.setSelected(false);
        radioButton105.setSelected(false);
        radioButton106.setSelected(false);
        radioButton107.setSelected(false);
        radioButton108.setSelected(false);
        radioButton109.setSelected(false);
        radioButton110.setSelected(false);
        radioButton111.setSelected(false);
        radioButton112.setSelected(false);
        radioButton113.setSelected(false);
        radioButton114.setSelected(false);
        radioButton115.setSelected(false);
        radioButton116.setSelected(false);
        radioButton117.setSelected(false);
        radioButton118.setSelected(false);
        radioButton119.setSelected(false);
        radioButton120.setSelected(false);
        radioButton121.setSelected(false);
        radioButton122.setSelected(false);
        radioButton123.setSelected(false);
        radioButton124.setSelected(false);
        radioButton125.setSelected(false);
        radioButton126.setSelected(false);
        radioButton127.setSelected(false);
        radioButton128.setSelected(false);
        radioButton129.setSelected(false);
        radioButton130.setSelected(false);
        radioButton131.setSelected(false);
        radioButton132.setSelected(false);
        radioButton133.setSelected(false);
        radioButton134.setSelected(false);
        radioButton135.setSelected(false);
        radioButton136.setSelected(false);
        radioButton137.setSelected(false);
        radioButton138.setSelected(false);
        radioButton139.setSelected(false);
        radioButton140.setSelected(false);
    }
}
