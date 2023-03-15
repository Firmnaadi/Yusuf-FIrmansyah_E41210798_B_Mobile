package com.example.minggu3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_menu_dashboard);
    }
    public void btnconstrain(View view){
        Intent intent = new Intent(MainActivity.this, com.example.minggu3.ConstrainActivity.class);
        startActivity(intent);
    }
    public void btnlinier(View view){
        Intent intent = new Intent(MainActivity.this, com.example.minggu3.LinierActivity.class);
        startActivity(intent);
    }

    public void btnframe(View view){
        Intent intent = new Intent(MainActivity.this, com.example.minggu3.FrameActivity.class);
        startActivity(intent);
    }
    public void btnhorizontal(View view){
        Intent intent = new Intent(MainActivity.this, com.example.minggu3.HorizontalActivity.class);
        startActivity(intent);
    }
    public void btnmaterial(View view){
        Intent intent = new Intent(MainActivity.this, com.example.minggu3.MaterialActivity.class);
        startActivity(intent);
    }
    public void btnrelative(View view){
        Intent intent = new Intent(MainActivity.this, com.example.minggu3.RelativeActivity.class);
        startActivity(intent);
    }
    public void btnscroll(View view){
        Intent intent = new Intent(MainActivity.this, com.example.minggu3.ScrollActivity.class);
        startActivity(intent);
    }
    public void btntabel(View view){
        Intent intent = new Intent(MainActivity.this, com.example.minggu3.TabelActivity.class);
        startActivity(intent);
    }
}