package com.example.wallpaper_app;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.wallpaper_app.ui.main.SectionsPagerAdapter;

public class WallpaperActivity extends AppCompatActivity {

    ImageView wallpaper;
    Button setwallpaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        wallpaper = findViewById(R.id.wallpaper);
        setwallpaper = findViewById(R.id.set_as_wallpaper);
    }
}