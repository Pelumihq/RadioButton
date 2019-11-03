package com.example.thirdweek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    String Tag="NimiDebug";
    ImageView lonimi;
    RadioGroup radioInput;
    CheckBox checkBoxInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lonimi=  findViewById(R.id.imageView);
        radioInput=findViewById(R.id.rdGroup);
        checkBoxInput=findViewById(R.id.checkMe);

        radioInput.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group,int checkedId){
                if(checkedId==R.id.option3){
                    Toast.makeText(MainActivity.this, "Right Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBoxInput.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "check box checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public  void loadImage(View v){
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(lonimi);
        Log.d(Tag,"after picture");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag,"onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag,"onDestroy");
    }




    }



