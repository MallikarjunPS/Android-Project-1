package com.codepath.apps.twitterfeedstorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
/*import android.widget.ListView;
import com.codepath.apps.twitterfeedstorer.models.Tweet;*/
import com.loopj.android.http.JsonHttpResponseHandler;
import org.json.JSONArray;

/*import java.io.File;
import java.io.IOException;
import java.util.ArrayList;*/

import cz.msebera.android.httpclient.Header;

public class TimeLineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_line);

        MyTwitterApp.getRestClient().getHomeTimeline(1, new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {

                /*TweetsAdapter<Tweet> adapter = new TweetsAdapter(getBaseContext(),tweets);
                lvTweets.setAdapter(adapter);*/
                Log.d("DEBUG",response.toString());

                //*/JSON-Marshaling
                /*ObjectMapper mapper = new ObjectMapper();
                try {
                    mapper.writerWithDefaultPrettyPrinter()
                            .writeValue(new File("TweetData.json"), response);
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
            }
        });
    }
}
