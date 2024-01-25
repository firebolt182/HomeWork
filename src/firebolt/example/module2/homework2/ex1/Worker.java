package firebolt.example.module2.homework2.ex1;

import java.util.Objects;
import java.util.Queue;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void throwLuggage(Queue<Luggage> luggage) {
        if (!luggage.isEmpty()) {
            System.out.println(this.getName() + ": Мужики, кидаю чемодан "
                    + Objects.requireNonNull(luggage.poll()).getFlightNumber());
        }
    }
}
