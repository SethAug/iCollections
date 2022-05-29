package com.example.icollections;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CreateCategory extends AppCompatActivity {
private Button button;
private EditText name, items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_category);

        //This creates a collection based on all the information the user entered
        name = findViewById(R.id.txtCollection);
        items = findViewById(R.id.txtItemsInCollection);

        //This code allows the user to go back to the the collections management page.
        button = findViewById(R.id.btnBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateCategory.this,CollectionsManagement.class);
                startActivity(intent);
            }
        });

        name = findViewById(R.id.txtCollection);
        items = findViewById(R.id.txtItemsInCollection);



        //This code allows the user to add collections to the the collections management page.
        button = findViewById(R.id.btnAdd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
    }
    public void sendData(){
        String collectionName = name.getText().toString();
        String itemNumber = items.getText().toString();
        //This will be used for the items list @Nirann

        Intent i = new Intent(CreateCategory.this,CollectionsManagement.class);
        i.putExtra(CollectionsManagement.collectionName,collectionName);
        startActivity(i);


    }
}