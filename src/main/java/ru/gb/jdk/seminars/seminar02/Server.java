package ru.gb.jdk.seminars.seminar02;

public class Server implements  ServerListener{
    boolean isServerWorking;

    private final Listener listener;

    public Server(Listener listener) {
        this.listener = listener;
        isServerWorking = false;
    }

    public void start(){
        if(!isServerWorking){
            isServerWorking = true;
        listener.messageRes("Статус сервера: ON");
        } else {
            listener.messageRes("Статус сервера: is running");
        }
//            System.out.println("Статус сервера: " + isServerWorking);

    }

    public void stop(){
        if(isServerWorking){
            isServerWorking = false;
            listener.messageRes("Статус сервера: OFF");
        } else {
            listener.messageRes("Статус сервера: is turned OFF");
        }

//        System.out.println("Статус сервера: " + isServerWorking);

    }

    @Override
    public void serverListener(boolean status) {
        if(status) start();
        else stop();
    }
}
