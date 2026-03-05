package com.example.myapplication;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText textInput1;
    private EditText textInput2;

    private TextView textOutput;

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

        textInput1 = findViewById(R.id.inputFirstNumber);
        textInput2 = findViewById(R.id.inputSecondNumber);
        textOutput = findViewById(R.id.textResult);
    }
    public void sumValues(View view){
        try {
            int number1 = Integer.parseInt(textInput1.getText().toString());
            int number2 = Integer.parseInt(textInput2.getText().toString());
            //conversion to integer from text through string
            int sum = Integer.sum(number1,number2);
            System.out.println(sum);
            String plusAnswer = String.valueOf(sum);
            //conversion from a number to a string
            textOutput.setText(plusAnswer);
        }
        catch (NumberFormatException e){
            return;
        }
    }

    public void minusValues(View view){
        try {
            int number1 = Integer.parseInt(textInput1.getText().toString());
            int number2 = Integer.parseInt(textInput2.getText().toString());
            //conversion to integer from text through string
            int minus = Math.subtractExact(number1, number2);
            System.out.println(minus);
            String minusAnswer = String.valueOf(minus);
            //conversion from a number to a string
            textOutput.setText(minusAnswer);
        }
        catch (NumberFormatException e){
            return;
        }
    }

    public void multiplyValues(View view){
        try {
            int number1 = Integer.parseInt(textInput1.getText().toString());
            int number2 = Integer.parseInt(textInput2.getText().toString());
            //conversion to integer from text through string
            int product = Math.multiplyExact(number1, number2);
            System.out.println(product);
            String multiAnswer = String.valueOf(product);
            //conversion from a number to a string
            textOutput.setText(multiAnswer);
        }
        catch (NumberFormatException e){
            return;
        }
    }

    public void divideValues(View view){
        try {
            float number1 = Integer.parseInt(textInput1.getText().toString());
            float number2 = Integer.parseInt(textInput2.getText().toString());
            //conversion to integer from text through string
            float difference = number1 / number2;
            System.out.println(difference);
            String divisionAnswer = String.format("%.2f", difference);
            //conversion from a number to a string
            textOutput.setText(divisionAnswer);
        }
        catch (NumberFormatException e){
            return;
        }
    }
}