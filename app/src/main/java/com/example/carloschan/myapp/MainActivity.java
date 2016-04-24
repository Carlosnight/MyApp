package com.example.carloschan.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void spotifyClick(View view) {
        Button button_1 = (Button)findViewById(R.id.button1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "THIS IS SPOTIFY STREAMER", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void scoresClick(View view) {
        Button button_2 = (Button)findViewById(R.id.button2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "THIS IS SCORES APP", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void libraryClick(View view) {
        Button button_3 = (Button)findViewById(R.id.button3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "THIS IS LIBRARY APP", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void biggerClick(View view) {
        Button button_4 = (Button)findViewById(R.id.button4);
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "THIS IS BUILD IT BIGGER", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void baconClick(View view) {
        Button button_5 = (Button)findViewById(R.id.button5);
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "THIS IS BACON READER", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void capstoneClick(View view) {
        Button button_6 = (Button)findViewById(R.id.button6);
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "THIS IS CAPSTONE", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
