package ru.gb.jdk.seminars.seminar02.exam02;

import java.util.ArrayList;
import java.util.List;

public class MainApp {


    public static void main(String[] args) {
        Developer dev = new BackEnder();
        Developer dev1 = new FullStack();
        Developer dev2 = new Frontender();
        List<Developer> developers = new ArrayList<>();
        developers.add(dev);
        developers.add(dev1);
        developers.add(dev2);
        for(Developer developer: developers) {
            if (developer instanceof Frontender) ((Frontender) developer).makeFront();
        }
    }
}
