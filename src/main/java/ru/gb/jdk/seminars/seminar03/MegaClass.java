package ru.gb.jdk.seminars.seminar03;

import java.io.DataInput;
import java.io.InputStream;

public class MegaClass <T extends Comparable<T>, V extends InputStream & DataInput, K extends Number>{

    public T t;
    public V v;
    public K k;

    public MegaClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void printTypes(){
        String tName = t.getClass().getSimpleName();
        String vName = v.getClass().getSimpleName();
        String kName = k.getClass().getSimpleName();
        System.out.println( tName + " " + vName + " " + kName);
    }
}
