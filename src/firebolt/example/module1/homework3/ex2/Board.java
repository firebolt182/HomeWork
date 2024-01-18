package firebolt.example.module1.homework3.ex2;

public class Board {
    private String name;
    private int width;
    private int length;
    private int height;

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public Board(String name, int width, int length, int height) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.height = height;
    }
    //плату j-108(размер (ширина Х длина Х высота) 10х12х13),
    @Override
    public String toString() {
        return name + "(размер(" + width + "x" + length + "x" + height + "))";

    }
}
