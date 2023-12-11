package firebolt.example.homework3.ex4;

public class LotteryTicket {
    private static int ticketNumber;
    private static int summary = 0;

    public static int getSummary() {
        return summary;
    }

    public LotteryTicket() {
        ticketNumber++;
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
