package ru.gb.jdk.seminars.seminar03.manual.task5;

public class Club<T extends Person>{
    Person[] arr;
    public Club(T... people){
        arr = people;
    }
    public void chill(){
        for(Person person: arr){
            person.haveRest();
        }
    }
}
