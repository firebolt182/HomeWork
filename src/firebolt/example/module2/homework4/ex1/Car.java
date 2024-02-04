package firebolt.example.module2.homework4.ex1;

public class Car {
    private String number;

    private Car(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public static Car getCar(String number) {
        return new Car(number);
    }

    @Override
    public String toString() {
        return "Car{"
                + "number='" + number + '\''
                + '}';
    }
}
