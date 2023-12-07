package ru.gb.jdk.seminars.seminar03.manual;

public class SwapTwoElementsInArray {
    /**
     * – Написать метод, который меняет два элемента массива местами (массив может быть лю-
     * бого ссылочного типа);
     */

    public static void swap(Object[]arr, int from, int to) {
        Object temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
