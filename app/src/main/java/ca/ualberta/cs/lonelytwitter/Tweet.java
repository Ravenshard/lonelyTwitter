/*
 * Tweet
 *
 * January 31, 2018
 * Copyright 2018 Team X
 */

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

    /**
     * Constructs a tweet object.
     * @param message
     */
    public Tweet(String message){
        this.message = message;
    }

    /**
     * Constructs a tweet object
     *
     * @param message
     * @param date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Returns the date of the Tweet
     *
     * @return date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Returns the message of the Tweet
     *
     * @return message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets tweet message
     * @param message
     * @throws TweetTooLongException thrown if tweet exceeds 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 160) {
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    /**
     * Sets the date of the tweet
     *
     * @param date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Declares whether the tweet is important or not
     *
     * @return True or false
     */
    public abstract boolean isImportant();

    /**
     * Adds a mood to the tweet
     *
     * @param mood
     */
    public void addMood(AbstractMood mood){
        moods.add(mood);
    }

    @Override
    public String toString(){
        return message;
    }

}
