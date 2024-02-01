package firebolt.example.module2.homework3.ex1;

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

    public static Map<Integer, FeedBack> valueSort(TreeMap<Integer, FeedBack> map) {
        Comparator<Integer> comparator = (fb1, fb2) -> {
            int likeCompare = Long.compare(map.get(fb2).getLike(), map.get(fb1).getLike());
            if (likeCompare != 0) {
                return likeCompare;
            }
            return map.get(fb2).getLocalDateTime().compareTo(map.get(fb1).getLocalDateTime());
        };
        Map<Integer, FeedBack> sorted = new TreeMap<>(comparator);
        sorted.putAll(map);
        return sorted;
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
