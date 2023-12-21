package firebolt.example.homework4.ex4.exception;

public class CurrentUserException extends Exception {
    public CurrentUserException() {
        super("Вы не авторизованы");
    }
}
