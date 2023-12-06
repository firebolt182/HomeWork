package firebolt182.example.homework2.office;

public class Guard {
    private String name;

    public String getName() {
        return name;
    }

    public Guard(String name) {
        this.name = name;
    }

    public void giveMeMoney() {
        System.out.println("Прошу выдать мне аванс!");
    }
}
