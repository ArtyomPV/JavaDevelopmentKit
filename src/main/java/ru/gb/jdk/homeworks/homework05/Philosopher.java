package ru.gb.jdk.homeworks.homework05;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    private Semaphore table;
    private String name;
    private boolean isEat;

    public Philosopher(Semaphore table, String name) {
        this.table = table;
        this.name = name;
        isEat = false;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
//            if(!isEat){
//                try {
//                    table.acquire();
//                    System.out.println(name + " начал трапезу");
//                    sleep(500);
//                    isEat = true;
//                    System.out.println(name + " закончил трапезу");
//                    table.release();
//                    sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }

            try {
                table.acquire();
                System.out.println(name + " начал трапезу");
                sleep(500);

                System.out.println("\t" + name + " закончил трапезу, сидит думает...");
                table.release();
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
