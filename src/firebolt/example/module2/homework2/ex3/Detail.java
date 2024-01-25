package firebolt.example.module2.homework2.ex3;

public class Detail {
    private String name;

    public Detail(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 33;
    }

    @Override
    public String toString() {
        return "Detail{"
                + "name='" + name + '\''
                + '}';
    }
}
