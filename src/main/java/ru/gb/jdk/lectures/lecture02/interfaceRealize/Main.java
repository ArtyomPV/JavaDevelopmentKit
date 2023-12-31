package ru.gb.jdk.lectures.lecture02.interfaceRealize;

import ru.gb.jdk.lectures.lecture02.interfaceRealize.canvas.circles.MainWindow;
import ru.gb.jdk.lectures.lecture02.interfaceRealize.samplesInterfaces.*;


public class Main {
    public static void main(String[] args) {
        new MainWindow();
        new ru.gb.jdk.lectures.lecture02.interfaceRealize.canvas.bricks.MainWindow();

        Man man = new Man();        // class Man
        Ox ox = new Ox();           // claSS Ox

        Human man1 = new Man();     // interface Human
        Bull ox1 = new Ox();        // interface Bull

        Bull minos0 = new Minotaurus();
        Human minos1 = new Minotaurus();
        Minotaurus minos = new Minotaurus();

        Bull[] allBulls = {ox, ox1, minos0};
        Human[] allHumans = {man, man1, minos1};

    }
}