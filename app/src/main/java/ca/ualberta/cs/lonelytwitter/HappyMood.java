package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jechmila on 1/17/18.
 */

public class HappyMood extends AbstractMood {

    public HappyMood(){

    }

    public HappyMood(Date date){
        super(date);
    }

    @Override
    public String getMood(){
        return "I am happy, not sad";
    }


}
