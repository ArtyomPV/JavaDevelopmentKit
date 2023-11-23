package ru.gb.jdk.seminars.seminar01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerApp extends JFrame{
    public static int windowHeight = 500;
    public static int windowWidth = 500;
    public static int windowPosX = 300;
    public static int windowPosY = 300;
    JButton serverUp = new JButton("Server start");
    JButton serverDown = new JButton("Server stop");
    JTextField fieldInfo = new JTextField("Server is OFF");

    static boolean isServerWorking;

    ServerApp(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(windowWidth, windowHeight);
        setLocation(windowPosX, windowPosY);
        setTitle("my server");
        setResizable(false);
//        setLayout(new GridLayout(2, 1));
        setVisible(true);

        JPanel buttons = new JPanel(new GridLayout(1, 2));
        serverUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWorking = true;
                serverStatus();
                fieldInfo.setText("Server is running!");
            }
        });
        serverDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!isServerWorking) {
                    fieldInfo.setText("Server is not ON!");
                } else {
                    fieldInfo.setText("Server is stopped! ");
                }
                isServerWorking = false;
                serverStatus();
            }
        });


        buttons.add(serverUp);
        buttons.add(serverDown);
        add(buttons);
        add(fieldInfo, BorderLayout.SOUTH);
    }
    public static void serverStatus(){
        System.out.println("Server status: " + isServerWorking);
    }

//    public ServerApp(int height, int width, int posX, int posY) {
//        this.windowHeight = height;
//    }
}
