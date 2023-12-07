package ru.gb.jdk.lectures.lecture03.generics;

public class KVBox<K, V> {
    private K key;
    private V value;

    public KVBox(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue(){
        return value;
    }
    public K getKey(){
        return key;
    }
    public void showType(){
        System.out.printf("Type of key is %s, key = %s, " +
                "type of value is %s, value = %s\n",
                key.getClass().getName(), getKey(),
                value.getClass().getName(), getValue());
    }

    public static void main(String[] args) {
        KVBox<Integer, String> kvb0 = new KVBox<>(1, "Hello");
        KVBox<String, GBox<String>> kvb1 = new KVBox<>("Hello", new GBox("Java"));
        kvb1.showType();
    }
}
