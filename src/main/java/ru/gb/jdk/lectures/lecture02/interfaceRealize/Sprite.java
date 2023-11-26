package ru.gb.jdk.lectures.lecture02.interfaceRealize;

import java.awt.*;

/**
 * класс Sprite описывает поведние объекта и его свойства
 * за координаты объекта берется центр объекта
 */
public abstract class Sprite {
    protected float x;
    protected float y;
    protected float halfWidth;
    protected float halfHeight;

    protected float getLeft() {
        return x - halfWidth;
    }

    protected void setLeft(float left) {
        x = left + halfWidth;
    }

    protected float getRight() {
        return x + halfWidth;
    }

    protected void setRight(float right) {
        x = right - halfWidth;
    }

    protected float getTop() {
        return y - halfHeight;
    }

    protected void setTop(float top) {
        y = top + halfHeight;
    }

    protected float getBottom() {
        return y + halfHeight;
    }

    protected void setBottom(float bottom) {
        y = bottom - halfWidth;
    }

    protected float getWidth() {
        return 2f * halfWidth;
    }

    protected float getHeight() {
        return 2f * halfHeight;
    }

    void update(MainCanvas canvas, float deltaTime){}
    void render(MainCanvas canvas, Graphics g){

    }
}
