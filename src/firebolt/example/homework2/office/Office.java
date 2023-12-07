package firebolt.example.homework2.office;

public class Office {
    public void workDay(Boss boss, Secretary secretary, Guard guard, Manager manager) {
        boss.sayToMoveFaster(manager);
        manager.speak();
        guard.giveMeMoney();
        secretary.sayToCalmDown(boss, manager, guard);
    }
}
