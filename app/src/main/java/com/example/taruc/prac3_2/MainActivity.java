package com.example.taruc.prac3_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int GET_MESSAGE = 1;
    private static final int GET_PICTURE = 2;
    private TextView textViewMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }

    public void showGet(View v){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivityForResult(intent,GET_MESSAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == GET_MESSAGE){
            if(resultCode == RESULT_OK) {
                textViewMessage.setText(data.getStringExtra("MESSAGE"));
            }
        }else if(requestCode == GET_PICTURE){
            //Display image
        }
    }
}
