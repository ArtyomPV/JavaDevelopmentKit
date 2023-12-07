package ru.gb.jdk.homeworks.homework03;

public class CompareArrays <T> {
    public static <T> boolean compareTwoArrays(T[] array1, T[] array2){
        if(array1.length != array2.length) return false;
        for(int i = 0; i < array1.length; i++){
            if(!array1[i].equals(array2[i])) return false;
        }
        return true;
    }
}
