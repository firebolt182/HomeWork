package firebolt.example.module2.homework3.ex1dot2;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class FeedBack {
    private int id;
    private String text;
    private long like;
    private LocalDateTime localDateTime;

    public FeedBack(int id, String text, long like, LocalDateTime localDateTime) {
        this.id = id;
        this.text = text;
        this.like = like;
        this.localDateTime = localDateTime;
    }

    public int getId() {
        return id;
    }
    public String getText() {
        return text;
    }

    public long getLike() {
        return like;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }


    @Override
    public String toString() {
        return "FeedBack{"
                + "id=" + id
                + ", text='" + text + '\''
                + ", like=" + like
                + ", localDateTime=" + localDateTime
                + '}';
    }
}
