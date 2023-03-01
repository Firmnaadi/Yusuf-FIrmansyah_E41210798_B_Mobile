package com.example.minggu3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
        void addData(){
            mahasiswaArrayList.add(new Mahasiswa("Yusuf Firmansyah","E41210798","085607357512"));
            mahasiswaArrayList.add(new Mahasiswa("Riski Web","E41210888","085607357555"));
            mahasiswaArrayList.add(new Mahasiswa("Rizal Ketu","E41210999","085607357511"));
            mahasiswaArrayList.add(new Mahasiswa("Bintang kejora","E41210777","085607357522"));

        }
}