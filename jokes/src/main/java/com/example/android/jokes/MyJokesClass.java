package com.example.android.jokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyJokesClass {
    private final List<String> allJokes;
    private Random random;
    public MyJokesClass(){
        allJokes = new ArrayList<>();
        allJokes.add("Can a kangaroo jump higher than a house? \n" +
                "-\n" +
                "Of course, a house doesn’t jump at all.\n");
        allJokes.add("Anton, do you think I’m a bad mother?\n" +
                "\n" +
                "My name is Paul.\n");
        allJokes.add("I’ve always thought my neighbors were quite nice people. But then they put a password on their Wi-Fi.\n");
        random = new Random();
    }

    public List<String> getJokesAll(){
        return allJokes;
    }
    public String getRandomMyJoke(){
        int n = random.nextInt(allJokes.size());
        return allJokes.get(n);
    }
}
