package cn.fyl;

import cn.fyl.controller.ControllerImpl;
import cn.fyl.domain.User;
import cn.fyl.view.mainview.MainView;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.MaterialOceanicTheme;

import javax.swing.*;

/**
 * 入口
 * @author phl
 */
public class Main {
    public static void main(String[] args) {
        // 配置Swing窗体UI
        try {
            UIManager.setLookAndFeel (new MaterialLookAndFeel());
            if (UIManager.getLookAndFeel() instanceof MaterialLookAndFeel){
                MaterialLookAndFeel.changeTheme(new MaterialOceanicTheme());
            }
        }
        catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace ();
        }
        // 程序入口
//        ControllerImpl controllerImpl = new ControllerImpl();
//        controllerImpl.start();
        new MainView(new User()).setVisible(true);
    }
}

