package com.example.denispanov.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Map;
import java.util.HashMap;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCenter.setLogLevel(Log.VERBOSE);
        AppCenter.start(getApplication(), "b6d4def7-debe-46e4-88dc-c383d6db5d02", Analytics.class, Crashes.class);

        Analytics.trackEvent("Test empty event");

        Map<String, String> data = new HashMap<>();
        data.put("Name", "isTest");
        data.put("Value", "true");
        Analytics.trackEvent("Test data event", data);

        Crashes.generateTestCrash();
        //throw new IllegalStateException("Test crash");
    }
}
