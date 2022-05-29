package com.example.icollections;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private Button button;
    private String uName = "user";
    private String password = "pass";
    private EditText username, userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.txtUsername);
        userPassword = findViewById(R.id.txtPassword);
        button = findViewById(R.id.btnSubmit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (username.getText().toString().equals(uName) && userPassword.getText().toString().equals(password)) {
                    Intent intent = new Intent(Login.this, MainMenu.class);
                    startActivity(intent);
                    Toast.makeText(Login.this, "Successfully Logged In", Toast.LENGTH_SHORT).show();
                } else {
                    userLogin();

                }
            }

        });


        //This code allows the user to go back to the the login page.
        button = findViewById(R.id.btnCancel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void userLogin(){
        if(TextUtils.isEmpty(username.getText()) || TextUtils.isEmpty(userPassword.getText())){
            Toast.makeText(Login.this, "Empty,Please Enter Your Credentials", Toast.LENGTH_SHORT).show();
        }
        else if(username.getText().equals(uName)){
            //Check the password
            if(userPassword.getText().equals(password)){
                Toast.makeText(Login.this, "Successfully Logged In", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(Login.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(Login.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
        }
    }

}
