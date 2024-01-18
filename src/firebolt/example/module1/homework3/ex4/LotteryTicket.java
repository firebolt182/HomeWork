package firebolt.example.module1.homework3.ex4;

public class LotteryTicket {
    private int ticketNumber;
    private static int counter = 1;
    private static int summary = 0;
    public LotteryTicket() {
        ticketNumber = counter;
        counter++;
    }

    public static int getSummary() {
        return summary;
    }

    public void checkFortune() {
        if (ticketNumber % 100 == 0) {
            summary += 5000;
        } else if (ticketNumber % 10 == 0) {
            summary += 100;
        } else {
            summary += 0;
        }
    }
}
