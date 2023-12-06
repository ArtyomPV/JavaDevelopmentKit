package ru.gb.jdk.seminars.seminar03;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;

public class MainApp {
    public static void main(String[] args) {
        task1();
        task2();
        task3();





    }

    public static void task1(){
        DataInputStream dis = new DataInputStream(System.in);
        String t  = "Hello";
        Integer k = 5;

        MegaClass<String, DataInputStream, Number> megaClass = new MegaClass<>(t, dis, k);
        megaClass.printTypes();

    }
    public static void task2(){
        Number[] numArray = new Number[3];
        numArray[0] = 1;
        numArray[1] = 2.0f;
        numArray[2] = 3L;
        MyList<Number> list = new MyList<>(numArray);
        list.printArray();
        list.add(25);
        list.printArray();
        System.out.println("=================");
        list.removeElement(1);
        list.printArray();
        System.out.println("=================");
        System.out.println(list.getLength());


    }

    public static void task3(){
        Number[] numArray = new Number[3];
        numArray[0] = 1;
        numArray[1] = 2.0f;
        numArray[2] = 3L;
        MyList<Number> list = new MyList<>(numArray);
        list.printArray();

        for(Number number: list){
            System.out.println(number);
        }

    }
}
