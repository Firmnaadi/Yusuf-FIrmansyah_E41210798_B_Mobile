package com.example.minggu5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name;
Button btnSend;
private String KEY_NAME = "NAMA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.edit_nama);
        btnSend = (Button) findViewById(R.id.btn_send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String nama = name.getText().toString();
                    if (nama.equals("")){
                        Toast.makeText(getApplication(),"YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                    }else{
                        Intent i = new Intent(MainActivity.this, SecondActivity.class);
                        i.putExtra(KEY_NAME,nama);
                        startActivity(i);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(),"ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
                }
            }
        });
    }
}