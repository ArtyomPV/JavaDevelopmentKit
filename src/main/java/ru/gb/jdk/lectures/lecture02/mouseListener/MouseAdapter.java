package ru.gb.jdk.lectures.lecture02.mouseListener;

public class MouseAdapter implements MouseListener{
    @Override
    public void mouseUp() {

    }

    @Override
    public void mouseDown() {

    }

    static void addMouseListener(MouseListener m){
        m.mouseDown();
        m.mouseUp();
    }
}
