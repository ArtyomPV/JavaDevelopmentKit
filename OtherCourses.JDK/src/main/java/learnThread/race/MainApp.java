package learnThread.race;

public class MainApp {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            new Thread(()->{
                /**
                 * работа с внешним классом
                 * счетчик считает не верно
                 */
                for (int j = 0; j < 1000; j++) {
                    ValueStorage.incrementValue();
                }
                System.out.println(ValueStorage.getValue());
            }).start();
        }
    }
}
