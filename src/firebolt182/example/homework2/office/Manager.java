package firebolt182.example.homework2.office;

public class Manager {
    private String name;

    public String getName() {
        return name;
    }

    public Manager(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("я ничего не успеваю, помогите!");
    }
}
