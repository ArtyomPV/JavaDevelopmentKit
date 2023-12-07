package ru.gb.jdk.seminars.seminar03.manual;

import ru.gb.jdk.seminars.seminar03.manual.task2.Apple;
import ru.gb.jdk.seminars.seminar03.manual.task2.Box;
import ru.gb.jdk.seminars.seminar03.manual.task2.Fruit;
import ru.gb.jdk.seminars.seminar03.manual.task2.Orange;
import ru.gb.jdk.seminars.seminar03.manual.task3.ArrayIterator;
import ru.gb.jdk.seminars.seminar03.manual.task3.MyOwnList;
import ru.gb.jdk.seminars.seminar03.manual.task5.*;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    /**
     * – Написать метод, который меняет два элемента массива местами (массив может быть лю-
     * бого ссылочного типа);
     */
    public static void main(String[] args) {
//        task01();
//        task02();
//        task03();
//        task04();
        task05();
    }

    private static void task01() {
        Object[] array = {1, 0.2f, "Hello"};
        System.out.println(Arrays.toString(array));
        SwapTwoElementsInArray.swap(array, 0,2);
        System.out.println(Arrays.toString(array));
    }
    public static void task02(){
        Apple apple01 = new Apple();
        Apple apple02 = new Apple();
        Apple apple03 = new Apple();
        Orange orange01 = new Orange();
        Orange orange02 = new Orange();
        Fruit orange03 = new Orange();

        Box<Apple> appleBox = new Box<>(new ArrayList<>(Arrays.asList(apple01, apple02)));
        Box<Apple> appleBox1 = new Box<>(new ArrayList<>(Arrays.asList(apple03, apple02)));
        Box<Orange> orangeBox = new Box<>(new ArrayList<>(Arrays.asList(orange01, orange02)));

        System.out.println("Сравним две коробки:" + (appleBox.compare(appleBox)?" в коробках лежат одинаковые фрукты":" в коробках лежат разные фрукты"));
        System.out.println("Сравним две коробки:" + (orangeBox.compare(appleBox)?" в коробках лежат одинаковые фрукты":" в коробках лежат разные фрукты"));

        appleBox.transferTo(appleBox1);
        appleBox.print();
        appleBox1.print();
        orangeBox.print();
    }

    public static void task03(){
        MyOwnList<Number> nums = new MyOwnList<>();
        System.out.println(nums);
        nums.add(2);
//        nums.add(3.0);
        nums.add(4);
        nums.remove();
        System.out.println(nums);
    }

    public static void task04(){
        Integer[] array = {1, 2, 3, 4};
        ArrayIterator<Integer> it = new ArrayIterator<>(array);
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        for(Integer integer: array){
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void task05(){
        Workplace<Person> wp = new Workplace<>(new Worker(), new Worker(), new Worker(), new Idler());
        Club<Person> c = new Club<>(new Worker(), new Idler(), new Idler());
        wp.work();
        c.chill();
    }
}
