package ru.gb.jdk.lectures.lecture04_collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        task01();
    }

    /**
     * Перебор коллекции
     * 1. iterator
     * 2. forloop
     * 3. stream API
     */
    public static void task01(){
        Collection<Integer> collection = List.of(1, 2, 3, 4, 5);
        Iterator<Integer> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("********************************");

        for (Integer integer : collection) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("********************************");

        collection.stream()
                .forEach(value -> System.out.print(value + " "));
        System.out.println();
        System.out.println("********************************");

        collection.stream()
                .forEach(System.out::print); // в цикле передаем метод, который необходимо применить к каждому элементу
        System.out.println();
        System.out.println("********************************");

    }



}
