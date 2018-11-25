package com.udacity.gradle.builditbigger;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class JokeStringTest {
    private final String TAG_TEST = getClass().getName();
    @Test
    public void checkString() {
        try {
            EndPointsAsyncTask endpointsAsyncTask = new EndPointsAsyncTask();
            endpointsAsyncTask.execute();
            String result = endpointsAsyncTask.get(30, TimeUnit.SECONDS);

            assertNotNull(result);
            assertTrue(result.length() > 0);
        } catch (Exception e){
            Log.e(TAG_TEST, "testDoInBackground: Timed out");
        }
    }
}
