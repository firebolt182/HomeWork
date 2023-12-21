package firebolt.example.homework4.ex1;

public class CarWash {
    private Car car;

    public Enum setCategory(Car car) {
        if (car.getLength() > 6 || car.getHeight() > 2.5 || car.getWidth() > 2) {
            car.setCategory(Category.BIG);
        } else {
            car.setCategory(Category.SMALL);
        }
        return car.getCategory();
    }

    public int wash(Car car) {
        car.setClean(true);
        if (this.setCategory(car) == Category.BIG) {
            return 4000;
        } else {
            return 2000;
        }
    }

    public int wash(Car[] cars) {
        int sum = 0;
        for (Car car : cars) {
            sum += this.wash(car);
        }
        return sum;
    }

}
