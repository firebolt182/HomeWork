package firebolt.example.homework4.ex3;

public class Builder extends Man {

    @Override
    public String speak() {
        return "Я строитель. " + super.speak();
    }
}
