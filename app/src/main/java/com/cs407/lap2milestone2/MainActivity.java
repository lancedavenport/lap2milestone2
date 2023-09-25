package com.cs407.lap2milestone2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void goToActivity(String s) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    public void addition(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int a = Integer.parseInt(myTextField1.getText().toString());
        int b = Integer.parseInt(myTextField2.getText().toString());
        int sum = a + b;

        goToActivity(Integer.toString(sum));

    }

    public void subtraction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int a = Integer.parseInt(myTextField1.getText().toString());
        int b = Integer.parseInt(myTextField2.getText().toString());
        int sum = a - b;
        goToActivity(Integer.toString(sum));
    }

    public void multiplication(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int a = Integer.parseInt(myTextField1.getText().toString());
        int b = Integer.parseInt(myTextField2.getText().toString());
        int sum = a * b;
        goToActivity(Integer.toString(sum));
    }
    public void division(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int a = Integer.parseInt(myTextField1.getText().toString());
        int b = Integer.parseInt(myTextField2.getText().toString());
        if (b == 0){
            goToActivity("Cannot divide by zero");
        } else{
            int sum = a / b;
            goToActivity(Integer.toString(sum));
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}