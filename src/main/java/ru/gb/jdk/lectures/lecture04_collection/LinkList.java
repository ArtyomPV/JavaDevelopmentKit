package ru.gb.jdk.lectures.lecture04_collection;

import java.util.Collection;
import java.util.Iterator;

public class LinkList<T> implements Collection<T> {
    private ListNode head, tail;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == tail && head == null;
    }

    @Override
    public boolean contains(Object o) {
        //
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        //
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(T value) {
        if(head == null){
            head = new ListNode<>(value, null, null);
            tail = head;
        } else {
            ListNode<T> current = new ListNode<>(value, head, null);
            ListNode<T> prev = tail;
            tail.setNext(current);
            tail = current;
            tail.setPrevious(prev);
        }
        return false;
    }



    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }


    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
