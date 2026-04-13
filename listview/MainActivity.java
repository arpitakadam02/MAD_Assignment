package com.example.listviewlayout;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] names = {"Arpita", "Riya", "Sneha", "Neha", "Simran", "Pooja"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Access ListView from XML
        listView = findViewById(R.id.listView);

        // Create ArrayAdapter to show array in ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, // built-in layout for list item
                names
        );

        // Set adapter to ListView
        listView.setAdapter(adapter);
    }
}