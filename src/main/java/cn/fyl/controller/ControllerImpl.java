package cn.fyl.controller;

import cn.fyl.view.login.LoginView;

/**
 * @author fyl
 */
public class ControllerImpl {
    public void start() {
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
    }
}
