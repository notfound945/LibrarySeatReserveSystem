/*
 * Created by JFormDesigner on Fri Jul 03 22:55:07 CST 2020
 */

package cn.fyl.view.dialog;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author phl
 */
public class ProxyOkDialog extends JDialog {
    public ProxyOkDialog(Window owner, String title, String contentTitle, String content1, String content2) {
        super((Dialog) null, true);
        initComponents();
        init(title, contentTitle, content1, content2);
    }

    private void init(String title, String contentTitle, String content1, String content2) {
       this.setTitle(title);
       this.contentTitle.setText(contentTitle);
       this.content1.setText(content1);
       this.content2.setText(content2);
    }

    private void okButtonMouseReleased(MouseEvent e) {
        this.dispose();
    }

    private void okButtonKeyReleased(KeyEvent e) {
        if (e.getKeyCode() == 32) {
            this.dispose();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - phl
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        contentTitle = new JLabel();
        content1 = new JLabel();
        content2 = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        setTitle("\u4ee3\u7406\u5bf9\u8bdd\u6846");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder (
            0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder
            . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .
            red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java .
            beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
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
                    "[]"));

                //---- contentTitle ----
                contentTitle.setText("\u6807\u9898");
                contentTitle.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
                contentPanel.add(contentTitle, "cell 1 1 5 1,alignx center,growx 0");

                //---- content1 ----
                content1.setText("\u4e3b\u4f53\u5185\u5bb91");
                content1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
                contentPanel.add(content1, "cell 1 3 5 1,alignx center,growx 0");

                //---- content2 ----
                content2.setText("\u4e3b\u4f53\u5185\u5bb92");
                content2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
                contentPanel.add(content2, "cell 1 5 5 1,alignx center,growx 0");
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
                okButton.setText("\u786e\u8ba4");
                okButton.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                okButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        okButtonMouseReleased(e);
                    }
                });
                okButton.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyReleased(KeyEvent e) {
                        okButtonKeyReleased(e);
                    }
                });
                buttonBar.add(okButton, "cell 0 0");
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(500, 250);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - phl
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel contentTitle;
    private JLabel content1;
    private JLabel content2;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
