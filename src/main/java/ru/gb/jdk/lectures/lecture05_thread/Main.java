package ru.gb.jdk.lectures.lecture05_thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Thread.currentThread().getName());

//        for (int i = 0; i < 3; i++) {
////            метод start запускает поток
//            new MyThread().start();
//        }
//
//        for (int i = 0; i <5; i++) {
//            new Thread(new MyRunnable()).start();
//        }
//        for (int i = 0; i < 3; i++) {
//            new Thread(()->{
//                System.out.println("3. Hello from " + Thread.currentThread() );
//            }).start();
//        }

        Thread tic = new Thread(new TicTac("{}}"));
        Thread tac = new Thread(new TicTac("}"));
//        tic.setDaemon(true);
//        tac.setDaemon(true);
        tic.start();
        tac.start();
    }
}
