package seminars.seminar05_thread.ex02;

public class MainApp {
    public static void main(String[] args) {
        task02();
    }

    private static void task02() {
        MyProgramState state = new MyProgramState();
        MyThread1 thread1 = new MyThread1(state);
        MyThread2 thread2 = new MyThread2(state);

        thread1.start();
        thread2.start();

    }
}
