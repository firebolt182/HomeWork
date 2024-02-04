package firebolt.example.module2.homework4.ex3;

public class SkyScrapper {
    private String name;
    private int height;

    public SkyScrapper(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "SkyScrapper{"
                + "name='" + name + '\''
                + ", height=" + height
                + '}';
    }
}
