package com.example.tugas_recycle;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<ResepItem> mResepitem;

    public ResepAdapter(Context context,  ArrayList<ResepItem> resep){
        mContext=context;
        mResepitem=resep;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.item,parent,false);
        return new ViewHolder(v);
    }


    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        ResepItem itembaru=mResepitem.get(position);
        final String image=itembaru.getmImage();
        final String nama=itembaru.getmNama();
        final String deskripsi=itembaru.getmDeskripsi();
        holder.textJudul.setText(nama);
        holder.textDeskripsi.setText(deskripsi);
        Picasso.with(mContext).load(image).fit().centerInside();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,DetailActivity.class);
                ResepItem clickitem=mResepitem.get(position);
                intent.putExtra("nama",clickitem.getmNama());
                intent.putExtra("deskripsi",clickitem.getmDeskripsi());
                intent.putExtra("image",clickitem.getmImage());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mResepitem.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textJudul,textDeskripsi;
        String amount;
        public ViewHolder(View itemView) {
            super(itemView);
            textJudul = itemView.findViewById(R.id.judul);
            textDeskripsi = itemView.findViewById(R.id.deskripsi);
        }
    }
}
