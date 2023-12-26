package ru.gb.jdk.lectures.lecture05_thread.use_notify_wait;

public class MainApp {
    public static void main(String[] args) {
        /*
        Использование синзронизации через монитор с использованием notify, wait
         */
        Thread tic = new Thread(new TacTic("["));
        Thread tac = new Thread(new TacTic("]"));

        tic.start();
        tac.start();
    }
}
