package com.example.maketxd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MaketXD3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maket_x_d3);
        ImageView home1 = (ImageView) findViewById(R.id.imageView1);
        ImageView contacts = (ImageView) findViewById(R.id.imageView2);
    }
    public void Home(android.view.View view) {
        Intent intent = new Intent( MaketXD3.this, MainActivity.class);
        startActivity(intent);
    }
    public void Contacts(android.view.View view) {
        Intent intent = new Intent( MaketXD3.this, MaketXD2.class);
        startActivity(intent);
    }
}