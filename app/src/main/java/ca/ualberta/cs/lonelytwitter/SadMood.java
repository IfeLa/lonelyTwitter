package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class SadMood extends CurrentMood {
    
    static {
        Moods.add(SadMood.class);
    }
    @Override
    public String getMood(String mood){
        return mood = "Sad";
    }
    public Date getDate() {
        Date date = new Date();
        return date;
    }
}
