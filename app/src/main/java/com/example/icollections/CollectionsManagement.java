package com.example.icollections;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CollectionsManagement extends AppCompatActivity {
public static final String collectionName = "NAME";
public static final String collectionItems = "ITEMS";
public static final String collectionGoal = "GOAL";
private Button button;
private TextView nameText,itemsText, itemsGoal;
private String name, items, goal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections_management);


        //This code allows the user to go  to the create category page.
        button = findViewById(R.id.btnCreate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollectionsManagement.this,CreateCategory.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.viewButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemsText = findViewById(R.id.txtCollectionItems);
                Intent i = getIntent();
                items = i.getStringExtra(collectionItems);
                itemsText.setText(items);

                itemsGoal = findViewById(R.id.txtCollectionGoal);
                Intent intent = getIntent();
                goal = intent.getStringExtra(collectionGoal);
                itemsText.setText(goal);
            }
        });

        //This adds the collection name typed in from Create Category to this class
        nameText = findViewById(R.id.category1);
        Intent i = getIntent();
        name = i.getStringExtra(collectionName);
        nameText.setText(name);
    }
}