package com.example.linearr;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare variables
    private EditText num1, num2;
    private Button btnAdd;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link XML components with Java
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnAdd = findViewById(R.id.btnAdd);
        result = findViewById(R.id.result);

        // Button click event
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n1 = num1.getText().toString().trim();
                String n2 = num2.getText().toString().trim();

                // Check input
                if (!n1.isEmpty() && !n2.isEmpty()) {
                    try {
                        int a = Integer.parseInt(n1);
                        int b = Integer.parseInt(n2);
                        int sum = a + b;

                        result.setText("Result: " + sum);
                    } catch (NumberFormatException e) {
                        result.setText("Invalid input");
                    }
                } else {
                    result.setText("Please enter both numbers");
                }
            }
        });
    }
}