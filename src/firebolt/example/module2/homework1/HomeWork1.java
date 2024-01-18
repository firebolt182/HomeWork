package firebolt.example.module2.homework1;

import firebolt.example.module2.homework1.ex1.*;
import firebolt.example.module2.homework1.ex3.Item;
import firebolt.example.module2.homework1.ex3.Warehouse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork1 {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    public static void ex1() {
        Zoo<Tiger, Bird, Dog> zoo = new Zoo<>(new Tiger(), new Bird(), new Dog());
        Tiger tiger = zoo.getTiger();
        tiger.voice();
        Bird bird = zoo.getBird();
        bird.fly();
        Dog dog = zoo.getDog();
        dog.scream();


    }

    public static void ex2() {
        List<Integer> first = new ArrayList<>(Arrays.asList(5, 2, 4));
        List<Integer> second = new ArrayList<>(Arrays.asList(7, 10));
        List<Integer> finalList = new ArrayList<>();
        finalList.addAll(first);
        finalList.addAll(second);
        finalList.remove(3);
        System.out.println(finalList.indexOf(10));
    }

    public static void ex3() {
        Warehouse warehouse = new Warehouse();
        List<Item> items = new ArrayList<>(Arrays.asList(new Item("f1"),
                new Item("f2"),
                new Item("f3"),
                new Item("f4"),
                new Item("f5"),
                new Item("f6")));
        List<Item> items2 = new ArrayList<>(Arrays.asList(new Item("b1"),
                new Item("b2"),
                new Item("b3"),
                new Item("b4"),
                new Item("b5"),
                new Item("b6")));
        warehouse.addToWarehouse(items);
        warehouse.addToWarehouse(items2);
        Item newItem = warehouse.getItemByIndex(0);
        //System.out.println(newItem.getName());
        for (Item item : warehouse.getWarehouse()) {
            System.out.println(item.getName());
        }
        System.out.println("_________________");
        List<Item> even = warehouse.evenItems();
        for (Item i : even) {
            System.out.println(i.getName());
        }
        warehouse.removeAllNotLast();
        System.out.println("________________________");
        for (Item i : warehouse.getWarehouse()) {
            System.out.println(i.getName());
        }
    }
}
