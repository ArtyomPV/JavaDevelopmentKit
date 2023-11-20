package ru.gb.jdk.lecture01.game;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 230;
    private static final int WINDOW_WIDTH = 350;
    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;
    private static final String FIELD_SIZE_PREFIX = "Установленный размер поля: ";
    private static final int MIN_WIN_LINE = 3;
    private static final int MAX_WIN_LINE = 10;
    private static final String WIN_LINE_PREFIX = "Установленная длина: ";

    ButtonGroup groupMode = new ButtonGroup();
    JRadioButton manVsComputer = new JRadioButton("Человек против компьютера");
    JRadioButton manVsMan = new JRadioButton("Человек против человека");


    JLabel labelModeGame = new JLabel("Выберите режим игры");
    JLabel labelChooseFieldSize = new JLabel("Выберите размеры поля");
    JLabel labelSettedFieldSize = new JLabel(FIELD_SIZE_PREFIX + MIN_FIELD_SIZE);
    JLabel labelChooseWinLine = new JLabel("Выберите длину для победы»");
    JLabel labelSettedWinLine = new JLabel(WIN_LINE_PREFIX + MIN_WIN_LINE);

    JSlider sliderFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
    JSlider sliderWinLine = new JSlider(MIN_WIN_LINE, MAX_WIN_LINE, MIN_WIN_LINE);
    JButton btnStart = new JButton("Start new game");

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

        sliderFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelSettedFieldSize.setText(FIELD_SIZE_PREFIX + sliderFieldSize.getValue());
            }
        });

        sliderWinLine.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelSettedWinLine.setText(WIN_LINE_PREFIX + sliderWinLine.getValue());
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
