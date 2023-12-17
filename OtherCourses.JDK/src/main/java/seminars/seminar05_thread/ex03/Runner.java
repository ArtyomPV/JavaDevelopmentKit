package seminars.seminar05_thread.ex03;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Runner extends Thread{
    private String name;
    private double speed;
    private Random random;
    private CountDownLatch cdl;

    @Override
    public void run() {
            try {
        goOnStart();
        synchronized (this){
                wait();
        }
        goToFinish();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

    private void goOnStart() throws InterruptedException{
            System.out.println(name + " идёт на старт ");
            sleep(random.nextInt(2, 5)*1000L);
            System.out.println(name + " пришёл на старт ");
            cdl.countDown();

    }

    public Runner(String name, CountDownLatch cdl) {
        this.name = name;
        this.cdl = cdl;
        random = new Random();
        speed = random.nextDouble(2,7);
    }

    public void goToFinish() throws InterruptedException{
            sleep((long)speed*1000);
            System.out.println(name + " добежал до финиша");
    }
    public void go(){
        synchronized (this){
            notify();
        }
    }
}
