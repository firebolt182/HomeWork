package firebolt.example.module2.homework3.ex5;

@FunctionalInterface
public interface Ruler<T, O> {
    public O action(T object);
}
