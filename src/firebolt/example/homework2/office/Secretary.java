package firebolt.example.homework2.office;

public class Secretary {
    public void sayToCalmDown(Boss boss, Manager manager, Guard guard) {
        System.out.println(boss.getName() + " не волнуйтесь, " + manager.getName()
                + " все успеет. " + guard.getName() + " - подождите!");
    }
}
