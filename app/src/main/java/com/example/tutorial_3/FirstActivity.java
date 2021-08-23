package com.example.tutorial_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    //object creation
    EditText et_val1, et_val2;
    Button btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //assign ui component ids  with relevant objects
        btn_ok = findViewById(R.id.btn_Add);
        et_val1 = findViewById(R.id.et_3);
        et_val2 = findViewById(R.id.et_2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btn_ok.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View view) {

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

                //get assigned values by converting to string values
                String num1 = et_val1.getText().toString();
                String num2 = et_val2.getText().toString();

                //passing values to next activity
                //reference and variable
                intent.putExtra("n1", num1);
                intent.putExtra("n2", num2);

                //The context to use. Usually your Application or Activity object
                Context context = getApplicationContext();

                //Display string
                CharSequence message = "Passing values...Please wait!";

                //How long the toast message will lasts
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                /*
                //custom toast with image
                //Creating the LayoutInflater instance
                LayoutInflater layInf = getLayoutInflater();
                //Getting the View object as defined in the custom_toast.xml file
                View layout = layInf.inflate(R.layout.custom_toast, findViewById(R.id.et_toast));

                //Creating the Toast object
                Toast toast = new Toast(FirstActivity.this);
                //How long the toast message will lasts
                toast.setDuration(Toast.LENGTH_SHORT);
                //setting the position of toast
                toast.setGravity(Gravity.BOTTOM,0,0);
                //setting the view of custom toast layout
                toast.setView(layout);
                toast.show();*/

                startActivity(intent);

            }
        });
    }
}

