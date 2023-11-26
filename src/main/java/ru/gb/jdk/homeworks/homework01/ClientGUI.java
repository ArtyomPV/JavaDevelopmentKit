package ru.gb.jdk.homeworks.homework01;

import ru.gb.jdk.homeworks.homework01.Controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.util.ArrayList;
import java.util.List;
public class ClientGUI extends JFrame {

    private List<String> listMessages;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;

    private final JTextArea log = new JTextArea();

    private final JPanel panelTop = new JPanel();
    private final JPanel panelServer = new JPanel(new GridLayout(2, 4));
    private final JLabel labelIpAddress = new JLabel("IP address: ");
    private final JTextField textIpAddress = new JTextField();
    private final JLabel labelPort = new JLabel("port: ");
    private final JTextField textPort = new JTextField();
    private final JLabel labelLogin = new JLabel("login: ");
    private final JTextField textLogin = new JTextField();
    private final JLabel labelPassword = new JLabel("password");
    private final JTextField textPassword = new JTextField();

    private final JButton btnlogin = new JButton("log in");

    private final JPanel panelBottom = new JPanel(new BorderLayout());
    private final JPanel panelClient = new JPanel(new GridLayout(2, 1));
    private final JLabel labelMessage = new JLabel("message");
    private final JTextField textMessage = new JTextField();
    private final JButton btnSend = new JButton("Send");

    private void append() {
        String messageText = textLogin.getText() + ": " + textMessage.getText() + "\n";
        log.append(messageText);
        listMessages.add(messageText);
        textMessage.setText(null);
        textMessage.grabFocus();
    }
    public List<String> getAllMessages(){
        return listMessages;
    }

    public void setAllMessages(String[] lines){
        for(String line: lines){
            log.append(line);
            log.append("\n");
        }
    }
    ClientGUI(String[] lines) {
        listMessages = new ArrayList<>();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(WIDTH, HEIGHT);
        setTitle("chat client");


//        btnlogin.setBorder(new BevelBorder(10, Color.BLUE, Color.CYAN));
        btnlogin.setMargin(new Insets(5, 15, 5, 15));

        panelServer.add(labelIpAddress);
        panelServer.add(textIpAddress);
        panelServer.add(labelPort);
        panelServer.add(textPort);
        panelServer.add(labelLogin);
        panelServer.add(textLogin);
        panelServer.add(labelPassword);
        panelServer.add(textPassword);

        panelTop.add(panelServer);
        panelTop.add(btnlogin, BorderLayout.WEST);
        add(panelTop, BorderLayout.NORTH);

        panelClient.add(labelMessage);
        panelClient.add(textMessage);
        panelBottom.add(panelClient);
        panelBottom.add(btnSend, BorderLayout.EAST);
        add(panelBottom, BorderLayout.SOUTH);

        log.setAutoscrolls(true);
        setAllMessages(lines);
        textMessage.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
//                log.setText(KeyEvent.getKeyText(e.getKeyCode()));
                if (e.getKeyCode() == KeyEvent.VK_ENTER) append();
                System.out.println(KeyEvent.getKeyText(e.getKeyCode()));
            }
        });


        add(log, BorderLayout.CENTER);
        setVisible(true);

        btnSend.addActionListener(e -> {
            append();
        });


    }
}
