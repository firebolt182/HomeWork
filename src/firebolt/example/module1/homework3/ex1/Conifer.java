package firebolt.example.module1.homework3.ex1;

//Хвойные
public abstract class Conifer extends Tree {
    protected String needleType;

    public Conifer(int age, String needleType) {
        super(age);
        this.needleType = needleType;
    }
}
