package com.example.ayamku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

    public class  PendataanActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_dashboard);
        }
        public void PenTelur(View view){
            Intent intent = new Intent(PendataanActivity.this, com.example.ayamku.PendaanTelurActivity.class);
            startActivity(intent);
        }
        public void PenAyam(View view){
            Intent intent = new Intent(PendataanActivity.this, com.example.ayamku.PendaanAyamActivity.class);
            startActivity(intent);
        }
        public void PenKebAyam(View view){
            Intent intent = new Intent(PendataanActivity.this, com.example.ayamku.PendaanKebAyamActivity.class);
            startActivity(intent);
        }
    }
