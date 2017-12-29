package com.example.android.braingame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button startButton;
    ImageView logo;
    TextView title;
    TextView sumTextView;


    public void start(View view) {
        startButton.setVisibility(View.INVISIBLE);
        logo.setVisibility(View.INVISIBLE);
        title.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton = (Button) findViewById(R.id.startButton);
        logo = (ImageView) findViewById(R.id.logo);
        title = (TextView) findViewById(R.id.title);
        sumTextView = (TextView) findViewById(R.id.sumTextView);
        Random randomNumber = new Random();

        int a = randomNumber.nextInt(21);
        int b = randomNumber.nextInt(21);

        sumTextView.setText(Integer.toString(a) + "+" + Integer.toString(b));














    }
}
