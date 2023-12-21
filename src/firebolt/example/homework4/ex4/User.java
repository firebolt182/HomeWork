package firebolt.example.homework4.ex4;

public class User {
    private String name;
    private String password;
    private Message[] messages;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        messages = new Message[100];
    }

    public String getName() {
        return name;
    }


    public String getPassword() {
        return password;
    }

    public Message[] getMessages() {
        return messages;
    }

}
