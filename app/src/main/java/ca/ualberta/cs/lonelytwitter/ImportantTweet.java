
/*
 * ImportantTweet
 *
 * January 31, 2018
 *
 * Copyright 2018 Team X
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 *  Represents an important tweet.
 *
 *  @author Jay
 *  @version 3.14159265358
 *  @see NormalTweet
 *  @see Tweet
 */
public class ImportantTweet extends Tweet {

    /**
     * Constructs an ImportantTweet object
     *
     * @param message
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs an ImportantTweet object
     *
     * @param message
     * @param date
     */
    ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Returns true, as the tweet is important
     *
     * @return True
     */
    @Override
    public boolean isImportant(){
        return true;
    }

}
