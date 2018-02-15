package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import io.searchbox.annotations.JestId;

public abstract class Tweet implements Tweetable, Comparable<Tweet> {
    private String message;
    private Date date;

    @JestId
    private String id;

    public String getID() {return id;}
    public void setID(String id) {this.id = id;}



    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    @Override
    public String toString(){
        return message;
    }

    public abstract Boolean isImportant();


    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

//    @Override
    public int compareTo(Tweet tweet1, Tweet tweet2){
        return tweet1.getDate().compareTo(tweet2.getDate());
    }
}
