package ru.gb.jdk.lectures.lecture02.interfaceRealize.canvas.circles;

import ru.gb.jdk.lectures.lecture02.interfaceRealize.canvas.common.MainCanvas;
import ru.gb.jdk.lectures.lecture02.interfaceRealize.canvas.common.Sprite;

import java.awt.*;
import java.util.Random;

public class Ball extends Sprite {
    private static Random rnd = new Random();
    private final Color color;
    private float vX;
    private float vY;

    public Ball(){
        halfHeight = 20 + (float)(Math.random()*50f);
        halfWidth  = halfHeight;
        color = new Color(rnd.nextInt());
        vX = 100f + (float)(Math.random()*200f);
        vY = (float) (100f + Math.random()*200f);

    }

    /**
     * считаются координаты объекта и при достижении границ ходлста меняется вектор движения на противопложный
     * @param canvas холст
     * @param deltaTime количество времени на которое чолст отключается
     */
    @Override
    public void update(MainCanvas canvas, float deltaTime){
        x += vX*deltaTime;
        y += vY*deltaTime;

        if(getLeft() < canvas.getLeft()){
            setLeft(canvas.getLeft());
            vX = -vX;
        }
        if(getRight() > canvas.getRight()){
            setRight(canvas.getRight());
            vX = -vX;
        }
        if(getTop() < canvas.getTop()){
            setTop(canvas.getTop());
            vY = -vY;
        }
        if(getBottom() > canvas.getBottom()){
            setBottom(canvas.getBottom());
            vY = -vY;
        }

    }

    @Override
    public void render(MainCanvas canvas, Graphics g) {
        g.setColor(color);
        g.fillOval((int)getLeft(), (int)getTop(), (int)getWidth(), (int)getHeight());
    }
}
