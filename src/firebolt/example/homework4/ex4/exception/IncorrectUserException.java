package firebolt.example.homework4.ex4.exception;

public class IncorrectUserException extends Exception {
    public IncorrectUserException() {
        super("Данный пользователь отсутствует в системе");
    }
}
