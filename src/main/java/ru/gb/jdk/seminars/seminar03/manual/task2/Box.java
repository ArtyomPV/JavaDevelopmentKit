package ru.gb.jdk.seminars.seminar03.manual.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * В Box можно складывать фрукты, можно высчитать вес коробки, можно сравнивать коробки, пересыпать из одной коробки в другую
 * @param <T>
 */
public class Box <T extends Fruit>{
    private final List<T> container;

    public Box(List<T> listFruits) {
        this.container = new ArrayList<>();
        for (T fruit: listFruits){add(fruit);}
    }
    private void add(T fruit){
        container.add(fruit);
    }
    public void print(){
        System.out.println(getWeight());
    }

    private float getWeight() {
        return container.isEmpty()
                ? 0
                : container.size() * container.get(0).getWeight();
    }

    /**
     * Сравнивает текущую коробку с другой
     * @param with любая коробка с фруктами, поэтому используется ?
     * @return возвращает если вес одинаковый - истина, иначе -ложь
     */
    public boolean compare(Box<?> with){
        if(this.getWeight() > with.getWeight()) return this.getWeight()- with.getWeight() < 0.001;
        return  with.getWeight() - this.getWeight() < 0.001;
    }

    /** Пересыпает фрукты из одной корзины в текущую
     * @param anotherBox коробка с определенным типом фрукта или родителей данного типа
     */
    public void transferTo(Box<? super T> anotherBox){
        anotherBox.container.addAll(container);
        container.clear();
    }

}
