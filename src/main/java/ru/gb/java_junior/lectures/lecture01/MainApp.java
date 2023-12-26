package ru.gb.java_junior.lectures.lecture01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        /*
        когда интерфейс содержит один метод, то такой интерфейс называется функциональным
         */
        PlainInterface plainInterface = new PlainInterface() {
            @Override
            public String action(int x, int y) {
                return String.valueOf(x + y);
            }
        };
        System.out.println(plainInterface.action(1, 1));
        System.out.println("\tИспользование lambda выражения: ");
        PlainInterface plainInterface1 = (x, y) -> String.valueOf(x + y);
        System.out.println(plainInterface1.action(2, 2));

        System.out.println("\tПереопределение метода action");
        PlainInterface plainInterface2 = (x, y) -> String.valueOf(Integer.compare(x, y));
        System.out.println(plainInterface2.action(4, 5));

        task02();
    }

    private static void task02() {
        List<String> list = Arrays.asList("Привет", "мир", "я", "родился", "!");
        List<String> list1 = list.stream()
                .filter(str -> str.length() > 4)
                .toList();
        for (String s : list1) {
            System.out.println(s);
        }
        System.out.println("\tИспользование одного фильтра");
        list.stream()
                .filter(str -> str.length() > 4)
                .forEach(System.out::println);

        System.out.println("\tИспользование последовательности фильтров");
        list.stream()
                .filter(str -> str.length() > 4)
                .filter(str->str.contains("о"))
                .forEach(System.out::println);

        Arrays.asList(1,2,3,4,5).stream()
                .map(number-> number*number)
                .forEach(System.out::println);

        Arrays.asList(1,2,3,4,5).stream()
                .map(number-> "число: " + number + ". квадрат числа - " + number*number)
                .forEach(System.out::println);

        System.out.println("\tсортирует");
        Arrays.asList(1,21,32,14,5).stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\tудаляет дубликаты");
        Arrays.asList(1,21,32,1,5).stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println(Arrays.asList(1,21,32,1,5).stream()
                .distinct()
                .findFirst().get());
    }
}
