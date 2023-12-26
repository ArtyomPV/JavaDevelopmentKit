package ru.gb.jdk.homeworks.homework05;

import java.util.concurrent.Semaphore;

public class MainApp {
    public static void main(String[] args) {
        Semaphore table = new Semaphore(4);
        new Philosopher(table, "Чаадаев ").start();
        new Philosopher(table, "Чернышевский ").start();
        new Philosopher(table, "Толстой ").start();
        new Philosopher(table, "Ленин ").start();
        new Philosopher(table, "Вернадский ").start();
    }
}
