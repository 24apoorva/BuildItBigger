package com.udacity.gradle.builditbigger;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.android.jokedisplaylib.JokeActivity;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressLint("StaticFieldLeak")
    public void tellJoke(View view) {
        new EndPointsAsyncTask(){
            @Override
            protected void onPostExecute(String result) {
                Intent jokeDisplayIntent = new Intent(getApplicationContext(), JokeActivity.class);
                jokeDisplayIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                jokeDisplayIntent.putExtra(JokeActivity.JOKE_EXTRA, result);
                getApplication().getApplicationContext().startActivity(jokeDisplayIntent);
            }
        }.execute();

    }


}
