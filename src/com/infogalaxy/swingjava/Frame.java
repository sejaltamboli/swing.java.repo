package com.infogalaxy.swingjava;
import sun.plugin2.util.ParameterNames;

import java.awt.*;

import javax.swing.*;

public class Frame {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel lblUsername = new JLabel();
    JTextField txtUsername = new JTextField();
    JLabel lblPassword = new JLabel();
    JTextField txtPassword = new JTextField();
    JButton btnLogin = new JButton("LogIn");
    JButton btnCancel = new JButton("Cancel");
    public Frame() {
        lblUsername.setBounds(20, 20, 150, 30);
        lblUsername.setText("Enter the Username :");
        panel.add(lblUsername);

        txtUsername.setBounds(20, 60, 150, 30);
        panel.add(txtUsername);

        lblPassword.setBounds(20, 100, 150, 30);
        lblPassword.setText("Enter the Password :");
        panel.add(lblPassword);

        txtPassword.setBounds(20, 140, 150, 30);
        panel.add(txtPassword);

        btnLogin.setBounds(20, 180, 70, 30);
        panel.add(btnLogin);

        btnCancel.setBounds(100, 180, 80, 30);
        panel.add(btnCancel);

        panel.setLayout(null);
        frame.add(panel);

        frame.setTitle("My Frame 1");
        frame.setSize(400, 600);
        frame.setLocation(100, 50);
        frame.setVisible(true);
    }
}

class Main{
    public static void main(String[] args) {
        Frame frame = new Frame();
    }
}

