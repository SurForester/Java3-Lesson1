package geekbgains.com;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> list;

     public Box(ArrayList<T> list) {
        this.list = list;
    }

    public void addFruit(T fruit) {
        list.add(fruit);
    }

    public float getWeight() {
        float result = (float) 0.0;
        if (list == null) {
            result = 0;
        } else {
            for (T fruit : list) {
                result += fruit.weight;
            }
        }
        return result;
    }

    public boolean compareWithBox(Box<?> anotherBox) {
        return (this.getWeight() == anotherBox.getWeight());
    }

    public void toAnotherBox(Box<T> anotherBox) {
        for (T fruit: list) {
            anotherBox.addFruit(fruit);
        }
        list.clear();
    }
}
