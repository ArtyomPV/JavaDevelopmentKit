package seminars.seminar05_thread.ex02;

public class MyThread1 extends Thread{
    private MyProgramState state;

    public MyThread1(MyProgramState state) {
        this.state = state;
    }

    @Override
    public void run() {
        while(!state.isFinish()){
            state.setSwitcher(!state.isSwitcher());
            System.out.println(state.isSwitcher());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
