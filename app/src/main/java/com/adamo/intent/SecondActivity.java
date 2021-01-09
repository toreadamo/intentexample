package com.adamo.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Intent intent = getIntent();
        if(intent.hasExtra("key_text")) {
            String text = intent.getStringExtra("key_text");
            ((TextView) findViewById(R.id.textView)).setText(text);
            Toast.makeText(this, "Dato ricevuto: "+text, Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, "Errore di lettura del dato ", Toast.LENGTH_SHORT).show();
    }
}
