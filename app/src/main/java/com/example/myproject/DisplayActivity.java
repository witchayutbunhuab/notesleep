package com.example.myproject;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    private TextView textViewDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textViewDisplay = findViewById(R.id.textViewDisplay);

        // รับข้อมูลจาก Intent
        String name = getIntent().getStringExtra("name");
        String sleepDate = getIntent().getStringExtra("sleepDate");
        String sleepTime = getIntent().getStringExtra("sleepTime");
        String wakeDate = getIntent().getStringExtra("wakeDate");
        String wakeTime = getIntent().getStringExtra("wakeTime");

        // แสดงข้อมูล
        String displayText = "ชื่อ: " + name + "\nวันนอน: " + sleepDate + " เวลานอน: " + sleepTime +
                "\nวันตื่น: " + wakeDate + " เวลาตื่น: " + wakeTime;

        textViewDisplay.setText(displayText);
    }
}

