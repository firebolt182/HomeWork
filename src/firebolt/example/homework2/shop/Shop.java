package firebolt.example.homework2.shop;

import java.util.Arrays;

public class Shop {
    private Worker[] workers;

    public Worker[] getWorkers() {
        return workers;
    }

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void showWorkers() {
        for (Worker worker : this.workers) {
            System.out.println(worker.getName() + ": " + worker.getAge()
                    + " лет, " + worker.getGender()
                    + ", список вещей: " + Arrays.toString(worker.getItems()));
        }
    }
}
