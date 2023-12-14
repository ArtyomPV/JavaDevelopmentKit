package ru.gb.jdk.lectures.lecture05_thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("2. Hello from " + Thread.currentThread() );
    }
}
