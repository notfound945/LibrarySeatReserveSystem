/*
 * Created by JFormDesigner on Sat Jun 27 12:22:29 CST 2020
 */

package cn.fyl.view.dialog;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author notfound
 */
public class ProcessLoading extends JDialog {
    public ProcessLoading(Window owner) {
        super(owner);
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - notfound
        label1 = new JLabel();
        progressBar1 = new JProgressBar();

        //======== this ========
        setTitle("\u6b63\u5728\u9a8c\u8bc1...");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("\u767b\u5f55\u4e2d......");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
        contentPane.add(label1, "cell 0 0");
        contentPane.add(progressBar1, "cell 0 1 3 1");
        setSize(500, 105);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - notfound
    private JLabel label1;
    private JProgressBar progressBar1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
