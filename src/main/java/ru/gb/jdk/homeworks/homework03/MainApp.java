package ru.gb.jdk.homeworks.homework03;



public class MainApp {
    public static void main(String[] args) {
//        task01();
//        task02();
        task03();
    }



    private static void task01(){
        Number[] numArray = new Number[3];
        numArray[0] = 1;
        numArray[1] = 2.0f;
        numArray[2] = 3L;
        MyList<Number> list = new MyList<>(numArray);
        list.printArray();

        for(Number number: list){
            System.out.print(number + " ") ;
        }
    }

    private static void task02() {
        System.out.println(Calculator.sum(2.2f, 2));
        System.out.println(Calculator.substract(2.2f, 0.2));
        System.out.println(Calculator.multiply(3, 4L));
        System.out.println(Calculator.divide(2.2f, 2L));
        System.out.println(Calculator.divide(2.2f, 0));
    }

    private static void task03(){
        String[] array1 = {"Hello", "Hi", "See you"};
        String[] array2 = {"Hello", "Hi", "See you"};
        String[] array3 = {"Hello", "Hi", "Buy", "See you"};
        System.out.println(CompareArrays.compareTwoArrays(array1, array2));
        System.out.println(CompareArrays.compareTwoArrays(array1, array3));
    }
}
