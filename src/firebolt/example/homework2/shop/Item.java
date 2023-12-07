package firebolt.example.homework2.shop;

public class Item {
    private String name;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
