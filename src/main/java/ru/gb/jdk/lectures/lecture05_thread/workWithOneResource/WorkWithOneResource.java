package ru.gb.jdk.lectures.lecture05_thread.workWithOneResource;

import java.util.concurrent.CountDownLatch;

/**
 * Созданы два потока и они работают с одним ресурсом
 */
public class WorkWithOneResource {

    public static void main(String[] args) throws InterruptedException {
        Task task = new Task(0);
        CountDownLatch cdl = new CountDownLatch(3);
        task.setCdl(cdl);
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }
        /*
        выведет не ожидаемый результат, так как главный поток выполнит sout, а остальные потоки будут еще увеличивать значение
         использовать .join() нельзя так как  будет синхронное выполнение потоков
         сначала по циклу рпройдет первый поток
         потом пройдет по циклу второй поток и потом пройдет по циклу третий поток
         */
        cdl.await();
        System.out.println(task.getValue());
        /*
        Используем примитив синхронизации CountDownLatch (перед созданием потоков)
        В класс Task передаем переменную типа CountDownLatch
        cdl.await() будет ждать пока каждый поток не выполнит свой countDown, он находится в методе run()
         */

        /*
        Для корректного подсчета value нужно использовать модификатор synchronazed(Task.class){value ++}
         */
    }
}
