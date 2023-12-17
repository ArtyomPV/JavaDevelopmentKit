package seminars.seminar05_thread.ex01;

public class MyThread extends Thread{
    Friend friend1;
    Friend friend2;

    public MyThread(Friend friend1, Friend friend2){
        this.friend1 = friend1;
        this.friend2 = friend2;
    }
    @Override
    public void run() {
        friend1.bow(friend2);
    }
}
