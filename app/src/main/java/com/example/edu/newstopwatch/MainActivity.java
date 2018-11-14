package com.example.edu.newstopwatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnstart;
    TextView textViewThread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstart = findViewById(R.id.btnstart);
        btnstart.setOnClickListener(this);
        textViewThread = findViewById(R.id.textViewThread);

    }

    @Override
    public void onClick(View v) {
        final String TAG = "Error ThreadActivity Tag";
        long endTime = System.currentTimeMillis() + 1*5000;
        Log.i(TAG,"Thread running!");
        while (System.currentTimeMillis() < endTime){
            synchronized (this){
                Log.i(TAG,"Thread running!");
                textViewThread.setText(String.valueOf(System.currentTimeMillis()));
            }
        }

    }
}
