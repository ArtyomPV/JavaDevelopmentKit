package seminars.seminar05_thread.ex01;

public class MainApp {
    public static void main(String[] args) {
//        task01();
        task02();
    }

    private static void task02() {
    }

    /**
     *
     * Создать два класса ObjectA и ObjectB
     * Реализовать класс в котором два потока при запуске провоцируют DaedLock для объектов ObjectA, ObjectB
     *
     */
    private static void task01() {
        Friend friend1 = new Friend("Вася");
        Friend friend2 = new Friend("Петя");

        MyThread thread1 = new MyThread(friend1, friend2);
        MyThread thread2 = new MyThread(friend2, friend1);

        thread1.start();
        thread2.start();

    }
}
