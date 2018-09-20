package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class HappyMood extends CurrentMood {

    static {
        Moods.add(HappyMood.class);
    }
    @Override
    public String getMood(String mood){
        return mood = "Happy";
    }
    public Date getDate() {
        Date date = new Date();
        return date;
    }
}
