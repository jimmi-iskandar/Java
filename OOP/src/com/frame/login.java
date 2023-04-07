package com.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class login {
    public static void log() {
        JFrame windows = new JFrame();
        JPanel background = new JPanel();

        windows.setSize(600, 400);
        windows.setTitle("Login");
        background.setSize(600, 400);
        background.setBackground(Color.BLUE);

        windows.setVisible(true);
        windows.add(background);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) throws Exception {
        login logg = new login();
        logg.log();
    }

}
