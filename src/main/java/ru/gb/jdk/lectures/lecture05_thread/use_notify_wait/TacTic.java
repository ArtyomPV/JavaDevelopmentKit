package ru.gb.jdk.lectures.lecture05_thread.use_notify_wait;

public class TacTic implements Runnable {

    private final String bracket;
    private final Object monitor;

    public TacTic(String bracket) {
        this.bracket = bracket;
        this.monitor = TacTic.class;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (monitor) {
                System.out.print(bracket);
                try {
                    Thread.sleep(300);
                    monitor.notify(); // разбуди другой поток
                    monitor.wait(); // текущий поток должен ждать(заснуть)

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }

    }
}
