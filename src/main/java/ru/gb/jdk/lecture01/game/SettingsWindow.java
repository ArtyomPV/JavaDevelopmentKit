package ru.gb.jdk.lecture01.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 230;
    private static final int WINDOW_WIDTH = 350;
    ButtonGroup groupMode = new ButtonGroup();
    JRadioButton manVsComputer = new JRadioButton("Человек против компьютера");
    JRadioButton manVsMan = new JRadioButton("Человек против человека");


    JLabel labelModeGame = new JLabel("Выберите режим игры");
    JLabel labelChooseFieldSize = new JLabel("Выберите размеры поля");
    JLabel labelSettedFieldSize = new JLabel("Установленный размер поля:");
    JLabel labelChooseWinLine = new JLabel("Выберите длину для победы»");
    JLabel labelSettedWinLine = new JLabel("Установленная длина:");
    JSlider sliderFieldSize = new JSlider(3, 10, 6);
    JSlider sliderWinLine = new JSlider(3, 10, 4);
    JButton btnStart = new JButton("Start new game");
    JPanel panelSettings = new JPanel(new FlowLayout());
    public SettingsWindow(GameWindow gameWindow){
        setLocationRelativeTo(gameWindow);
        setLayout(new GridLayout(10,1));
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameWindow.startNewGame(0,3, 3,3);
                setVisible(false);
            }
        });

        add(labelModeGame);
        groupMode.add(manVsComputer);
        groupMode.add(manVsMan);
        add(manVsComputer);
        add(manVsMan);

        add(labelChooseFieldSize);
        add(labelSettedFieldSize);
        add(sliderFieldSize);

        add(labelChooseWinLine);
        add(labelSettedWinLine);
        add(sliderWinLine);
        add(btnStart, BorderLayout.SOUTH);

    }
}
