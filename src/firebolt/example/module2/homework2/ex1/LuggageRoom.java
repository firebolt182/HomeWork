package firebolt.example.module2.homework2.ex1;

import java.util.LinkedList;
import java.util.Queue;

public class LuggageRoom {
    private Queue<Luggage> luggage = new LinkedList<>();
    private Worker sam;
    private Worker ben;
    private Worker steve;

    public LuggageRoom(Worker sam, Worker ben, Worker steve) {
        this.sam = sam;
        this.ben = ben;
        this.steve = steve;
    }

    public void arrival(String flightNumber) {
        for (int i = 0; i < 20; i++) {
            luggage.add(new Luggage(flightNumber));
        }
    }

    public void discharge() {
        while (!luggage.isEmpty()) {
            ben.throwLuggage(luggage);
            sam.throwLuggage(luggage);
            steve.throwLuggage(luggage);
        }
    }
}
