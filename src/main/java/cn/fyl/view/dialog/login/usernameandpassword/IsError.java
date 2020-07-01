/*
 * Created by JFormDesigner on Sat Jun 27 10:56:49 CST 2020
 */

package cn.fyl.view.dialog.login.usernameandpassword;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author notfound
 */
public class IsError extends JDialog {
    public IsError() {
        super((Dialog) null, true);
        initComponents();
    }

    private void okButtonMouseReleased(MouseEvent e) {
        this.dispose();
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - notfound
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        setTitle("\u8ba4\u8bc1\u5931\u8d25");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing.
            border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border . TitledBorder. CENTER
            ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg", java .awt . Font
            . BOLD ,12 ) ,java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener(
            new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er"
            .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new MigLayout(
                    "fill,insets dialog,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label1 ----
                label1.setText("\u7528\u6237\u540d\u6216\u5bc6\u7801\u9519\u8bef");
                label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
                contentPanel.add(label1, "cell 1 1,alignx center,growx 0");
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setLayout(new MigLayout(
                    "insets dialog,alignx center",
                    // columns
                    "[button,fill]",
                    // rows
                    null));

                //---- okButton ----
                okButton.setText("\u786e \u8ba4");
                okButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                okButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        okButtonMouseReleased(e);
                    }
                });
                buttonBar.add(okButton, "cell 0 0,alignx center,growx 0");
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(400, 200);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - notfound
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
