package ru.gb.jdk.lectures.lecture05_thread;

public class TicTac implements Runnable{
    private final String bracket;

    public TicTac(String bracket) {
        this.bracket = bracket;
    }

    @Override
    public void run() {
        while(true){
            System.out.println(bracket);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
