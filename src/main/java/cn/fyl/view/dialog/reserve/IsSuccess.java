import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Jul 01 16:37:59 CST 2020
 */



/**
 * @author notfound
 */
public class IsSuccess extends JDialog {
    public IsSuccess(Window owner) {
        super(owner);
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - notfound
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setTitle("\u9884\u5b9a\u6210\u529f");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
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
            "[]"));

        //---- label1 ----
        label1.setText("\u9884\u5b9a\u6210\u529f");
        label1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
        contentPane.add(label1, "cell 2 1,alignx center,growx 0");

        //---- label2 ----
        label2.setText("\u4f60\u5df2\u6210\u529f\u9884\u5b9a\u4e86 \u56fe\u4e66\u9986\u4e00\u697c  A2 \u53f7\u5ea7\u4f4d");
        label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
        contentPane.add(label2, "cell 2 3");

        //---- button1 ----
        button1.setText("\u786e\u8ba4");
        contentPane.add(button1, "cell 2 5");
        setSize(400, 200);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - notfound
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
