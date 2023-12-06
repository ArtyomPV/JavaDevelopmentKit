package ru.gb.jdk.seminars.seminar03.manual.task5;

public class Workplace<T extends Person>{
    Person[] arr;
    public Workplace(T... people){
        arr = people;
    }
    public void work(){
        for(Person person: arr){
            person.doWork();
        }
    }
}
