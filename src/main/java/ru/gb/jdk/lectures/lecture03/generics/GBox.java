package ru.gb.jdk.lectures.lecture03.generics;

public class GBox<T> {
    private T value;

    public GBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void showType(){
        System.out.printf("Type is %s, with value %s\n", value.getClass().getTypeName(), getValue() );
    }

    public static void main(String[] args){
        GBox<String> stringBox = new GBox<>("Hello");
        stringBox.showType();

        GBox<Integer> integerGBox = new GBox<>(20);
        integerGBox.showType();
    }
}
