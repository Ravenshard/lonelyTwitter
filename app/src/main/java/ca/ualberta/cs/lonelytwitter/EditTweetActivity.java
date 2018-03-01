package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class EditTweetActivity extends Activity {
    private Tweet editTweet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        Intent parentIntent = getIntent();
        Bundle parentData = parentIntent.getExtras();
        editTweet = new NormalTweet(parentData.getString("msg"), (Date) parentData.get("date"));

        TextView txt_EditTweet = (TextView) findViewById(R.id.txtEditedText);
        txt_EditTweet.setText(editTweet.getMessage());

    }

}