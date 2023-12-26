package ru.gb.jdk.seminars.seminar04;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
//        task01();
//        task02();
        task03();
    }

    private static void task03() {
        Map<Integer, String> phoneBook = new HashMap<>();
        phoneBook.put(911456123, "Sergey");
        phoneBook.put(905357895, "Dima");
        phoneBook.put(906781562, "Kolya");
        phoneBook.put(995397156, "Victor");


        int minPhone = phoneBook.keySet().stream().min(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }).get();
        System.out.println("\tчеловек с самым маленьким номером телефона");
        System.out.println(phoneBook.get(minPhone));

        String getMaxName = phoneBook.values().stream().sorted().toList().get(phoneBook.size() - 1);
        System.out.println("\tномер телефона человека чье имя самое большое в алфавитном порядке");
        System.out.println(phoneBook.entrySet().stream().filter(e->phoneBook.containsValue(getMaxName)).findAny().get().getKey());
    }

    private static void task02() {
        List<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Ira");
        names.add("Sergey");
        names.add("Kolya");
        names.add("Svetlana");
        names.add("Ira");
        names.add("Masha");
        names.add("Kolya");
        names.add("Alex");

        System.out.println("\tИсходные данные");
        System.out.println(names);

        Set<String> setNames = new HashSet<>(names);
        System.out.println("\tМножество имен");
        System.out.println(setNames);

        String minName = setNames.stream().sorted().toList().get(0);
        System.out.println("\tНаименьший элемент (алфавитный порядок)");
        System.out.println(minName);

        String maxName = setNames.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println("\tНаибольший элемент (по количеству букв в слове но в обратном\n" +
                "порядке)");
        System.out.println(new StringBuilder(maxName).reverse());

        Iterator<String> iterator = names.iterator();
        List<String> newNames = new ArrayList<>();
        names.removeIf(currentName -> currentName.contains("a"));

        System.out.println("\tУдалите все элементы содержащие букву ‘A’");
        System.out.println(names);

    }

    static void task01(){
        List<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Ira");
        names.add("Sergey");
        names.add("Kolya");
        names.add("Svetlana");
        names.add("Masha");
        System.out.println("Исходные данные");
        System.out.println(names);
        Collections.sort(names);
//        names.stream().sorted();
        System.out.println("Сортировка по алфавиту");
        System.out.println(names);
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
//        names.stream().sorted();
        System.out.println("Сортировка по длине имени");
        System.out.println(names);


        System.out.println("Разворот списка");
        System.out.println( names.reversed());
    }
}
