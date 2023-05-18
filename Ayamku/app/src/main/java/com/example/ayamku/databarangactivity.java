package com.example.ayamku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class  databarangactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang_telur);
    }
    public void btnbarangtelur(View view){
        Intent intent = new Intent(databarangactivity.this, com.example.ayamku.BarangTelur.class);
        startActivity(intent);
    }
    public void btnbarangayam(View view){
        Intent intent = new Intent(databarangactivity.this, com.example.ayamku.databarangayamActivity.class);
        startActivity(intent);
    }
//    public void btnbrgkbthayam(View view){
//        Intent intent = new Intent(databarangactivity.this, com.example.ayamku.databarangkbthayamActivity.class);
//        startActivity(intent);
//    }
}