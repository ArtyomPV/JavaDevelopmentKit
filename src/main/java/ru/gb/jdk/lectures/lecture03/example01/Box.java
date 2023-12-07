package ru.gb.jdk.lectures.lecture03.example01;

public class Box {
    private Object obj;

    public Box(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObject(Object obj) {
        this.obj = obj;
    }

    public void printInfo() {
        System.out.printf("Box (%s): %s\n", obj.getClass().getSimpleName(), obj.toString());
    }


    public static void main(String[] args) {
        Box box1 = new Box(20);
        Box box2 = new Box(10);
        Box box3 = new Box("Hello ");
        Box box4 = new Box("world!");

        //        Error, нужно применить операцию приведения типов
        //        System.out.println(box1.getObj() + box2.getObj());
        System.out.println("================ example 01 ================");
        System.out.println((Integer)box1.getObj() + (Integer)box2.getObj());
        System.out.println((String)box3.getObj() + (String)box4.getObj());

        System.out.println("================ example 02 ================");
        /**
         * для обработки таких класов необходимо дклать сложные проверки
         */
        Box iBox1 = new Box(20);
        Box iBox2 = new Box(10);
        if(iBox1.getObj() instanceof Integer && iBox2.getObj() instanceof Integer){
            int sum = (Integer)iBox1.getObj() + (Integer)iBox2.getObj();
            System.out.println("sum = " + sum);
        } else {
            System.out.println("The contents of the boxes differ by type");
        }

        iBox1.setObject("str"); // ????
    }
}