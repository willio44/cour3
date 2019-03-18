package com.example.a533.cours3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setToast();
    }

    public void setToast(){
        Intent intent = new Intent(this, Main2Activity.class);
        String wordChoose = getIntent().getStringExtra("ChoosedText");
        Toast.makeText(getApplicationContext(), wordChoose, Toast.LENGTH_LONG).show();
    }


}
