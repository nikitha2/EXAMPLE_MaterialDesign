package com.example.android.dynamicsurfacesdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


// contains a recycler view. on click on an Item user navigates to MainActivity
public class MainActivity extends AppCompatActivity implements MainAdapter.ListItemClickListener {
    RecyclerView recyclerView;
    MainAdapter mainAdapter;
    ArrayList<String> data=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateData();
        recyclerView=(RecyclerView)  findViewById(R.id.recycleview_mainActivity);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainAdapter = new MainAdapter(this,data,this);
        recyclerView.setAdapter(mainAdapter);
    }

    private void populateData() {
        data.add(new String("list item 1"));
        data.add(new String("list item 2"));
        data.add(new String("list item 3"));
        data.add(new String("list item 4"));
        data.add(new String("list item 5"));
        data.add(new String("list item 6"));
        data.add(new String("list item 7"));
        data.add(new String("list item 8"));
        data.add(new String("list item 9"));
        data.add(new String("list item 10"));
    }

    @Override
    public void onListItemClick(int position) {
        Intent intent=new Intent(this,CollapsingToolbarActivity.class);
        startActivity(intent);
    }
}