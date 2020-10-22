package com.example.maketxd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MaketXD2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maket_x_d2);
        ImageView home = (ImageView) findViewById(R.id.imageView1);
        ImageView gallery = (ImageView) findViewById(R.id.imageView4);
    }
    public void Home(android.view.View view) {
        Intent intent = new Intent( MaketXD2.this, MainActivity.class);
        startActivity(intent);
    }
    public void Gallery(android.view.View view) {
        Intent intent = new Intent( MaketXD2.this, MaketXD3.class);
        startActivity(intent);
    }
}