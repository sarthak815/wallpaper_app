package com.example.wallpaper_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class imageRecyclerViewAdapter extends RecyclerView.Adapter<imageRecyclerViewAdapter.ViewHolder> {

    String[] urls;
    Context context;
    ViewHolder holder;

    imageRecyclerViewAdapter(String[] urls, Context context){
        this.urls = urls;
        this.context = context;
    }

    @NonNull
    @Override
    public imageRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardview, parent, false);
        holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull imageRecyclerViewAdapter.ViewHolder holder, int position) {
        Picasso.get().load(urls[position]).into(holder.photo);
    }

    @Override
    public int getItemCount() {
        return urls.length;
    }
    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView photo;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            photo = itemView.findViewById(R.id.photo);
        }
    }
}
