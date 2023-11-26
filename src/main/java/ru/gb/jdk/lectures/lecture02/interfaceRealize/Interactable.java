package ru.gb.jdk.lectures.lecture02.interfaceRealize;

import java.awt.*;

public interface Interactable {
    void update(MainCanvas canvas, float deltaTime);
    void render(MainCanvas canvas, Graphics g);
}
