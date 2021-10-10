package com.example.a0310;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private static final String COUNT = "COUNT";

    private Counter counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        if (savedInstanceState == null) {
            counter = new Counter();
        } else {
            counter = savedInstanceState.getParcelable(COUNT);
        }


        TextView textCounter1 = findViewById(R.id.button1);
        textCounter1.append(String.valueOf(counter.getValue()));


        findViewById(R.id.button0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("0");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("1");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("2");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("3");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("4");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("5");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("6");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("7");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("8");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("9");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("+");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button_min).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("-");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button_div).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("%");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button_eq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("=");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button_point).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue(".");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
        findViewById(R.id.button_mul).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setValue("X");
                textCounter1.append(String.valueOf(counter.getValue()));
            }
        });
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putParcelable(COUNT, counter);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}