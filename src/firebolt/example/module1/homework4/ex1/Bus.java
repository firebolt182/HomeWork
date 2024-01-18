package firebolt.example.module1.homework4.ex1;

public class Bus extends Car {
    private int maxPassengers;
    public Bus(double length, double width, double height, boolean isClean, int maxPassengers) {
        super(length, width, height, isClean);
        this.maxPassengers = maxPassengers;
    }
}
