package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
    }

    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show();
    }

    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show();
    }

    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show();
    }


}