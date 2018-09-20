package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class CurrentMood {
    private String mood;
    private Date date;
    public static List Moods = new ArrayList();
    public abstract String getMood(String mood);
    public abstract Date getDate();
}
