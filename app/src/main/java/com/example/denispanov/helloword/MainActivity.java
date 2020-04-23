package com.example.denispanov.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCenter.start(getApplication(), "5be70317-e56a-44cd-866d-5ed9a32445eb", Analytics.class, Crashes.class);
    }
}
