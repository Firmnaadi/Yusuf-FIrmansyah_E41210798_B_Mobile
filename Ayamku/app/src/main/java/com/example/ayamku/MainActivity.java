package com.example.ayamku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
  //  public void login(View view){
    //    Intent intent = new Intent(MainActivity.this,com.example.Ayamku.dashboard.class);
      //  startActivity(intent);
   // }
  public void btnconstrain(View view){
      Intent intent = new Intent(MainActivity.this, com.example.ayamku.JadwalActivity.class);
  }
//    public void btnlinier(View view){
//        Intent intent = new Intent(MainActivity.this, com.example.ayamku.AyamActivity.class);
//        startActivity(intent);
//    }

    public void btnframe(View view){
        Intent intent = new Intent(MainActivity.this, com.example.ayamku.TelurActivity.class);
        startActivity(intent);
    }
}