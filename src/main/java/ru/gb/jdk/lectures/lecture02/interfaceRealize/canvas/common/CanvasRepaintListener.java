package ru.gb.jdk.lectures.lecture02.interfaceRealize.canvas.common;

import java.awt.*;

public interface CanvasRepaintListener {
    void onDrawFrame(MainCanvas canvas, Graphics g, float deltaTime);
}
