package com.example.jatctimeclock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect button
        // ..get the button
        Button btn_in = (Button) findViewById(R.id.button_clock_in);
        // ..set what happens when the user clicks
        btn_in.setOnClickListener();
    }
}
