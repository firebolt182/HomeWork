package firebolt.example.module2.homework3.ex3;

@FunctionalInterface
public interface Prediction<T> {
    boolean makePrediction(T value);
}
