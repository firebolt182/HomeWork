package firebolt.example.module2.homework1.ex3;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private ArrayList<Item> warehouse = new ArrayList<>();

    public List<Item> getWarehouse() {
        return warehouse;
    }

    public void addToWarehouse(List<Item> list) {
        warehouse.addAll(list);
    }

    public List<Item> evenItems() {
        List<Item> evenItemsList = new ArrayList<>();
        warehouse.stream().filter(a -> warehouse.indexOf(a) % 2 == 0).forEach(evenItemsList::add);
        return evenItemsList;
    }

    public Item getItemByIndex(int index) {
        Item item = warehouse.get(index);
        warehouse.remove(index);
        return item;
    }

    public void removeAllNotLast() {
        warehouse.subList(0, warehouse.size() - 1).clear();
    }
}
