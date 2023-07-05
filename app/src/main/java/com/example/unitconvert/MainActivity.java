package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button submit;
    private EditText unitInput;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.result);
        unitInput = findViewById(R.id.unitInput);
        submit = findViewById(R.id.submit);

//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String text = unitInput.getText().toString();
//                if(text.isEmpty()){
//                    Toast.makeText(MainActivity.this, "Please enter value to convert", Toast.LENGTH_SHORT).show();
//                } else {
//                    int kg = Integer.parseInt(text);
//                    double grams = 1000 * kg;
//                    textView.setText("The corresponding gram value is " + grams);
//                }
//
//            }
//        });
    }
    //method
    public void calculate(View view){
        String text = unitInput.getText().toString();
        if(text.isEmpty()){
            Toast.makeText(MainActivity.this, "Please enter value to convert", Toast.LENGTH_SHORT).show();
        } else {
            int kg = Integer.parseInt(text);
            double grams = 1000 * kg;
            textView.setText("The corresponding gram value is " + grams);
            unitInput.setText("");
        }
    }
}