package com.rikcore.tutostagethomas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewTest = findViewById(R.id.textViewTest);
        Button buttonOk = findViewById(R.id.buttonOk);
    }
}