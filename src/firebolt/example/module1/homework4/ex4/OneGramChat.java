package firebolt.example.module1.homework4.ex4;

import firebolt.example.module1.homework4.ex4.exception.CurrentUserException;
import firebolt.example.module1.homework4.ex4.exception.IncorrectUserException;
import firebolt.example.module1.homework4.ex4.exception.NoUserException;
import java.util.Scanner;

public class OneGramChat {
    private User[] users = new User[100];
    private User currentUser;
    private Scanner scanner = new Scanner(System.in);
    private int userCount = 0;

    //создание пользователя
    public void createUser() {
        String name = scanner.nextLine();
        String password = scanner.nextLine();
        users[userCount++] = new User(name, password);
    }

    //вход пользователя
    public void entrance() throws IncorrectUserException {
        String name = scanner.nextLine();
        String password = scanner.nextLine();
        for (User user : users) {
            if (user != null && user.getName().equals(name)
                    && user.getPassword().equals(password)) {
                currentUser = user;
            }
        }
        if (currentUser == null) {
            throw new IncorrectUserException();
        }
    }

    //выход пользователя
    public void exit() {
        currentUser = null;
    }

    //пишем сообщение
    public void write() throws NoUserException, CurrentUserException {
        if (currentUser == null) {
            throw new CurrentUserException();
        }
        User receiverUser = null;
        System.out.println("Введите кому пишем");
        String receiver = scanner.nextLine();
        System.out.println("Введите текст сообщения");
        String message = scanner.nextLine();
        for (User user : users) {
            if (user != null && user.getName().equals(receiver)) {
                receiverUser = user;
            }
        }
        if (receiverUser == null) {
            throw new NoUserException();
        }

        for (int i = 0; i < receiverUser.getMessages().length; i++) {
            if (receiverUser.getMessages()[i] == null) {
                receiverUser.getMessages()[i] =
                        new Message(currentUser.getName(), message, MessageType.IN);
                break;
            }
        }
        for (int i = 0; i < currentUser.getMessages().length; i++) {
            if (currentUser.getMessages()[i] == null) {
                currentUser.getMessages()[i] = new Message(receiver, message, MessageType.OUT);
                break;
            }
        }
    }

    //чтение сообщений
    public void read() throws CurrentUserException {
        if (currentUser == null) {
            throw new CurrentUserException();
        }
        for (Message message : currentUser.getMessages()) {
            if (message == null) {
                break;
            }
            switch (message.getMessageType()) {
                case IN:
                    System.out.println("Письмо от " + message.getUserName() + ": "
                        + message.getText());
                    break;
                case OUT:
                    System.out.println("Письмо к " + message.getUserName() + ": "
                        + message.getText());
                    break;
            }
        }
    }

    //запуск чата
    public void launch() {
        String action = "";
        while (!action.equals("exit")) {
            action = scanner.nextLine();
            switch (action) {
                case "войти":
                    try {
                        entrance();
                    } catch (IncorrectUserException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "новый":
                    createUser();
                    break;
                case "выйти":
                    exit();
                    break;
                case "написать":
                    try {
                        write();
                    } catch (NoUserException | CurrentUserException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "прочитать":
                    try {
                        read();
                    } catch (CurrentUserException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }
}
