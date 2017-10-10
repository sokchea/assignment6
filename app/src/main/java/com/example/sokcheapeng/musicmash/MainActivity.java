package com.example.sokcheapeng.musicmash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //launch bus activity
        TextView bus=(TextView) findViewById(R.id.bus);
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent busIntent=new Intent(MainActivity.this,BusActivity.class);
                startActivity(busIntent);
            }
        });

        //launch gym activity
        TextView gym=(TextView) findViewById(R.id.gym);
        gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gymIntent=new Intent(MainActivity.this,GymActivity.class);
                startActivity(gymIntent);
            }
        });

        //launch sleep activity
        TextView sleep=(TextView) findViewById(R.id.sleep);
        sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sleepIntent=new Intent(MainActivity.this,SleepActivity.class);
                startActivity(sleepIntent);
            }
        });

        //launch study activity
        TextView study=(TextView) findViewById(R.id.study);
        study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent studyIntent=new Intent(MainActivity.this,StudyActivity.class);
                startActivity(studyIntent);
            }
        });
    }
}
