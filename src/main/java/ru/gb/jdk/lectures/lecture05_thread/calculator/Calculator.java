package ru.gb.jdk.lectures.lecture05_thread.calculator;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Сроздаем очередь tasks
        Queue<Task> queue = new ArrayDeque<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Thread taskService = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(10000);
//                    Забираем задачу из очереди
//  Сделаем извлечение в двух потоках
                    executor.submit(() -> {
                        Task task = queue.poll();
                        if (task != null) {
                            System.out.println("Task " + task + " started");
                            task.run();
                        }
                    });

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
//        executor.shutdown();
        taskService.start();
        while (in.hasNextLine()) {
            try {
                String[] tokens = in.nextLine().split("\\+");
                int left = Integer.parseInt(tokens[0]);
                int right = Integer.parseInt(tokens[1]);

                Task task = new Task(left, right);
                queue.add(task);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
