package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jechmila on 1/17/18.
 */

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;

    private ArrayList<AbstractMood> moods = new ArrayList<AbstractMood>();

    Tweet(){

    }

    public Tweet(String message){
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 160) {
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract boolean isImportant();

    public void addMood(AbstractMood mood){
        moods.add(mood);
    }

    @Override
    public String toString(){
        return message;
    }

}
