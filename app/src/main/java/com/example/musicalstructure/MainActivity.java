package com.example.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mButtonDiscoverMusic, mButtonMyLibarary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find Ui
        mButtonDiscoverMusic = (Button) findViewById(R.id.discover_music);
        mButtonMyLibarary = (Button) findViewById(R.id.my_libarary);

        //Handel Clicks
        mButtonDiscoverMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DiscoverMusic.class);
                startActivity(intent);
            }
        });

        mButtonMyLibarary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MyLibararyActivity.class);
                startActivity(intent);
            }
        });
    }
}
