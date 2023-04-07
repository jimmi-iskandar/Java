package com.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class login {
    public static void log() {
        JFrame windows = new JFrame();
        JPanel background = new JPanel();

        windows.setSize(600, 300);
        windows.setTitle("Login");
        background.setSize(600, 300);

        windows.setVisible(true);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) throws Exception {
        login logg = new login();
        logg.log();
    }

}
