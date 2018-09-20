package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.List;


public abstract class Tweet {
    private String message;
    private Date date;
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }
    public Tweet(String message,Date date){
        this.message = message;
        this.date = date;
    }
    public void setMessage(String message) throws TooLongTweetException{
        if(message.length()>140){
            throw new TooLongTweetException();
        }
        this.message = message;
    }
    public void setDate() {
        this.date = date;
    }
    public String getMessage(String message){
        return this.message = message;
    }
    public Date getDate() {
        return this.date = date;
    }
    public abstract boolean isImportant();

    List MoodList = CurrentMood.Moods;


}
