package ru.gb.jdk.homeworks.homework03;



public class MainApp {
    public static void main(String[] args) {
//        task01();
//        task02();
//        task03();
        task04();
    }



    private static void task01(){
        System.out.println("\n\tВыполнение 1й задачи");
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
        System.out.println("\n\tВыполнение 2й задачи");
        System.out.println(Calculator.sum(2.2f, 2));
        System.out.println(Calculator.substract(2.2f, 0.2));
        System.out.println(Calculator.multiply(3, 4L));
        System.out.println(Calculator.divide(2.2f, 2L));
        System.out.println(Calculator.divide(2.2f, 0));
    }

    private static void task03(){
        System.out.println("\n\tВыполнение 3й задачи");
        String[] array1 = {"Hello", "Hi", "See you"};
        String[] array2 = {"Hello", "Hi", "See you"};
        String[] array3 = {"Hello", "Hi", "Buy", "See you"};
        System.out.println(CompareArrays.compareTwoArrays(array1, array2));
        System.out.println(CompareArrays.compareTwoArrays(array1, array3));
    }
    public static void task04(){
        System.out.println("\n\tВыполнение 4й задачи");
        Pair<String, Integer> pair = new Pair<>("Hello", 5);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }
}
