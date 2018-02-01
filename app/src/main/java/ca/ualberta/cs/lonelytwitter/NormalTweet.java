/*
 * NormalTweet
 *
 * January 31, 2018
 *
 * Copyright 2018 Team X
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 *  Represents a NormalTweet.
 *
 *  @author Jay
 *  @version 3.14159265358
 *  @see Tweet
 *  @see ImportantTweet
 *
 */
public class NormalTweet extends Tweet {

    /**
     * Constructs a NormalTweet object
     *
     * @param message
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs a NormalTweet Object
     *
     * @param message
     * @param date
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Returns false, as the tweet is not important
     *
     * @return
     */
    @Override
    public boolean isImportant(){
        return false;
    }
}
