package ru.gb.jdk.lectures.lecture05_thread.workWithOneResource;

import java.util.concurrent.CountDownLatch;

public class Task implements Runnable {
    private int value;
    private CountDownLatch cdl;

    public Task(int value) {
        this.value = value;
    }
// ИСПОЛЬЗОВАНИЕ ЛОКАЛЬНОЙ СИНХРОНИЗАЦИИ
//    public void inc(){
//      synchronized (Task .class) {
//        value++;
//          }
//    }

    //    или
    public synchronized void inc() {
        value++;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("(%s)", value);
    }

    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {
            inc();
        }
        cdl.countDown();
    }

    public void setCdl(CountDownLatch cdl) {
        this.cdl = cdl;
    }
}
