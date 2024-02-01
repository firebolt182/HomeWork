package firebolt.example.module2.homework3.ex2;

@FunctionalInterface
public interface Garden<T extends Fruit> {
    T grow();
}
