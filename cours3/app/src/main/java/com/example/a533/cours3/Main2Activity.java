package com.example.a533.cours3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText editTextChoose ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextChoose = findViewById(R.id.editText_PassText);
        setListener();
    }

    private void setListener(){
        findViewById(R.id.button_PassText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToConnectActivity();
            }
        });

    }

    private void moveToConnectActivity(){
        Intent intent = new Intent(this, Main3Activity.class);
        intent.putExtra("ChoosedText", String.valueOf(editTextChoose.getText()));
        startActivity(intent);
    }
}
