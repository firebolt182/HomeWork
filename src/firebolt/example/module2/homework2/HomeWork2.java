package firebolt.example.module2.homework2;

import firebolt.example.module2.homework2.ex2.Item;
import firebolt.example.module2.homework2.ex3.Detail;

import java.util.HashMap;
import java.util.Map;

public class HomeWork2 {
    public static void main(String[] args) {
        ex2();
        ex3();
    }

    public static void ex2() {
        Item apple = new Item("яблоко");
        Item banana = new Item("банан");
        Item orange = new Item("апельсин");
        Map<Item, Integer> fruits = new HashMap<>();
        fruits.put(apple, 1);
        fruits.put(banana, 2);
        fruits.put(orange, 3);
        System.out.println(fruits.get(orange));
    }

    public static void ex3() {
        Detail saw = new Detail("Пила");
        Detail hammer = new Detail("Молоток");
        Detail screwDriver = new Detail("Отвертка");
        Map<Detail, Integer> details = new HashMap<>();
        details.put(saw, 1);
        details.put(hammer, 2);
        details.put(screwDriver, 3);
        System.out.println(details);
    }
}
