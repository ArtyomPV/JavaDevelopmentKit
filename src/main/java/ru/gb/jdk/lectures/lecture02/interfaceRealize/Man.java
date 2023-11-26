package ru.gb.jdk.lectures.lecture02.interfaceRealize;

public class Man implements Human{

    @Override
    public void walk() {
        System.out.println("Walk on two feet!");
    }

    @Override
    public void talk() {
        System.out.println("Talks meaninful words!");
    }
}
