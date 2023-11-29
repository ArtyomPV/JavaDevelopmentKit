package ru.gb.jdk.seminars.seminar01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatApp extends JFrame {
    public static int windowHeight = 500;
    public static int windowWidth = 500;
    public static int windowPosX = 300;
    public static int windowPosY = 300;
    private final String[] names = {"Ivan", "Artyom", "Petr"};
    JLabel labelLogin = new JLabel("Enter login:");
    JLabel labelPassword = new JLabel("Enter password:");
    JLabel labelIP = new JLabel("Enter IP:");
    JLabel labeSendMessage = new JLabel("Enter message:");
    JLabel labeMessage = new JLabel("Comming message:");
    JList<String> users = new JList<>(names);
    JTextField fieldLogin = new JTextField("Enter login");
    JTextField fieldPassword = new JTextField();
    JTextField fieldIP = new JTextField();
    JTextField fieldSendMessage = new JTextField();
    JTextArea areaChat = new JTextArea();
    JButton btnConnect = new JButton("Connect");
    JButton btnSend = new JButton("Send message");

    JPanel chatServer = new JPanel(new GridLayout(8, 1));
    JPanel chatClient = new JPanel(new GridLayout(3, 1));
    JPanel main = new JPanel(new GridLayout(1, 2));
    JPanel buttons = new JPanel(new GridLayout(1, 2));

ChatApp(){
    StringBuilder text = new StringBuilder();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(windowWidth, windowHeight);
    setLocation(windowPosY, windowPosX);
    setTitle("my chat");
    setVisible(true);
//    setLayout(new GridLayout(1, 2));
    add(main);
    main.add(chatServer);
    main.add(chatClient);

    chatServer.add(labelLogin);
    chatServer.add(fieldLogin);
    chatServer.add(labelPassword);
    chatServer.add(fieldPassword);
    chatServer.add(labelIP);
    chatServer.add(fieldIP);
    chatServer.add(labeSendMessage);
    chatServer.add(fieldSendMessage);
    buttons.add(btnConnect);

    chatClient.add(labeMessage);
    chatClient.add(areaChat);
    buttons.add(btnSend);




//    add(chatServer);
//    add(chatClient);
    add(buttons, BorderLayout.SOUTH);

    btnSend.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
//            String message = fieldSendMessage.getText();
//            text.append(message);
//            text.append("\n");
//            areaChat.setText(text.toString());
            areaChat.append(fieldLogin.getText() + ":" + fieldSendMessage.getText());
            areaChat.append("\n");
//            System.out.println("Сообщение отправлено: " + message);
        }
    });
}
}