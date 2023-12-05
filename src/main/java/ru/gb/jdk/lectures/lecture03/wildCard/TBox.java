package ru.gb.jdk.lectures.lecture03.wildCard;

public class TBox<T> {
    public static final TBox EMPTY_BOX = new TBox<>();
    private T value;

    public T getValue(){ return value;}

    public void setValue(T value){ this.value = value;}
    static <T> TBox emptyBox(){
        Object TBox;
        return (TBox<T>) EMPTY_BOX;
    }
    @Override
    public String toString(){return value.toString();}
    static void printInfo(TBox<? extends Animal> animalInBox){
        System.out.println("Information about animal: " + animalInBox);
    }

    public static void main(String[] args) {
        TBox<Cat> catInBox = TBox.emptyBox();
        catInBox.setValue(new Cat("Vasya"));
        printInfo(catInBox);

        TBox<Dog> dogInBox = TBox.emptyBox();
        dogInBox.setValue(new Dog("Tuzik"));
        printInfo(dogInBox);
    }
}
