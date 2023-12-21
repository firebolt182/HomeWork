package firebolt.example.homework4;

import firebolt.example.homework4.ex1.*;
import firebolt.example.homework4.ex2.Duck;
import firebolt.example.homework4.ex2.FlyException;
import firebolt.example.homework4.ex2.Flyable;
import firebolt.example.homework4.ex2.Plane;
import firebolt.example.homework4.ex3.*;
import firebolt.example.homework4.ex4.OneGramChat;

public class Homework4 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        Car passenger1 = new Passenger(5, 2, 1.8, false, true);
        Car passenger2 = new Passenger(5, 2, 1.8, false, true);
        Car passenger3 = new Passenger(5, 2, 1.8, false, true);
        Car passenger4 = new Passenger(5, 2, 1.8, false, true);
        Car bus1 = new Bus(12, 3, 2.3, false, 32);
        Car bus2 = new Bus(12, 3, 2.3, false, 32);
        Car bus3 = new Bus(12, 3, 2.3, false, 64);
        Car bus4 = new Bus(12, 3, 2.3, false, 64);
        Car bus5 = new Bus(12, 3, 2.3, false, 128);
        Car[] cars = {passenger1, passenger2, passenger3, passenger4, bus1, bus2, bus3, bus4, bus5};
        Government government = new Government(cars);
        CarWash carWash = new CarWash();
        int result = carWash.wash(government.getCars());
        System.out.println(result);
    }

    public static void ex2() {
        Flyable[] flyers = {new Duck(false), new Duck(true),
            new Plane(10), new Plane(-1)};
        for (Flyable flyer : flyers) {
            try {
                flyer.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void ex3() {
        Speakable[] speakable = {new Man(), new Builder(), new Driver(), new Bird()};
        for (Speakable speaker : speakable) {
            System.out.println(speaker.speak());
        }
    }

    public static void ex4() {
        OneGramChat oneGramChat = new OneGramChat();
        oneGramChat.launch();
    }
}
