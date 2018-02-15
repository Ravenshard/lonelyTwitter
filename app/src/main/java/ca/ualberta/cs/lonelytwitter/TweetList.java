package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Jay on 2018-02-14.
 */

public class TweetList extends Exception {

    private ArrayList<Tweet> tweets = new ArrayList<>();

    public TweetList(){

    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void add(Tweet tweet)throws IllegalArgumentException{
        if(!hasTweet(tweet)) {
            tweets.add(tweet);
        }
        else{
            throw new IllegalArgumentException();
        }
    }


    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public int getCount(){
        return tweets.size();
    }

    public ArrayList<Tweet> getTweets(){
        return tweets;
    }
}