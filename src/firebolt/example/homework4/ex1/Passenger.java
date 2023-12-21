package firebolt.example.homework4.ex1;

public class Passenger extends Car {
    private boolean hasCruiseControl;

    public Passenger(double length, double width, double height,
                     boolean isClean, boolean hasCruiseControl) {
        super(length, width, height, isClean);
        this.hasCruiseControl = hasCruiseControl;
    }
}
