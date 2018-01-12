package com.codepath.apps.twitterfeedstorer;

import android.app.Application;
import android.util.Log;

import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;

import cz.msebera.android.httpclient.Header;

public class ResposeActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TwitterClient client = MyTwitterApp.getRestClient();
        client.getHomeTimeline(1, new JsonHttpResponseHandler() {
            public void onSuccess(int statusCode, Header[] headers, JSONArray jsonArray) {
                Log.d("DEBUG", "timeline: " + jsonArray.toString());
                // Load json array into model classes
            }
        });
    }
}
