package seminars.seminar05_thread.ex02;

public class MyThread2 extends Thread{
    private MyProgramState state;
    public MyThread2(MyProgramState state) {
        this.state = state;
    }


    @Override
    public void run() {
        int count = 100;
        while(!state.isFinish()){
            if(state.isSwitcher()) {
                count--;
                System.out.println(count);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(count <= 0) state.setFinish(true);
        }
    }
}
