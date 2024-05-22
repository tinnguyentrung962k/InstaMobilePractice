package com.example.instaloginscreen;

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
    }
    public void Login (View view){
        String userName = inputUsername.getText().toString();
        String passWord = inputPassword.getText().toString();
        if(userName.equals("admin") && passWord.equals("123456"))
        {
            Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }
}
