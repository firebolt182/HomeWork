package firebolt.example.homework4.ex4;

public class Message {
    private String text;
    private String userName;
    private MessageType messageType;

    public Message(String userName, String text, MessageType messageType) {
        this.text = text;
        this.userName = userName;
        this.messageType = messageType;
    }

    public String getText() {
        return text;
    }

    public String getUserName() {
        return userName;
    }

    public MessageType getMessageType() {
        return messageType;
    }
}
