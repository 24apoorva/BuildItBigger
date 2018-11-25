package com.example.android.jokedisplaylib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static final String JOKE_EXTRA = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        String joke = getIntent().getStringExtra(JOKE_EXTRA);
        TextView jokesTv = findViewById(R.id.jokesDisplay_tv);
        jokesTv.setText(joke);
    }
}
