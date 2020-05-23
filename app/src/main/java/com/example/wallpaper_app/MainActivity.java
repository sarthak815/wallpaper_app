package com.example.wallpaper_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ImageView photo;
    RecyclerView wallpaperlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wallpaperlist = findViewById(R.id.wallpaperlist);

        String url = "https://c4.wallpaperflare.com/wallpaper/246/739/689/digital-digital-art-artwork-illustration-abstract-hd-wallpaper-thumb.jpg";

        String[] urls = {url, url, url, url, url};

        LinearLayoutManager linearLayoutManager  = new LinearLayoutManager(MainActivity.this);
        wallpaperlist.setLayoutManager(linearLayoutManager);

        imageRecyclerViewAdapter adapter = new imageRecyclerViewAdapter(urls, MainActivity.this);
        wallpaperlist.setAdapter(adapter);
    }


}
