package com.flipkart.hackaphone.app;

import android.annotation.TargetApi;
import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

import java.io.IOException;

/**
 * Created by vinay.varma on 8/8/14.
 */
public class RetrieveFeedTask extends AsyncTask<String, Void, String> {

    @TargetApi(Build.VERSION_CODES.FROYO)
    @Override
    protected String doInBackground(String... strings) {
        HttpUriRequest httpUriRequest=new HttpGet(strings[0]);
        HttpClient httpClient= AndroidHttpClient.newInstance("hackaphone");

        try {
            HttpResponse httpResponse = httpClient.execute(httpUriRequest);
            Log.i("Response", httpResponse.getStatusLine().getStatusCode() + ":" + httpResponse.getStatusLine().getReasonPhrase());
            return String.valueOf(httpResponse.getStatusLine().getStatusCode());
        } catch (IOException e) {
            Log.e("error", "Error in http call", e);
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
