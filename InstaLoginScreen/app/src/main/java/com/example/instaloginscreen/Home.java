package com.example.instaloginscreen;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class Home extends AppCompatActivity {
    private TextView textViewWelcome;
    private Button buttonClose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        textViewWelcome = findViewById(R.id.textViewWelcome);
        buttonClose = findViewById(R.id.buttonClose);

        // Get the name from the Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("USER_NAME");
        textViewWelcome.setText("Welcome, " + name);

        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Close the application
            }
        });
    }
}