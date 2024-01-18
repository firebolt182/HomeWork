package firebolt.example.module2.homework1.ex1;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animal, B extends Animal, D extends Animal> {
    private T t;
    private B b;
    private D d;

    public Zoo(T t, B b, D d) {
        this.t = t;
        this.b = b;
        this.d = d;
    }

    public T getTiger() {
        return t;
    }

    public B getBird() {
        return b;
    }

    public D getDog() {
        return d;
    }
}