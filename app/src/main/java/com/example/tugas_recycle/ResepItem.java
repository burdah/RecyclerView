package com.example.tugas_recycle;

public class ResepItem {
    private String mNama;
    private String mDeskripsi;
    private String mImage;

    public ResepItem(String nama,String deskripsi,String image){
        mNama=nama;
        mDeskripsi=deskripsi;
        mImage=image;
    }

    public String getmNama(){
        return mNama;
    }

    public String getmDeskripsi(){
        return mDeskripsi;
    }

    public String getmImage(){
        return mImage;
    }
}
