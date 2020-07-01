/*
 * Created by JFormDesigner on Thu Jun 25 16:06:04 CST 2020
 */

package cn.fyl.view.register;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import cn.fyl.view.login.LoginView;
import net.miginfocom.swing.*;

/**
 * @author notfound
 */
public class Register extends JFrame {
    public Register() {
        initComponents();
    }

    private void cancelButtonMouseReleased(MouseEvent e) {
        // TODO add your code here
        this.dispose();
        new LoginView().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - notfound
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        label9 = new JLabel();
        textField4 = new JTextField();
        label8 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton3 = new JRadioButton();
        radioButton2 = new JRadioButton();
        label6 = new JLabel();
        comboBox1 = new JComboBox<>();
        label7 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        passwordField2 = new JPasswordField();
        label5 = new JLabel();
        passwordField1 = new JPasswordField();
        buttonBar = new JPanel();
        okButton = new JButton();
        returnButton = new JButton();

        //======== this ========
        setTitle("\u6ce8\u518c\u7528\u6237");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
            swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border
            . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog"
            ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,dialogPane. getBorder
            ( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
            .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException
            ( ); }} );
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

                //---- textField1 ----
                textField1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(textField1, "cell 4 2");

                //---- label3 ----
                label3.setText("\u7528\u6237\u540d");
                label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label3, "cell 2 3");

                //---- textField2 ----
                textField2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(textField2, "cell 4 3");

                //---- label9 ----
                label9.setText("\u6240\u6709\u9662\u7cfb\u73ed\u7ea7");
                label9.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label9, "cell 2 4");

                //---- textField4 ----
                textField4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(textField4, "cell 4 4");

                //---- label8 ----
                label8.setText("\u6027\u522b");
                label8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label8, "cell 2 5");

                //---- radioButton1 ----
                radioButton1.setText("\u4fdd\u5bc6");
                radioButton1.setSelected(true);
                radioButton1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(radioButton1, "cell 4 5,alignx center,growx 0");

                //---- radioButton3 ----
                radioButton3.setText("\u7537");
                radioButton3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(radioButton3, "cell 4 5,alignx center,growx 0");

                //---- radioButton2 ----
                radioButton2.setText("\u5973");
                radioButton2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(radioButton2, "cell 4 5,alignx center,growx 0");

                //---- label6 ----
                label6.setText("\u5e74\u9f84");
                label6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label6, "cell 2 6");

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
                contentPanel.add(comboBox1, "cell 4 6");

                //---- label7 ----
                label7.setText("\u624b\u673a\u53f7\u7801");
                label7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label7, "cell 2 7");

                //---- textField3 ----
                textField3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(textField3, "cell 4 7");

                //---- label4 ----
                label4.setText("\u5bc6\u7801");
                label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label4, "cell 2 8");
                contentPanel.add(passwordField2, "cell 4 8");

                //---- label5 ----
                label5.setText("\u786e\u8ba4\u5bc6\u7801");
                label5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                contentPanel.add(label5, "cell 2 9");
                contentPanel.add(passwordField1, "cell 4 9");
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

        //---- sexButtonGroup ----
        ButtonGroup sexButtonGroup = new ButtonGroup();
        sexButtonGroup.add(radioButton1);
        sexButtonGroup.add(radioButton3);
        sexButtonGroup.add(radioButton2);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - notfound
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JLabel label9;
    private JTextField textField4;
    private JLabel label8;
    private JRadioButton radioButton1;
    private JRadioButton radioButton3;
    private JRadioButton radioButton2;
    private JLabel label6;
    private JComboBox<String> comboBox1;
    private JLabel label7;
    private JTextField textField3;
    private JLabel label4;
    private JPasswordField passwordField2;
    private JLabel label5;
    private JPasswordField passwordField1;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton returnButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
