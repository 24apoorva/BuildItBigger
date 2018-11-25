package com.udacity.gradle.builditbigger.backend;

import com.example.android.jokes.MyJokesClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private MyJokesClass jokesClass;

    public MyBean(){
        jokesClass = new MyJokesClass();
    }

    public String getData() {
        return jokesClass.getRandomMyJoke();
    }

}