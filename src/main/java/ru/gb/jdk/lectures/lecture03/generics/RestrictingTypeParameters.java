package ru.gb.jdk.lectures.lecture03.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class RestrictingTypeParameters {
    static class Box<V extends Number> {
        private V value;

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        private static <T extends Number> void setIfNull(Box<T> box, T t) {
            if (box.getValue() == null) box.setValue(t);
        }
    }

    private static <T extends Number> boolean compare(T src, T dst){
        return src.equals(dst);
    }

    private static void copyTo(ArrayList src, ArrayList dst){
        for(Object o: src) dst.add(o);
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
//        Box<String> stringBox = new Box<>();
        System.out.println(compare(1, 1.0f));
        System.out.println(compare(1.0f, 1.0f));
        System.out.println(compare(1, 1));
        System.out.println("==== copy from Array to other ====");
        ArrayList<Integer> ial = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Number> nal = new ArrayList<>(Arrays.asList(1f, 2, 3.0));
        System.out.println(ial);
        System.out.println(nal);
        copyTo(ial, nal);
        System.out.println(nal);
        copyTo(nal, ial);
        System.out.println(ial);
    }

    static class Bird {}
    interface AnimaL{}
    interface Man{}

    class CBox<T extends Bird & Man & AnimaL>{}
}
