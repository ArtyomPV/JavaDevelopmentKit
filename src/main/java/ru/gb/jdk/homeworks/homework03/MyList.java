package ru.gb.jdk.homeworks.homework03;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList<E> implements Iterable<E>{
    ArrayList<E> arr;
    private int size;
    private E[] array;
    private static final Object[] DEFAULT = {};

    public MyList(E[] array) {
        this.array = array;
        size = this.array.length;
    }

    public <T extends E> void add(T element) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[size] = element;
            array = (E[]) newArray;
        } else {
            array[size] = element;
        }
        size++;
    }

    public void printArray() {
        for (E element : array) {
            if (element != null) {
                System.out.print(element + ", ");
            }
        }
            System.out.println();
    }

    public void removeElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        System.arraycopy(array, index + 1, array, index, size-index-1);
                array[size-1] = null;
        size--;
    }
    public int getLength(){
        return size;

    }

    @Override
    public Iterator<E> iterator() {
        return new MyListIterator();
    }

    class MyListIterator implements Iterator<E>{
        int index ;
        E[] iterArray;

        public MyListIterator() {
            this.index = 0;
            iterArray = array;
        }

        @Override
        public boolean hasNext() {
            return index < getLength();
        }

        @Override
        public E next() {
            return array[index++];
        }
    }
}

