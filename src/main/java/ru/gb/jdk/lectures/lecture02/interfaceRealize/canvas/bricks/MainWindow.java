package ru.gb.jdk.lectures.lecture02.interfaceRealize.canvas.bricks;

import ru.gb.jdk.lectures.lecture02.interfaceRealize.canvas.circles.Background;
import ru.gb.jdk.lectures.lecture02.interfaceRealize.canvas.circles.Ball;
import ru.gb.jdk.lectures.lecture02.interfaceRealize.canvas.common.CanvasRepaintListener;
import ru.gb.jdk.lectures.lecture02.interfaceRealize.canvas.common.Interactable;
import ru.gb.jdk.lectures.lecture02.interfaceRealize.canvas.common.MainCanvas;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame implements CanvasRepaintListener {
    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEGHT =600;

    private Interactable[] sprites = new Interactable[10];

    public MainWindow(){
        init();

        MainCanvas canvas = new MainCanvas(this);
        add(canvas);
//        for (Sprite sprite: sprites) {
//            sprite = new Ball();
//
//        }
        sprites[0] = new Background();
        for (int i = 1; i < sprites.length; i++) {
            sprites[i] = new Brick();
        }
    }

    /**
     * Метод вызывается canvas и содержит бизнес-логику
     *      * обновляет холст(canvas) и заставляет объекты рисовать самих себя
     * @param canvas холст
     * @param g графический элемент
     * @param deltaTime промежуток времени через который будет происходить прорисовка
     */
    @Override
    public void onDrawFrame(MainCanvas canvas, Graphics g, float deltaTime){
        update(canvas, deltaTime);
        render(canvas, g);
    }

    /**
     * изменяет состояние приложения
     */
    private void update(MainCanvas canvas, float deltaTime) {
//        for(Sprite sprite: sprites){
//            sprite.update(canvas, deltaTime);
//        }
        for (Interactable sprite : sprites) {
            sprite.update(canvas, deltaTime);
        }
    }

    /***
     * Отдает команды рисующимя компонентам
     * передается объект холста и объект графики
     * холст пересчитывает время и перерисовывает себя
     * и сообщает об этом основному окну
     */
    private void render(MainCanvas canvas,Graphics g) {
        for(Interactable sprite: sprites){
            sprite.render(canvas, g);
        }
    }

    private void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH,WINDOW_HEGHT);
        setTitle("Circle");
        setVisible(true);
    }
}
