package firebolt.example.module2.homework2.ex1;

public class Runner {
    public static void main(String[] args) {
        LuggageRoom luggageRoom = new LuggageRoom(new Worker("Sam"), new Worker("Ben"),
                new Worker("Steve"));
        luggageRoom.arrival("SU-077");
        luggageRoom.arrival("AO-222");
        luggageRoom.discharge();
    }


}
