package geekbgains.com;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Работаем с массивом.");
        GenericArray<Integer> integerArray = new GenericArray<>(new Integer[]{11, 22, 33, 44, 55, 66, 77});
        integerArray.printArray();
        if (integerArray.elementsExchange(2, 5)) {
            integerArray.printArray();
        } else {
            System.out.println(integerArray.getResultString());
        }
        ArrayList<Integer> arrList = integerArray.convertToArrayList();
        System.out.println("");
        // инициируем коробки
        System.out.println("Работаем с фруктами.");
        Box<Apple> box1 = new Box<>(new ArrayList<Apple>());
        Box<Orange> box2 = new Box<>(new ArrayList<Orange>());
        Box<Orange> box3 = new Box<>(new ArrayList<Orange>());
        // добавляем фрукты
        System.out.println("Добавляем 10 яблок в коробку 1 и 10 апельсинов в коробку 2.");
        for (int i = 0; i < 10; i++) {
            box1.addFruit(new Apple());
        }
        for (int i = 0; i < 10; i++) {
            box2.addFruit(new Orange());
        }
        System.out.println("Сравниваем box1 и box2 - " + box1.compareWithBox(box2) + "(box1=" + box1.getWeight() + ", box2=" + box2.getWeight() + ")");
        System.out.println("Добавляем 5 яблок");
        for (int i = 0; i < 5; i++) {
            box1.addFruit(new Apple());
        }
        System.out.println("Сравниваем box1 и box2 - " + box1.compareWithBox(box2) + "(box1=" + box1.getWeight() + ", box2=" + box2.getWeight() + ")");
        // работаем с третьей коробкой
        for (int i = 0; i < 7; i++) {
            box3.addFruit(new Orange());
        }
        System.out.println("Добавляем в коробку 3 - 7 апельсинов. Вес коробки = " + box3.getWeight());
        // перекладываем
        System.out.println("Перекладываем апельсины из коробки 2 в коробку 3.");
        box2.toAnotherBox(box3);
        System.out.println("Вес коробки 2 = " + box2.getWeight());
        System.out.println("Вес коробки 3 = " + box3.getWeight());

    }

}
