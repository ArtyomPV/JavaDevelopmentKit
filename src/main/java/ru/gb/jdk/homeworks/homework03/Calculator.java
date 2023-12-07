package ru.gb.jdk.homeworks.homework03;

public class Calculator {
    public static <T extends Number, U extends Number> double sum(T number1, U number2) {
        return number1.doubleValue() + number2.doubleValue();
    }

    public static <T extends Number, U extends Number> double substract(T number1, U number2) {
        return number1.doubleValue() - number2.doubleValue();
    }

    public static <T extends Number, U extends Number> double multiply(T number1, U number2) {
        return number1.doubleValue() * number2.doubleValue();
    }

    public static <T extends Number, U extends Number> double divide(T number1, U number2) {
        if(number2.doubleValue() == 0) throw new ArithmeticException("Делить на ноль нельзя");
        return number1.doubleValue() / number2.doubleValue();
    }
}
