package firebolt.example.homework4.ex1;

public abstract class Car {
    private double length;
    private double width;
    private double height;
    private boolean isClean;
    private Enum category;

    public Car(double length, double width, double height, boolean isClean) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.isClean = isClean;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public Enum getCategory() {
        return category;
    }

    public void setCategory(Enum category) {
        this.category = category;
    }
}