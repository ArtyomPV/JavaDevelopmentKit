package ru.gb.jdk.lecture01.game;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    Map(){
//        setBackground(Color.BLACK);
    }
    public void startNewGame(int mode, int fSzX, int fSzY, int wLen){
        System.out.printf("Mode: %d;\nSize: x=%d, y=%d;\nWindow length: %d", mode, fSzX, fSzY, wLen);
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        render(g);
    }
    private void render(Graphics g){

    }
}
