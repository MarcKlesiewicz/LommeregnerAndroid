package com.example.android.lommeregner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber, secondNumber;
    TextView result;
    Button add, substract, multiply, divide;

    float resultNum;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);

        firstNumber = (EditText) findViewById(R.id.firstNumber);
        secondNumber =(EditText) findViewById(R.id.secondNumber);

        add = (Button) findViewById(R.id.add);
        substract = (Button) findViewById(R.id.substract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(firstNumber.getText().toString());
                num2 = Integer.parseInt(secondNumber.getText().toString());
                resultNum = num1 + num2;
                result.setText(String.valueOf(resultNum));
            }
        });

        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(firstNumber.getText().toString());
                num2 = Integer.parseInt(secondNumber.getText().toString());
                resultNum = num1 - num2;
                result.setText(String.valueOf(resultNum));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(firstNumber.getText().toString());
                num2 = Integer.parseInt(secondNumber.getText().toString());
                resultNum = num1 / num2;
                result.setText(String.valueOf(resultNum));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(firstNumber.getText().toString());
                num2 = Integer.parseInt(secondNumber.getText().toString());
                resultNum = num1 * num2;
                result.setText(String.valueOf(resultNum));
            }
        });

    }


}
