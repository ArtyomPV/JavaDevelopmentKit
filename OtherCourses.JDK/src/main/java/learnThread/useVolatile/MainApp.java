package learnThread.useVolatile;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Task task = new Task();
        new Thread(task).start();
        System.out.println("Press ENTER!");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        /*
            Переменная isRunning закэшировалась в потоке и не может поменяться
            поэтому программа не останавливается и метод stop не имеет влияние на кэшированную
            переменную. Для устранения этого бага нужно использовать volatile
         */
        task.stop();
        System.out.println("Main: " + task.getCounterValue());

    }
}
