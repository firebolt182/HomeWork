package firebolt.example.module1.homework2.shop;

public class Worker {
    private String name;
    private int age;

    private Gender gender;
    Item[] items;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Worker(String name, int age, Gender gender, Item[] items) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void showItems() {
        //{Имя работника}: смотрите какая у меня вещь - {имя вещи}.
        for (Item item : items) {
            System.out.println(this.name + ": смотрите какая у меня вещь - " + item.getName());
        }
    }
}
