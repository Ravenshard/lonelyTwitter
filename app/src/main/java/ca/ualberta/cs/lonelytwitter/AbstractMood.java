package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jechmila on 1/17/18.
 */

public abstract class AbstractMood {
    private Date date;

    public AbstractMood(){

    }

    public AbstractMood(Date date){
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }

    public String getMood(){
        return "I am sad";
    }


}
