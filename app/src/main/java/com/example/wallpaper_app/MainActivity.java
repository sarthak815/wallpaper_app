package com.example.wallpaper_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

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
        new DownloadImageTask(photo).execute(url);
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap>{
        ImageView target;

        DownloadImageTask(ImageView image){
            target = image;
        }

        @Override
        protected Bitmap doInBackground(String... strings) {
            String myUrl = strings[0];
            Bitmap myBitmap = null;
            try{
                InputStream inputStream = new URL(myUrl).openStream();
                myBitmap = BitmapFactory.decodeStream(inputStream);
            } catch(Exception e){
                Log.e("Error", e.getMessage());
            }

            return myBitmap;
        }
        @Override
        protected void onPostExecute(Bitmap bitmap){
            super.onPostExecute(bitmap);
            target.setImageBitmap(bitmap);
        }
    }
}
