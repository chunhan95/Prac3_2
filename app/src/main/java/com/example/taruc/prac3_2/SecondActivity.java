package com.example.taruc.prac3_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
     private EditText editTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editTextMessage = (EditText)findViewById(R.id.editTextMessage);
    }

    public void closeSecond(View v){
        String msg = editTextMessage.getText().toString();
        Intent intentMessage = new Intent();
        intentMessage.putExtra("MESSAGE",msg);

        setResult(RESULT_OK,intentMessage);

        finish();
    }
}
