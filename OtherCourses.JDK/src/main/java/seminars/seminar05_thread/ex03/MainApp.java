package seminars.seminar05_thread.ex03;

public class MainApp {
    public static void main(String[] args) {
        task03();
    }

    private static void task03() {
        Race race = new Race();
        race.start();
    }
}
