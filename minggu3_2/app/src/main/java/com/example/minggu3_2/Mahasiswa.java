package com.example.minggu3_2;

public class Mahasiswa {
    private String nama;
    private String npm;
    private String nohp;

    public  Mahasiswa(String nama, String npm, String nohp){
        this.nama = nama;
        this.nohp = nohp;
        this.npm = npm;
    }
    public  String getNama(){
        return  nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public  String getNpm(){
        return  npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }
    public String getNohp(){
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}
