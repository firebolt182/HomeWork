package firebolt.example.module1.homework4.ex4.exception;

public class NoUserException extends Exception {
    public NoUserException() {
        super("Такого пользователя нет.");
    }
}
