package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.util.Log;

public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;
	private ArrayList<NormalTweet> tweetList = new ArrayList<NormalTweet>();
	private ArrayAdapter<NormalTweet> adapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		Button clearButton = (Button) findViewById(R.id.clear);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();
				NormalTweet newTweet = new NormalTweet(text);
				tweetList.add(newTweet);
				adapter.notifyDataSetChanged();
				// saveInFile(); // TODO replace this with elastic search
                ElasticsearchTweetController.AddTweetsTask addTweetsTask = new ElasticsearchTweetController.AddTweetsTask();
                addTweetsTask.execute(newTweet);
			}
		});

		clearButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				tweetList.clear();
				deleteFile(FILENAME);  // TODO deprecate this button
				adapter.notifyDataSetChanged();
			}
		});

	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		//loadFromFile(); // TODO replace this with elastic search
        ElasticsearchTweetController.GetTweetsTask getTweetsTask = new ElasticsearchTweetController.GetTweetsTask();
        getTweetsTask.execute("");

        try{
            tweetList = getTweetsTask.get();
        } catch (Exception e) {
            Log.i("Error", "Failed to get the tweets from the async object");
        }

		adapter = new ArrayAdapter<NormalTweet>(this,
				R.layout.list_item, tweetList);
		oldTweetsList.setAdapter(adapter);
	}
}