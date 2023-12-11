package firebolt.example.homework3;

import firebolt.example.homework3.ex1.BirchTree;
import firebolt.example.homework3.ex1.FirTree;
import firebolt.example.homework3.ex1.PineTree;
import firebolt.example.homework3.ex1.Tree;
import firebolt.example.homework3.ex2.Factory;
import firebolt.example.homework3.ex2.Iphone;
import firebolt.example.homework3.ex2.Samsung;
import firebolt.example.homework3.ex3.Pyramid1;
import firebolt.example.homework3.ex3.Pyramid3;
import firebolt.example.homework3.ex4.LotteryTicket;
import firebolt.example.homework3.ex5.City;
import firebolt.example.homework3.ex5.House;


public class Homework3 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }

    public static void ex1() {
        PineTree pineTree = new PineTree(50, "Big");
        FirTree firTree = new FirTree(70, "Small");
        BirchTree birchTree = new BirchTree(90, true);
        Tree[] trees = {pineTree, firTree, birchTree};
        double average = 0;
        for (Tree tree : trees) {
            average += tree.getAge();
        }
        System.out.println("Средний возраст деревьев: " + average / trees.length);
    }

    public static void ex2() {
        Factory factory = new Factory();
        factory.assembly(new Samsung("Samsung Galaxy"));
        factory.assembly(new Iphone("Iphone 15"));
    }

    public static void ex3() {
        new Pyramid1().print();
    }

    public static void ex4() {
        for (int i = 0; i < 110; i++) {
            new LotteryTicket().checkFortune();
        }
        System.out.println(LotteryTicket.getSummary());
    }

    public static void ex5() {
        House house1 = new House("Mira", 66);
        House house2 = new House("Tolstogo", 99);
        House[] houses = {house1, house2};
        City city = new City("city17", houses);
        System.out.println(city);
        for (House house : houses) {
            house.setHouseNumber(11111111);
            house.setStreet("Another st.");
        }
        House[] cityHouses = city.getHouses();
        for (House house : cityHouses) {
            System.out.println(house.getStreet());
            System.out.println(house.getHouseNumber());
        }

    }
}