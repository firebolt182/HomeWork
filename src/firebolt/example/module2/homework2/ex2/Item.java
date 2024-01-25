package firebolt.example.module2.homework2.ex2;

public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public int hashCode() {
        return 28;
    }

    @Override
    public String toString() {
        return "Item{"
                + "name='" + name + '\''
                + '}';
    }
}