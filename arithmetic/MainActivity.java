package com.example.arithmetic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button add, sub, mul, div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        add = (Button) findViewById(R.id.btnAdd);
        sub = (Button) findViewById(R.id.btnSub);
        mul = (Button) findViewById(R.id.btnMul);
        div = (Button) findViewById(R.id.btnDiv);

        result = (TextView) findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculate('+');
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculate('-');
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculate('*');
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculate('/');
            }
        });
    }

    private void calculate(char operator) {

        String n1Text = num1.getText().toString();
        String n2Text = num2.getText().toString();

        if (n1Text.equals("") || n2Text.equals("")) {
            result.setText("Enter both numbers");
            return;
        }

        double n1 = Double.parseDouble(n1Text);
        double n2 = Double.parseDouble(n2Text);
        double res = 0;

        switch (operator) {
            case '+':
                res = n1 + n2;
                break;

            case '-':
                res = n1 - n2;
                break;

            case '*':
                res = n1 * n2;
                break;

            case '/':
                if (n2 == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }
                res = n1 / n2;
                break;
        }

        result.setText("Result: " + res);
    }
}