/*
 * Created by JFormDesigner on Thu Jun 25 12:47:12 CST 2020
 */

package cn.fyl.view.mainview.administrator;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author notfound
 */
public class MainViewAdmin extends JFrame {
    public MainViewAdmin() {
        initComponents();
    }

    private void exitButtonKeyReleased(KeyEvent e) {
        // TODO add your code here
        System.exit(0);
    }

    private void exitButtonMouseReleased(MouseEvent e) {
        System.exit(0);
        // TODO add your code here
    }

    private void createUIComponents() {
        // TODO: add custom component creation code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - notfound
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        label16 = new JLabel();
        label17 = new JLabel();
        panel15 = new JPanel();
        panel2 = new JPanel();
        tabbedPane3 = new JTabbedPane();
        panel13 = new JPanel();
        panel8 = new JPanel();
        panel9 = new JPanel();
        panel3 = new JPanel();
        tabbedPane4 = new JTabbedPane();
        panel10 = new JPanel();
        panel12 = new JPanel();
        panel14 = new JPanel();
        tabbedPane5 = new JTabbedPane();
        panel16 = new JPanel();
        panel17 = new JPanel();
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
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setTitle("\u56fe\u4e66\u9986\u5ea7\u4f4d\u9884\u5b9a\u7cfb\u7edf-\u7ba1\u7406\u7aef V1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
            . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder
            . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .
            awt .Font .BOLD ,12 ), java. awt. Color. red) ,dialogPane. getBorder( )) )
            ; dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
            ;
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
                            "[fill]",
                            // rows
                            "[]" +
                            "[]" +
                            "[]" +
                            "[]" +
                            "[]"));

                        //---- label16 ----
                        label16.setText("\u6b22\u8fce\u7ba1\u7406\u5458");
                        label16.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 22));
                        label16.setIcon(null);
                        panel1.add(label16, "cell 0 1");

                        //---- label17 ----
                        label17.setText("\u7b26\u7389\u6d9f");
                        label17.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 22));
                        panel1.add(label17, "cell 1 1");
                    }
                    tabbedPane1.addTab("\u6b22\u8fce", panel1);

                    //======== panel15 ========
                    {
                        panel15.setLayout(new MigLayout(
                            "hidemode 3",
                            // columns
                            "[fill]" +
                            "[fill]",
                            // rows
                            "[]" +
                            "[]" +
                            "[]"));
                    }
                    tabbedPane1.addTab("\u901a\u77e5\u53d1\u5e03", panel15);

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

                            //======== panel13 ========
                            {
                                panel13.setLayout(new MigLayout(
                                    "hidemode 3",
                                    // columns
                                    "[fill]" +
                                    "[fill]",
                                    // rows
                                    "[]" +
                                    "[]" +
                                    "[]"));
                            }
                            tabbedPane3.addTab("\u67e5\u770b\u5ea7\u4f4d\u5206\u5e03", panel13);

                            //======== panel8 ========
                            {
                                panel8.setLayout(new MigLayout(
                                    "hidemode 3",
                                    // columns
                                    "[fill]" +
                                    "[fill]",
                                    // rows
                                    "[]" +
                                    "[]" +
                                    "[]"));
                            }
                            tabbedPane3.addTab("\u8c03\u6574/\u4fee\u6539\u5ea7\u4f4d\u5206\u5e03", panel8);

                            //======== panel9 ========
                            {
                                panel9.setLayout(new MigLayout(
                                    "hidemode 3",
                                    // columns
                                    "[fill]" +
                                    "[fill]",
                                    // rows
                                    "[]" +
                                    "[]" +
                                    "[]"));
                            }
                            tabbedPane3.addTab("\u9884\u5b9a\u6d88\u606f", panel9);
                        }
                        panel2.add(tabbedPane3, "cell 0 0,dock center");
                    }
                    tabbedPane1.addTab("\u5ea7\u4f4d\u7ba1\u7406", panel2);

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
                                panel10.setLayout(new MigLayout(
                                    "hidemode 3",
                                    // columns
                                    "[fill]" +
                                    "[fill]",
                                    // rows
                                    "[]" +
                                    "[]" +
                                    "[]"));
                            }
                            tabbedPane4.addTab("\u67e5\u770b\u5b66\u751f\u4fe1\u606f", panel10);

                            //======== panel12 ========
                            {
                                panel12.setLayout(new MigLayout(
                                    "hidemode 3",
                                    // columns
                                    "[fill]" +
                                    "[fill]",
                                    // rows
                                    "[]" +
                                    "[]" +
                                    "[]"));
                            }
                            tabbedPane4.addTab("\u4fee\u6539\u5b66\u751f\u4fe1\u606f", panel12);
                        }
                        panel3.add(tabbedPane4, "cell 0 0,dock center");
                    }
                    tabbedPane1.addTab("\u5b66\u751f\u4fe1\u606f\u7ba1\u7406", panel3);

                    //======== panel14 ========
                    {
                        panel14.setLayout(new MigLayout(
                            "fillx,hidemode 3",
                            // columns
                            "[fill]",
                            // rows
                            "[]"));

                        //======== tabbedPane5 ========
                        {
                            tabbedPane5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));

                            //======== panel16 ========
                            {
                                panel16.setLayout(new MigLayout(
                                    "fillx,hidemode 3",
                                    // columns
                                    "[fill]" +
                                    "[fill]",
                                    // rows
                                    "[]" +
                                    "[]" +
                                    "[]"));
                            }
                            tabbedPane5.addTab("\u6240\u6709\u9884\u5b9a", panel16);

                            //======== panel17 ========
                            {
                                panel17.setLayout(new MigLayout(
                                    "hidemode 3",
                                    // columns
                                    "[fill]" +
                                    "[fill]",
                                    // rows
                                    "[]" +
                                    "[]" +
                                    "[]"));
                            }
                            tabbedPane5.addTab("\u9884\u5b9a\u7ba1\u7406", panel17);
                        }
                        panel14.add(tabbedPane5, "cell 0 0");
                    }
                    tabbedPane1.addTab("\u9884\u8ba2\u7ba1\u7406", panel14);

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
                                label12.setText("\u7ba1\u7406\u7aef V 1.0");
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
                                    textArea2.setText("release note - 2020.06.26 \n===================================== \n1.\u4f7f\u7528\u4e86\u57fa\u4e8eGoogle Material\u98ce\u683c\u7684Material-ui-swing\u505a\u7a97\u4f53\u754c\u9762\uff1b \n2.\u4f7f\u7528\u4e86\u53f7\u79f0Java\u8bed\u8a00\u4e2d\u6700\u597d\u7684\u6570\u636e\u5e93\u8fde\u63a5\u6c60\uff0c\u63d0\u4f9b\u7684\u5f3a\u5927\u7684\u76d1\u63a7\u548c\u6269\u5c55\u529f\u80fd\uff1b \n3.\u4f7f\u7528\u6784\u5efa\u5de5\u5177Maven\u7ba1\u7406\u9879\u76ee\u4f9d\u8d56\u4e0e\u6784\u5efa\u9879\u76ee\uff1b \n4.\u4f7f\u7528\u4e86\u7248\u672c\u63a7\u5236\u5de5\u5177git\uff0c\u5e76\u4e0a\u4f20\u6e90\u7801\u81f3github\uff1b \n5.\u4f7f\u7528JFormDesigner\u8bbe\u8ba1\u7a0b\u5e8f\u754c\u9762\uff1b \n6.\u6dfb\u52a0\u4e86\u4f9d\u8d56\u5305\u5de5\u5177mysql jdbc\u3001log4j\u7b49\u3002");
                                    textArea2.setWrapStyleWord(true);
                                    textArea2.setLineWrap(true);
                                    textArea2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
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
                                panel6.add(label4, "cell 1 1");

                                //---- label6 ----
                                label6.setText("\u5f00\u53d1\u8bed\u8a00\uff1a");
                                label6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel6.add(label6, "cell 0 2");

                                //---- label9 ----
                                label9.setText("Java");
                                panel6.add(label9, "cell 1 2");

                                //---- label5 ----
                                label5.setText("\u5f00\u53d1\u5de5\u5177\uff1a");
                                label5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel6.add(label5, "cell 0 3");

                                //---- label8 ----
                                label8.setText("Intellij IDEA & JFormDesigner");
                                panel6.add(label8, "cell 1 3");

                                //---- label7 ----
                                label7.setText("\u5f00\u53d1\u65e5\u671f\uff1a");
                                label7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                                panel6.add(label7, "cell 0 4");

                                //---- label10 ----
                                label10.setText("2020/06/22");
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
                                    textArea1.setText("Copyright 2020 fyl   \n\n\nPermission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the \"Software\"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:  The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.  THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.");
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
                    "[button,fill]" +
                    "[button,fill]",
                    // rows
                    null));

                //---- okButton ----
                okButton.setText("\u5207\u6362\u7528\u6237");
                okButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                buttonBar.add(okButton, "cell 0 0");

                //---- cancelButton ----
                cancelButton.setText("\u9000\u51fa\u7a0b\u5e8f");
                cancelButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                cancelButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        exitButtonMouseReleased(e);
                    }
                });
                buttonBar.add(cancelButton, "cell 1 0");
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 700);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - notfound
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JLabel label16;
    private JLabel label17;
    private JPanel panel15;
    private JPanel panel2;
    private JTabbedPane tabbedPane3;
    private JPanel panel13;
    private JPanel panel8;
    private JPanel panel9;
    private JPanel panel3;
    private JTabbedPane tabbedPane4;
    private JPanel panel10;
    private JPanel panel12;
    private JPanel panel14;
    private JTabbedPane tabbedPane5;
    private JPanel panel16;
    private JPanel panel17;
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
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
