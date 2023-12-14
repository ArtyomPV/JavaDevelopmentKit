package ru.gb.jdk.lectures.lecture05_thread;

import java.util.Scanner;

public class StatsHelper {
    private static int count = 0;
    public static void main(String[] args) {
        Thread readThread = new Thread(()-> {
            Scanner in = new Scanner(System.in);
            while(in.hasNextLine()){
                in.nextLine();
                count ++;
            }
        });
        readThread.setDaemon(true);
        readThread.start();
        while(true){
            System.out.println(count + " messages inputted");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
