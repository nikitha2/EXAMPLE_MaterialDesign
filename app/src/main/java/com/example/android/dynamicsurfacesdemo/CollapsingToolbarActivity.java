package com.example.android.dynamicsurfacesdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class CollapsingToolbarActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collapsingtoolbar_activity);

        CollapsingToolbarLayout ab = findViewById(R.id.collapsing_toolbar_layout);
        Toolbar app_bar = findViewById(R.id.app_bar);
        setSupportActionBar(app_bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ab.setTitle(getString(R.string.CollapsingToolbarexampleTitle));

    }


}