package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jechmila on 1/17/18.
 */

public interface Tweetable {
     String getMessage();
     void setMessage(String message) throws TweetTooLongException;

}
