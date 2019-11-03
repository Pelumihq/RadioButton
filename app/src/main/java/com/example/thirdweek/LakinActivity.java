package com.example.thirdweek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class LakinActivity extends AppCompatActivity {
    String Tag="lakinDebug";
    RadioGroup radioInput;

    ImageView lakin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lakin);
//        akin=findViewById(R.id.imageInputView);l
        radioInput=findViewById(R.id.radioGroupInput);

        radioInput.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.green) {
                    Toast.makeText(LakinActivity.this, "green is the correct answer", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.blue) {
                    Toast.makeText(LakinActivity.this, "blue is wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.red) {
                    Toast.makeText(LakinActivity.this, "red is wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.orange) {
                    Toast.makeText(LakinActivity.this, "orange is wrong", Toast.LENGTH_SHORT).show();
                }
            }

    });}
    public void buttonClicked(View v){
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(lakin);
    }

    @Override

    protected  void onStart(){
        super.onStart();
        Log.d(Tag, "onStart");

    }
    @Override

    protected void onResume(){
        super.onResume();
        Log.d(Tag,"onResume");
    }
    @Override

    protected void onStop(){
        super.onStop();
        Log.d(Tag,"onStop");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(Tag,"onPause");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(Tag,"onDestroy");
    }


}
/*
* int counter =0;
* initializeViews();
*
* buttonClicked(View v){
* counter++;
* initialiseViews;
* }
*
* initialiseViews(){
* questionTextView.setText(question[counter])
* radioButton1.setText(option[counter])
* }
*
* */