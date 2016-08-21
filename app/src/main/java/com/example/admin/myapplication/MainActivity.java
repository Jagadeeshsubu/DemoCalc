package com.example.admin.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button sum;
    Button sub;
    Button mul;
    Button div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum = (Button) findViewById(R.id.button);
        sub = (Button) findViewById(R.id.button2);
        mul = (Button) findViewById(R.id.button3);
        div = (Button) findViewById(R.id.button4);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1 = (EditText) findViewById(R.id.editText);
                EditText e2 = (EditText) findViewById(R.id.editText2);
                TextView t = (TextView) findViewById(R.id.textView);
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 =Integer.parseInt(e2.getText().toString());
                int sum = n1 + n2;
                t.setText(Integer.toString(sum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText e1 = (EditText) findViewById(R.id.editText);
                EditText e2 = (EditText) findViewById(R.id.editText2);
                TextView t = (TextView) findViewById(R.id.textView);
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 =Integer.parseInt(e2.getText().toString());
                int sub = n1-n2;
                t.setText(Integer.toString(sub));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1 = (EditText) findViewById(R.id.editText);
                EditText e2 = (EditText) findViewById(R.id.editText2);
                TextView t = (TextView) findViewById(R.id.textView);
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 =Integer.parseInt(e2.getText().toString());
                int mul = n1*n2;
                t.setText(Integer.toString(mul));
            }
        }); div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1 = (EditText) findViewById(R.id.editText);
                EditText e2 = (EditText) findViewById(R.id.editText2);
                TextView t = (TextView) findViewById(R.id.textView);
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 =Integer.parseInt(e2.getText().toString());
                int div = n1/n2;
                t.setText(Integer.toString(div));
            }
        });



    }
}