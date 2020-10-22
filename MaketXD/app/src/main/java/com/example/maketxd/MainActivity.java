package com.example.maketxd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button1);

    }
    public void SecondForm(android.view.View view) {
        Intent intent = new Intent( MainActivity.this, MaketXD2.class);
        startActivity(intent);
    }

}