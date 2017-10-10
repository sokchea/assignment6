package com.example.sokcheapeng.musicmash;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class SleepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);
        String songTitle[]={"Dark Horse","Roar","Last Friday Night"};
        ListAdapter song=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,songTitle);
        ListView slv=(ListView) findViewById(R.id.slv);
        slv.setAdapter(song);

            }

    }


