package com.simple.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lib.view.TextProgressView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        TextProgressView textProgressView = findViewById(R.id.textprogressview);
        textProgressView.setMaxProgress(100);
        textProgressView.setProgress(50);
    }
}
