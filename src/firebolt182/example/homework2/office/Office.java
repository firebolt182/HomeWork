package firebolt182.example.homework2.office;

public class Office {
    Boss boss;
    Secretary secretary;
    Guard guard;
    Manager manager;
    public void workDay(Boss boss, Secretary secretary, Guard guard, Manager manager){
        boss.sayToMoveFaster(manager);
        manager.speak();
        guard.giveMeMoney();
        secretary.sayToCalmDown(boss, manager, guard);
    }
}
