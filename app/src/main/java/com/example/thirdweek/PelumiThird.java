package com.example.thirdweek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class PelumiThird extends AppCompatActivity {
    String Tag = "pelumiDebug";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelumi_third);
    }

    @Override

    protected void onStart() {
        super.onStart();
        Log.d(Tag, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag, "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag, "onPause");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag, "onDestroy");
    }
}
