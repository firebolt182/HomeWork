package firebolt182.example.homework2.shop;

public class Runner {
    Item hammer = new Item("Hammer", 1000);
    Item screwDriver = new Item("ScrewDriver", 50);
    Item noteBook = new Item("noteBook", 30);
    Item pen = new Item("Pen", 10);

    Worker vasiliy = new Worker("Vasiliy", 30, Gender.MALE, new Item[]{hammer, screwDriver});
    Worker mariana = new Worker("Mariana", 25, Gender.FEMALE, new Item[]{noteBook, pen});
    Shop shop = new Shop(new Worker[]{vasiliy, mariana});

    public void show() {
        shop.showWorkers();
        for (Worker worker : shop.getWorkers()) {
            worker.showItems();
        }
    }

}
