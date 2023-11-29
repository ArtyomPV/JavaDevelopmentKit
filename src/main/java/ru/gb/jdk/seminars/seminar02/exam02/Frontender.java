package ru.gb.jdk.seminars.seminar02.exam02;

public class Frontender extends Developer implements FrontendAction{
    @Override
    public void makeFront() {
        System.out.println("program frontend");
    }
}
