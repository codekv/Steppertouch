package com.example.steppertouch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import nl.dionsegijn.steppertouch.OnStepCallback;
import nl.dionsegijn.steppertouch.StepperTouch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StepperTouch stepperTouch=findViewById(R.id.StepperTouch);
        stepperTouch.setMinValue(0);
        stepperTouch.setMaxValue(10);
        stepperTouch.setSideTapEnabled(true);

        stepperTouch.addStepCallback(new OnStepCallback() {
            @Override
            public void onStep(int value, boolean positive) {
                Toast.makeText(getApplicationContext(), value +"", Toast.LENGTH_SHORT).show();
            }
        });
    }
}