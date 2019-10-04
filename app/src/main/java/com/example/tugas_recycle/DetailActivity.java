package com.example.tugas_recycle;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_resep);
        Intent intent=getIntent();
        String imageUrl=intent.getStringExtra("image");
        TextView namamakanann=findViewById(R.id.namamakanann);
        TextView deskripsimakanan=findViewById(R.id.deskripsimakanan);
        TextView amount=findViewById(R.id.amount);
        ImageView gambar=findViewById(R.id.gambarmakanan);
        namamakanann.setText(getIntent().getStringExtra("nama"));
        deskripsimakanan.setText(getIntent().getStringExtra("deskripsi"));
        Picasso.with(this).load(imageUrl).into(gambar);

    }

}

