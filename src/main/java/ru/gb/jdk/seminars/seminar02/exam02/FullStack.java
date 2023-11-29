package ru.gb.jdk.seminars.seminar02.exam02;

public class FullStack extends Developer implements BackendAction, FrontendAction{
    @Override
    public void makeBack() {
        System.out.println("program backend");
    }

    @Override
    public void makeFront() {
        System.out.println("program frontend");
    }
}
