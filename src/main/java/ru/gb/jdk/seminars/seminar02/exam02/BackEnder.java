package ru.gb.jdk.seminars.seminar02.exam02;

public class BackEnder extends Developer implements BackendAction{
    @Override
    public void makeBack() {
        System.out.println("program backend");
    }
}
