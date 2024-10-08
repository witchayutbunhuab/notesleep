package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextSleepDate, editTextSleepTime;
    private EditText editTextWakeDate, editTextWakeTime;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextSleepDate = findViewById(R.id.editTextSleepDate);
        editTextSleepTime = findViewById(R.id.editTextSleepTime);
        editTextWakeDate = findViewById(R.id.editTextWakeDate);
        editTextWakeTime = findViewById(R.id.editTextWakeTime);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        // ปุ่มส่งข้อมูล
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveSleepData();
            }
        });
    }

    private void saveSleepData() {
        // รับข้อมูลจาก EditText6
        String name = editTextName.getText().toString();
        String sleepDate = editTextSleepDate.getText().toString();
        String sleepTime = editTextSleepTime.getText().toString();
        String wakeDate = editTextWakeDate.getText().toString();
        String wakeTime = editTextWakeTime.getText().toString();

        // ส่งข้อมูลผ่าน Intent ไปยัง DisplayActivity
        Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("sleepDate", sleepDate);
        intent.putExtra("sleepTime", sleepTime);
        intent.putExtra("wakeDate", wakeDate);
        intent.putExtra("wakeTime", wakeTime);
        startActivity(intent);
    }
}
