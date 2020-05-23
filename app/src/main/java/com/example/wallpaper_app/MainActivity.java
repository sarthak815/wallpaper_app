package com.example.wallpaper_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        photo = findViewById(R.id.photo);

        String url = "https://c4.wallpaperflare.com/wallpaper/246/739/689/digital-digital-art-artwork-illustration-abstract-hd-wallpaper-thumb.jpg";

        Picasso.get().load(url).into(photo);
    }


}
