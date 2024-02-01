package firebolt.example.module2.homework3;

import firebolt.example.module2.homework3.ex1.FeedBack;
import firebolt.example.module2.homework3.ex2.Apple;
import firebolt.example.module2.homework3.ex2.Apricot;
import firebolt.example.module2.homework3.ex2.Fruit;
import firebolt.example.module2.homework3.ex2.Garden;
import firebolt.example.module2.homework3.ex3.Client;
import firebolt.example.module2.homework3.ex3.Prediction;
import firebolt.example.module2.homework3.ex4.Incineration;
import firebolt.example.module2.homework3.ex4.Tree;
import firebolt.example.module2.homework3.ex4.Uranus;
import firebolt.example.module2.homework3.ex5.Animal;
import firebolt.example.module2.homework3.ex5.Boat;
import firebolt.example.module2.homework3.ex5.Ruler;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;


public class HomeWork3 {
    public static void main(String[] args) {
        ex1();
        ex3();
        ex4();
        ex5();
    }

    public static void ex1() {
        FeedBack feedBack5 = new FeedBack(5, "test5", 43, LocalDateTime.of(2023, Month.NOVEMBER,
                11, 23, 22));
        FeedBack feedBack2 = new FeedBack(2, "test2", 44, LocalDateTime.of(2023, Month.NOVEMBER,
                11, 23, 59));
        FeedBack feedBack3 = new FeedBack(2, "test3", 50, LocalDateTime.of(2023, Month.NOVEMBER,
                11, 19, 59));
        FeedBack feedBack4 = new FeedBack(4, "test4", 50, LocalDateTime.of(2023, Month.NOVEMBER,
                11, 15, 59));
        FeedBack feedBack1 = new FeedBack(1, "test1", 46, LocalDateTime.of(2023, Month.NOVEMBER,
                11, 11, 51));
        TreeMap<Integer, FeedBack> feedBacks = new TreeMap<>();
        feedBacks.put(feedBack1.getId(), feedBack1);
        feedBacks.put(feedBack2.getId(), feedBack2);
        feedBacks.put(feedBack3.getId(), feedBack3);
        feedBacks.put(feedBack4.getId(), feedBack4);
        feedBacks.put(feedBack5.getId(), feedBack5);

        Map<Integer, FeedBack> sortedMap = FeedBack.valueSort(feedBacks);
        int feedBackCount = 1;
        for (Map.Entry<Integer, FeedBack> feedBack : sortedMap.entrySet()) {
            System.out.printf("Отзыв №%d: %d, %s, %d, %s %s\n",
                    feedBackCount++, feedBack.getValue().getId(),
                    feedBack.getValue().getText(), feedBack.getValue().getLike(),
                    feedBack.getValue().getLocalDateTime().toLocalDate(),
                    feedBack.getValue().getLocalDateTime().toLocalTime());
        }
    }

    public static void ex2() {
        Garden<Apple> appleGarden = Apple::new;
        Garden<Apricot> apricotGarden = Apricot::new;
        Apple apple1 = appleGarden.grow();
        Apple apple2 = appleGarden.grow();
        Apricot apricot = apricotGarden.grow();
    }

    public static void ex3() {
        Client nick = new Client("Nick", 24, 175);
        Prediction<String> chamomile = (String name) -> name.length() % 2 == 0;
        Prediction<Client> futureTeller =
                (Client client) -> (client.getHeight() + client.getAge()) >= 210;
        System.out.println(chamomile.makePrediction(nick.getName()));
        System.out.println(futureTeller.makePrediction(nick));
    }

    public static void ex4() {
        Incineration<Uranus> nuclearReactor =
                (Uranus uranus) -> System.out.println("Зеленый свет вокруг");
        Incineration<Tree> fire =
                (Tree tree) -> System.out.println("Желто-красный свет вокруг!");
        nuclearReactor.burning(new Uranus());
        fire.burning(new Tree());
    }

    public static void ex5() {
        Animal someAnimal = new Animal(20, 150);
        Ruler<Animal, Integer> animalMeasure =
                (Animal animal) -> animal.getBodyLength() + animal.getTailLength();
        System.out.println(animalMeasure.action(someAnimal));
        Boat superBoat = new Boat(250);
        Ruler<Boat, Integer> boatMeasure = (Boat boat) -> boat.getLength();
        System.out.println(boatMeasure.action(superBoat));
    }
}
