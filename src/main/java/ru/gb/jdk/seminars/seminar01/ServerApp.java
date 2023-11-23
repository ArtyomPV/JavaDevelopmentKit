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
    JButton serverUp = new JButton("Server running");
    JButton serverDown = new JButton("Server stopped");


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
            }
        });
        serverDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
