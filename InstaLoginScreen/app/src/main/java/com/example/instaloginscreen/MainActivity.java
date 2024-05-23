package com.example.instaloginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText inputUsername;
    EditText inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set the layout for this activity

        btnLogin = (Button)findViewById(R.id.loginbutton);
        inputUsername = (EditText) findViewById(R.id.input_username);
        inputPassword = (EditText) findViewById(R.id.input_password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = inputUsername.getText().toString();
                String passWord = inputPassword.getText().toString();

                Login(userName, passWord);


            }
        });
    }

    public void Login(String userName, String passWord) {
        if(userName.equals("admin") && passWord.equals("123456")) {
            Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

            System.out.println(userName + passWord);

            Intent intent = new Intent(MainActivity.this, Home.class);
            intent.putExtra("USER_NAME", userName);
            startActivity(intent);
            finish(); // Close LoginActivity
        } else {

            Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        inputUsername.setText(""); // Clear the field when the activity is resumed
        inputPassword.setText("");

    }

}
