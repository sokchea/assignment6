package com.example.sokcheapeng.musicmash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class StudyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
        String songTitle[]={"Dark Horse","Roar","Last Friday Night"};
        ListAdapter song=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,songTitle);
        ListView sstlv=(ListView) findViewById(R.id.stlv);
        sstlv.setAdapter(song);
    }
}
