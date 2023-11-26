package ru.gb.jdk.lectures.lecture02.interfaceRealize;

public class Minotaurus implements Human, Bull{
    @Override
    public void walk() {
        System.out.println("Walks on two legs");
    }

    @Override
    public void talk() {
        System.out.println("Asks you a riddle");
    }
}
