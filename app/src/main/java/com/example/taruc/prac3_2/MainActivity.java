package com.example.taruc.prac3_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int GET_MESSAGE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showGet(View v){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivityForResult(intent,GET_MESSAGE);
    }


}
