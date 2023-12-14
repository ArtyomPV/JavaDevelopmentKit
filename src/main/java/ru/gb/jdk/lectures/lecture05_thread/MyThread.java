package ru.gb.jdk.lectures.lecture05_thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("1. Hello from " + Thread.currentThread() );
    }
}
