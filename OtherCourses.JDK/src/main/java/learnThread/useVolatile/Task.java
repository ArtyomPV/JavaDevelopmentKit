package learnThread.useVolatile;

public class Task implements Runnable{
    private long counter;
    private boolean isRunning;
    public Task(){
        isRunning = true;
    }
    @Override
    public void run() {
        while(isRunning){
            counter++;
        }
        System.out.println("Task: " + counter);
    }
    public void stop(){
        isRunning = false;
    }
    public long getCounterValue(){
        return counter;
    }
}
