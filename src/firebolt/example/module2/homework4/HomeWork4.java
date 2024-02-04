package firebolt.example.module2.homework4;

import firebolt.example.module2.homework4.ex1.Car;
import firebolt.example.module2.homework4.ex3.SkyScrapper;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWork4 {
    public static void main(String[] args) {
        ex1();
        try {
            ex2();
            ex3();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void ex1() {
        AtomicInteger number = new AtomicInteger(0);
        List<Car> cars1 = Stream.generate(() ->
                        Car.getCar(String.format("а0%02dан799", number.addAndGet(1))))
                .limit(50).toList();
        number.set(0);
        List<Car> cars2 = Stream.generate(() ->
                        Car.getCar(String.format("к0%02dсе178", number.addAndGet(1))))
                .limit(50).toList();
        Stream<Car> allCars = Stream.concat(cars1.stream(), cars2.stream());
        String result = allCars.map(Car::getNumber)
                .filter(carNumber -> (String.valueOf(carNumber.charAt(2))).equals("4"))
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }

    public static void ex2() throws Exception {
        List<String> words = List.of("тонь", "тополь", "боль", "рой", "стройка");
        List<String> words1 = List.of("биба", "пипа", "лупа", "пульт", "кроска");
        long result = words.stream()
                .map(word -> Arrays.stream(word.split(""))
                .filter(letter -> letter.contains("о"))
                .count())
                .reduce(Long::sum)
                .filter(sum -> sum != 0)
                .orElseThrow(() -> new Exception("нет вхождений искомой буквы"));
        System.out.println(result);
    }

    public static void ex3() throws Exception {
        SkyScrapper worldTradeCenter = new SkyScrapper("World Trade Center", 541);
        SkyScrapper shanghaiTower = new SkyScrapper("Shanghai Tower", 632);
        SkyScrapper burdzhKhalifa = new SkyScrapper("Burdzh-Khalifa", 828);
        SkyScrapper pinanInternationalCenter =
                new SkyScrapper("Pinan International Financial Center", 599);
        SkyScrapper abradzh = new SkyScrapper("Abradzh al-Beit", 601);
        SkyScrapper lotte = new SkyScrapper("World Center Lotte", 555);
        List<SkyScrapper> towers = List.of(worldTradeCenter, shanghaiTower, burdzhKhalifa,
                burdzhKhalifa, pinanInternationalCenter, abradzh, lotte);


        //Вывод первых 3х элементов
        towers.stream().distinct().limit(3).forEach(System.out::println);
        //Самый высокий небоскреб
        SkyScrapper t = towers.stream()
                .max(Comparator.comparingInt(SkyScrapper::getHeight)).orElseThrow();
        System.out.println("max height : " + t);
        //Небоскребы выше километра
        List<SkyScrapper> highest = towers.stream()
                .filter(tower -> tower.getHeight() > 1000)
                .toList();
        if (highest.isEmpty()) {
            System.out.println("небоскреба выше километра - нет");
        } else {
            highest.forEach(System.out::println);
        }
    }
}
