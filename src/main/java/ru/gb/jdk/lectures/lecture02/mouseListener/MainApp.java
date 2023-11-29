package ru.gb.jdk.lectures.lecture02.mouseListener;

public class MainApp {
    public static void main(String[] args) {
        MouseAdapter mouseAdapter = new MouseAdapter();
        mouseAdapter.mouseDown();
        mouseAdapter.mouseUp();

        MouseAdapter.addMouseListener(mouseAdapter);
        MouseAdapter.addMouseListener(new MouseAdapter());
        MouseAdapter l = new MouseAdapter() {

            @Override
            public void mouseUp() {

            }

            @Override
            public void mouseDown() {

            }
        };

    }
}
