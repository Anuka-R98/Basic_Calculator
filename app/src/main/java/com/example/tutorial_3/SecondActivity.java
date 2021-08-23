package com.example.tutorial_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText et_val3, et_val4;
    TextView tv_ans;

    String num1,num2;
    Double n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et_val3 = findViewById(R.id.et_3);
        et_val4 = findViewById(R.id.et_4);
        tv_ans = findViewById(R.id.tv_ANS);

        Intent intent = getIntent();

        //catch passing values by using references
        num1 = intent.getStringExtra("n1");
        num2 = intent.getStringExtra("n2");

        //display numbers
        et_val3.setText(num1);
        et_val4.setText(num2);

        //converting string values to integer values
        n1 = Double.parseDouble(num1);
        n2 = Double.parseDouble(num2);

    }

    public void add(View view){
        tv_ans.setText(num1 + "+" + num2 + "=" + (n1+n2));
    }
    public void sub(View view){
        tv_ans.setText(num1 + "-" + num2 + "=" + (n1-n2));
    }
    public void multi(View view){
        tv_ans.setText(num1 + "*" + num2 + "=" + (n1*n2));
    }
    public void devi(View view){
        tv_ans.setText(num1 + "/" + num2 + "=" + (n1/n2));
    }

}