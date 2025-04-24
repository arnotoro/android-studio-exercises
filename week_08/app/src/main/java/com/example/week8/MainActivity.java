package com.example.week8;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText inputNumber1;
    private EditText inputNumber2;
    private static final DecimalFormat df = new DecimalFormat("0.00");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void displayResult(View view, float result) {
        TextView resultView = findViewById(R.id.textSeeResult);
        resultView.setText(df.format(result));
    }

    public void add(View view) {
        inputNumber1 = findViewById(R.id.editFirstNumber);
        inputNumber2 = findViewById(R.id.editSecondNumber);

        float firstNumber = Float.parseFloat(inputNumber1.getText().toString());
        float secondNumber = Float.parseFloat(inputNumber2.getText().toString());
        Log.d("MainActivity", "add: " + firstNumber + " " + secondNumber + " " + (firstNumber + secondNumber) + " " + view);
        float result = firstNumber + secondNumber;
        displayResult(view, result);
    }

    public void subtract(View view) {
        inputNumber1 = findViewById(R.id.editFirstNumber);
        inputNumber2 = findViewById(R.id.editSecondNumber);

        float firstNumber = Float.parseFloat(inputNumber1.getText().toString());
        float secondNumber = Float.parseFloat(inputNumber2.getText().toString());

        displayResult(view, firstNumber - secondNumber);
    }

    public void multiply(View view) {
        inputNumber1 = findViewById(R.id.editFirstNumber);
        inputNumber2 = findViewById(R.id.editSecondNumber);

        float firstNumber = Float.parseFloat(inputNumber1.getText().toString());
        float secondNumber = Float.parseFloat(inputNumber2.getText().toString());

        displayResult(view, firstNumber * secondNumber);
    }

    public void divide(View view) {
        inputNumber1 = findViewById(R.id.editFirstNumber);
        inputNumber2 = findViewById(R.id.editSecondNumber);

        float firstNumber = Float.parseFloat(inputNumber1.getText().toString());
        float secondNumber = Float.parseFloat(inputNumber2.getText().toString());

        displayResult(view, firstNumber / secondNumber);
    }

}