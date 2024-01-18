package firebolt.example.module1.homework3.ex1;

//Лиственные
public abstract class Deciduous extends Tree {
    protected boolean hasLeaves;

    public void leavesFall() {
        this.hasLeaves = false;
        System.out.println("Листья пропадают с дерева");
    }

    public void bloom() {
        this.hasLeaves = true;
        System.out.println("Листья появляются");
    }

    public Deciduous(int age, boolean hasLeaves) {
        super(age);
        this.hasLeaves = hasLeaves;
    }

}
