package com.example.android.braingame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button startButton;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    ImageView logo;
    TextView title;
    TextView sumTextView;
    ArrayList<Integer> answers = new ArrayList<Integer>();
    int locationOfCorrectAnswer;

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

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        Random randomNumber = new Random();

        int a = randomNumber.nextInt(21);
        int b = randomNumber.nextInt(21);

        sumTextView.setText(Integer.toString(a) + "+" + Integer.toString(b));
        locationOfCorrectAnswer = randomNumber.nextInt(4);
        int incorrectAnswer;
        for (int i = 0; i < 4; i++) {
            if (i == locationOfCorrectAnswer) {
                answers.add(a + b);

            } else {
                incorrectAnswer = randomNumber.nextInt(41);
                while (incorrectAnswer == a + b) {
                    incorrectAnswer = randomNumber.nextInt(41);
                }
                answers.add(incorrectAnswer);
            }
        }

        button0.setText(Integer.toString(answers.get(0)));
        button1.setText(Integer.toString(answers.get(1)));
        button2.setText(Integer.toString(answers.get(2)));
        button3.setText(Integer.toString(answers.get(3)));


    }
}
