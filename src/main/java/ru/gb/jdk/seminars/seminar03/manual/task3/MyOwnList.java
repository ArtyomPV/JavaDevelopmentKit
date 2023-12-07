package ru.gb.jdk.seminars.seminar03.manual.task3;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyOwnList<T> {
    Object[] array;
    int count;

    public MyOwnList(){
        array = new Object[1];
        count = 0;
    }
    public void add(T item){
        if(count == array.length){
            Object[] newArray = new Object[array.length*2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[count++] = item;
    }

    public T remove(){
        if(count == 0) throw new NoSuchElementException();
        T temp = (T) array[--count];
        array[count] = null;
        return temp;
    }

    @Override
    public String toString(){
        return Arrays.toString(array);
    }
}
