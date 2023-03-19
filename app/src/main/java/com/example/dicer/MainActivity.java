package com.example.dicer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button roll;
    private TextView textView;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView2);
        textView2 = findViewById(R.id.secondDice);
        roll = findViewById(R.id.buttonRoll);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int value = random.nextInt(7-1)+1;
                textView.setText(Integer.toString(value));
                int value2 = random.nextInt(7-1)+1;
                textView2.setText(Integer.toString(value2));
            }
        });

    }
}