package com.example.click_to_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("lifecycle","onCreate invoked");

    }
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle","onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume invoked");
    }
    protected void onPause(){
        super.onPause();
        Log.d("lifecycle","onPause invoked");
    }
    protected void onStop(){
        super.onStop();
        Log.d("lifecycle","onstop invoked");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
    }
}