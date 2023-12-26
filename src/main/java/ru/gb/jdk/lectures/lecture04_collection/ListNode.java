package ru.gb.jdk.lectures.lecture04_collection;

public class ListNode<T> {
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ListNode getPrevious() {
        return previous;
    }

    public void setPrevious(ListNode previous) {
        this.previous = previous;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    private T value;
    private ListNode previous, next;

    public ListNode(T value, ListNode previous, ListNode next){
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
}
