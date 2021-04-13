package com.example.boosttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.idlefish.flutterboost.FlutterBoost;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_1).setOnClickListener( v -> {
            FlutterBoost.instance().open("flutter_first", new HashMap<>());
        });
    }
}