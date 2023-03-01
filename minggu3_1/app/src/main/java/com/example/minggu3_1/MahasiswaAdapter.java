package com.example.minggu3_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {
    private ArrayList<Mahasiswa> dataList;
    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList){
        this.dataList = dataList;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInfalter = LayoutInflater.from(parent.getContext());
        View view = layoutInfalter.inflate(R.layout.list_item, parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.TxtNpm.setText(dataList.get(position).getNama());
        holder.TxtNohp.setText(dataList.get(position).getNohp());
    }

    @Override
    public int getItemCount() {
        return (dataList !=null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends  RecyclerView.ViewHolder{
        private TextView txtNama, TxtNpm,TxtNohp ;

        public  MahasiswaViewHolder(View itemView){
            super((itemView));
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
            TxtNpm = (TextView) itemView.findViewById(R.id.txt_npm_mahasiswa);
            TxtNohp = (TextView) itemView.findViewById(R.id.txt_nohp_mahasiswa);
        }
    }
}
