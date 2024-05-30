package com.example.a02_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int clickSum = 0;
    private TextView tvEat;
    private Button giveEat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvEat = findViewById(R.id.isEatNum);
        giveEat = findViewById(R.id.btnEat);

    }

    public void onClick (View view)
    {
        tvEat.setText("Накормленность:   " + clickSum);
        clickSum += 1;
    }
}