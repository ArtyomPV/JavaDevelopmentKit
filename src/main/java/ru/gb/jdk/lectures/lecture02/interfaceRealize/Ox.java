package ru.gb.jdk.lectures.lecture02.interfaceRealize;

public class Ox implements Bull{
    @Override
    public void walk() {
        System.out.println("Walk on hooves");
    }

    @Override
    public void talk() {
        System.out.println("MooOoooOoooo!");
    }
}
