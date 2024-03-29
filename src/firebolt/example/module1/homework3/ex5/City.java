package firebolt.example.module1.homework3.ex5;

import java.util.Arrays;

public final class City {
    private String name;
    private House[] houses;

    public City(String name, House[] houses) {
        this.name = name;
        House[] copyHouse = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            copyHouse[i] = new House(houses[i].getStreet(), houses[i].getHouseNumber());
        }
        this.houses = copyHouse;
    }

    public String getName() {
        return name;
    }

    public House[] getHouses() {
        return houses;
    }

    @Override
    public String toString() {
        return "City{"
               + "name='" + name + '\''
               + ", houses=" + Arrays.toString(houses)
               + '}';
    }

}
