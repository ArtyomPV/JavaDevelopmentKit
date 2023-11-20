package ru.gb.jdk.lecture01.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow  extends JFrame {
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 50;

    Map map = new Map();
    SettingsWindow settings;

    JButton btnStart = new JButton("New Game");
    JButton btnExit = new JButton("Exit");

    public GameWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("TicTacToe");
        setResizable(false);

        setLocation(WINDOW_POSX, WINDOW_POSY);
        settings = new SettingsWindow(this);

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });

        JPanel panBottom = new JPanel(new GridLayout(1, 2));
        panBottom.add(btnStart);
        panBottom.add(btnExit);
        add(panBottom, BorderLayout.SOUTH);


        add(map);
        setVisible(true);

//        settings.setVisible(true);


    }

    public void startNewGame(int mode, int fSzX, int fSzY, int wLen) {
        map.startNewGame(mode, fSzX, fSzY, wLen);
    }
}
