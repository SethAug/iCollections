package com.example.icollections;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    //This method will be called when the button is clicked, and will return to previous page
    public void btnClick(View view) {
        Button btnCancel = findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainPage();
            }
        });
    }
    public void openMainPage(){
        Intent intent1 = new Intent(this,MainActivity.class);
        startActivity(intent1);
    }

    //By pressing submit, it takes you to the Main Menu
    public void btnNewClick(View view) {
        Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainMenu();
            }
        });
    }
    public void openMainMenu(){
        Intent intent2 = new Intent(this,MainMenu.class);
        startActivity(intent2);
    }
}