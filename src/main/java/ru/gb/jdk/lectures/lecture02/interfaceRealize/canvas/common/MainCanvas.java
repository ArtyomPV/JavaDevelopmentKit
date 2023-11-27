package ru.gb.jdk.lectures.lecture02.interfaceRealize.canvas.common;

import ru.gb.jdk.lectures.lecture02.interfaceRealize.canvas.circles.MainWindow;

import javax.swing.*;
import java.awt.*;

/**
 * MainCanvas вызывает метод onDrawFrame основного окна и имеет ссылку на основное окно
 */
public class MainCanvas extends JPanel {
    private final MainWindow controller;
    // время последнего обновления кадра
    private long lastTimeFrame;
    public MainCanvas(MainWindow controller){
        this.controller = controller;
        lastTimeFrame = System.nanoTime();
        setBackground(Color.BLUE);
    }

    /**
     * Прорисовка компонента на каждой итерации засыпает на 16 милисекунд
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try{
            Thread.sleep(16);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //вычисление дельты времени между кадрами холста
        float deltaTime = (System.nanoTime() - lastTimeFrame)*0.000000001f;
        controller.onDrawFrame(this, g, deltaTime);
        lastTimeFrame = System.nanoTime();
        repaint();
    }

    /**
     * метод возвращает левую границу панели
     * @return левая граница панели
     */
    public int getLeft(){return 0;}
    /**
     * метод возвращает правую границу панели
     * @return правая граница панели
     */
    public int getRight(){return getWidth() -1;}
    /**
     * метод возвращает верхнюю границу панели
     * @return верхняя граница панели
     */
    public int getTop(){return 0;}

    /**
     * метод возвращает нижнюю границу панели
     * @return нижняя граница панели
     */
    public int getBottom(){return getHeight() - 1;}
}
