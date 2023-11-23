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


    static boolean isServerWorking;

    ServerApp(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(windowWidth, windowHeight);
        setLocation(windowPosX, windowPosY);
        setTitle("my server");
        setResizable(false);
        setLayout(new GridLayout(1, 2));
        setVisible(true);
        serverUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWorking = true;
                serverStatus();
                serverUp.setText("Server is running");
                serverDown.setText("Server stop");
            }
        });
        serverDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!isServerWorking) {
                    serverDown.setText("Server is not ON!");
                } else {
                    serverDown.setText("Server is OFF!");
                    serverUp.setText("Server start");
                }
                isServerWorking = false;
                serverStatus();
            }
        });



        add(serverUp);
        add(serverDown);
    }
    public static void serverStatus(){
        System.out.println("Server status: " + isServerWorking);
    }

//    public ServerApp(int height, int width, int posX, int posY) {
//        this.windowHeight = height;
//    }
}
