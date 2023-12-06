package firebolt182.example.homework2.office;

public class Runner {
    Boss boss = new Boss("Петр Николаевич");
    Manager manager = new Manager("Володя");
    Guard guard = new Guard("Петрович");
    Secretary secretary = new Secretary();

    Office office = new Office();

    public void startWorkDay() {
        this.office.workDay(boss, secretary, guard, manager);
    }

}
