package ru.gb.jdk.homeworks.homework01;

import ru.gb.jdk.homeworks.homework01.Controller.Controller;

import java.io.IOException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws IOException {
        Controller controller = new Controller("src/main/resources/ru.gb.jdk.homeworks.homework01/ListMessage.txt");
//        String[] lines = new String[5];
//        for(int i = 0; i < lines.length; i++){
//            lines[i] = String.valueOf(i);
//        }
//        controller.save(lines);
        String[] getList = controller.open();
        ClientGUI clientGUI = new ClientGUI(getList);
        List<String> list = clientGUI.getAllMessages();

    }
}
