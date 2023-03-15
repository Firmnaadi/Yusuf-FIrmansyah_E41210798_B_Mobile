package com.example.minggu2;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);
    }
//    protected void linear(View view){
//        Intent intent = new Intent(MainActivity.this, ConstrainActivity.class);
//        StartActivity(intent);
//    }
}