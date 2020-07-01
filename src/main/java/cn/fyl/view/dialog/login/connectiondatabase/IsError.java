/*
 * Created by JFormDesigner on Sat Jun 27 11:47:59 CST 2020
 */

package cn.fyl.view.dialog.login.connectiondatabase;

import net.miginfocom.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
        label2 = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        setTitle("\u8fde\u63a5\u51fa\u9519");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
            swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border
            . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog"
            ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,dialogPane. getBorder
            ( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
            .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException
            ( ); }} );
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
                    "[]" +
                    "[]"));

                //---- label1 ----
                label1.setText("\u8fde\u63a5\u6570\u636e\u5e93\u65f6\u51fa\u73b0\u9519\u8bef");
                label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
                contentPanel.add(label1, "cell 1 1,alignx center,growx 0");

                //---- label2 ----
                label2.setText("\u8bf7\u68c0\u67e5\u76f8\u5173\u670d\u52a1\u5e76\u91cd\u542f\u7a0b\u5e8f");
                label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
                contentPanel.add(label2, "cell 1 2,alignx center,growx 0");
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
                buttonBar.add(okButton, "cell 0 0");
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
    private JLabel label2;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
