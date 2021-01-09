package com.adamo.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mybutton = (Button) findViewById(R.id.button);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=0;
                EditText edittext = (EditText) findViewById(R.id.editText);
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("key_text", edittext.getText().toString());
                startActivity(i);
                int a;
            }
        });
    }
    }