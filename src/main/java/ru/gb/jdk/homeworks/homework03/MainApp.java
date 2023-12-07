package ru.gb.jdk.homeworks.homework03;

public class MainApp {
    public static void main(String[] args) {
        task02();

    }

    private static void task02() {
        System.out.println(Calculator.sum(2.2f, 2));
        System.out.println(Calculator.substract(2.2f, 0.2));
        System.out.println(Calculator.multiply(3, 4L));
        System.out.println(Calculator.divide(2.2f, 2L));
        System.out.println(Calculator.divide(2.2f, 0));
    }
}
