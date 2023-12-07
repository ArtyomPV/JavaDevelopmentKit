package ru.gb.jdk.lectures.lecture03.generics;

public class GeneralizedMethods {
    /**
     * Использование обобщенного метода
     * @param box объект обобщенного класса GBox типа T
     * @param t
     * @param <T> обобщенный тип который передаем в параметрач фргументов метода
     */
    private static <T> void setIfNull(GBox<T> box, T t) {
        if (box.getValue() == null) box.setValue(t);
    }

    public static void main(String[] args) {
        GBox<Integer> box = new GBox<>(null);
        setIfNull(box, 13);
        System.out.println(box.getValue());

        GBox<String> stringBox = new GBox<>(null);
        setIfNull(stringBox, "Hi");
        System.out.println(stringBox.getValue());
    }
}
