package ru.gb.jdk.seminars.seminar02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ServerApp extends JFrame implements Listener{
    public static int windowHeight = 500;
    public static int windowWidth = 500;
    public static int windowPosX = 300;
    public static int windowPosY = 300;
    JButton serverUp = new JButton("Server start");
    JButton serverDown = new JButton("Server stop");
    JTextField fieldInfo = new JTextField("Server is OFF");

    static boolean isServerWorking;
    ServerListener server;
    List<String> logs = new ArrayList<>();
    ServerApp(){
        server = new Server(this);
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
//                server.start();
                server.serverListener(true);
//                isServerWorking = true;
//                serverStatus();
//                fieldInfo.setText("Server is running!");
            }
        });
        serverDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                server.stop();
                server.serverListener(false);
//                if(!isServerWorking) {
//                    fieldInfo.setText("Server is not ON!");
//                } else {
//                    fieldInfo.setText("Server is stopped! ");
//                }
//                isServerWorking = false;
//                serverStatus();
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

    /**
     * Внутри метода можно выполнять любые действия
     * выводить информацию в консоль, на панель, записать в файл
     * @param text Любая информация
     */
    @Override
    public void messageRes(String text) {
        System.out.println(text);
        logs.add(text);
        fieldInfo.setText(text);
    }

}
