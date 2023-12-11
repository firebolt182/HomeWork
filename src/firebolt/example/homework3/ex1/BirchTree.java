package firebolt.example.homework3.ex1;

//Береза
public class BirchTree extends Deciduous {
    @Override
    public void bloom() {
        super.bloom();
        System.out.println("Источает аллергены");
    }

    public BirchTree(int age, boolean hasLeaves) {
        super(age, hasLeaves);
    }
}
