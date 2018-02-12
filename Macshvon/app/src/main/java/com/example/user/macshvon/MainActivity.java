package com.example.user.macshvon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button btn0,btn1,btn2,btn3,btn4,
            btn5,btn6,btn7,btn8,btn9,
            btnPlus,btnMinus,btnMulti,
            btnEquals,btnDiv,btnClear;
    private TextView tvUp;
    private char op;

    private double LastAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnEquals = (Button) findViewById(R.id.btnEquals);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnClear = (Button) findViewById(R.id.btnClear);
        tvUp = (TextView) findViewById(R.id.tvUp);
        op = '?';
        tvUp.setText(0);
        LastAns = 0;
    }

    public void AllClear (View view) {
        tvUp.setText(0);
        op = '?';
        Toast.makeText(getApplicationContext(), "Cleared.", Toast.LENGTH_SHORT).show();
    }

    public void click0 (View view) {
        if(op != '?') {
            double LAns = Double.parseDouble(tvUp.getText().toString());
            LastAns = LAns;
            tvUp.setText(String.valueOf(0));
        }
        else {
            double x = Double.parseDouble(tvUp.getText().toString());
            x = x*10;
            tvUp.setText(String.valueOf(x));
        }
    }
    public void click1 (View view) {
        if(op != '?') {
            double LAns = Double.parseDouble(tvUp.getText().toString());
            LastAns = LAns;
            tvUp.setText(String.valueOf(1));
        }
        else {
            double x = Double.parseDouble(tvUp.getText().toString());
            x = x*10 + 1;
            tvUp.setText(String.valueOf(x));
        }
    }
    public void click2 (View view) {
        if(op != '?') {
            double LAns = Double.parseDouble(tvUp.getText().toString());
            LastAns = LAns;
            tvUp.setText(String.valueOf(2));
        }
        else {
            double x = Double.parseDouble(tvUp.getText().toString());
            x = x*10 + 2;
            tvUp.setText(String.valueOf(x));
        }
    }
    public void click3 (View view) {
        if(op != '?') {
            double LAns = Double.parseDouble(tvUp.getText().toString());
            LastAns = LAns;
            tvUp.setText(String.valueOf(3));
        }
        else {
            double x = Double.parseDouble(tvUp.getText().toString());
            x = x*10 + 3;
            tvUp.setText(String.valueOf(x));
        }
    }
    public void click4 (View view) {
        if(op != '?') {
            double LAns = Double.parseDouble(tvUp.getText().toString());
            LastAns = LAns;
            tvUp.setText(String.valueOf(4));
        }
        else {
            double x = Double.parseDouble(tvUp.getText().toString());
            x = x*10 + 4;
            tvUp.setText(String.valueOf(x));
        }
    }
    public void click5 (View view) {
        if(op != '?') {
            double LAns = Double.parseDouble(tvUp.getText().toString());
            LastAns = LAns;
            tvUp.setText(String.valueOf(5));
        }
        else {
            double x = Double.parseDouble(tvUp.getText().toString());
            x = x*10 + 5;
            tvUp.setText(String.valueOf(x));
        }
    }
    public void click6 (View view) {
        if(op != '?') {
            double LAns = Double.parseDouble(tvUp.getText().toString());
            LastAns = LAns;
            tvUp.setText(String.valueOf(6));
        }
        else {
            double x = Double.parseDouble(tvUp.getText().toString());
            x = x*10 + 6;
            tvUp.setText(String.valueOf(x));
        }
    }
    public void click7 (View view) {
        if(op != '?') {
            double LAns = Double.parseDouble(tvUp.getText().toString());
            LastAns = LAns;
            tvUp.setText(String.valueOf(7));
        }
        else {
            double x = Double.parseDouble(tvUp.getText().toString());
            x = x*10 + 7;
            tvUp.setText(String.valueOf(x));
        }
    }
    public void click8 (View view) {
        if(op != '?') {
            double LAns = Double.parseDouble(tvUp.getText().toString());
            LastAns = LAns;
            tvUp.setText(String.valueOf(8));
        }
        else {
            double x = Double.parseDouble(tvUp.getText().toString());
            x = x*10 + 8;
            tvUp.setText(String.valueOf(x));
        }
    }
    public void click9 (View view) {
        if(op != '?') {
            double LAns = Double.parseDouble(tvUp.getText().toString());
            LastAns = LAns;
            tvUp.setText(String.valueOf(9));
        }
        else {
            double x = Double.parseDouble(tvUp.getText().toString());
            x = x*10 + 9;
            tvUp.setText(String.valueOf(x));
        }
    }
    public void clickPlus (View view) {
        op = '+';
    }
    public void clickMinus (View view) {
        op = '-';
    }
    public void clickMulti (View view) {
        op = '*';
    }
    public void clickDiv (View view) {
        op = '/';
    }
    public void clickEquals (View view) {
        if(op == '+') {
            double Answer = LastAns + Double.parseDouble(tvUp.getText().toString());
            tvUp.setText(String.valueOf(Answer));
        }
        if(op == '-') {
            double Answer = LastAns - Double.parseDouble(tvUp.getText().toString());
            tvUp.setText(String.valueOf(Answer));
        }
        if(op == '*') {
            double Answer = LastAns * Double.parseDouble(tvUp.getText().toString());
            tvUp.setText(String.valueOf(Answer));
        }
        if(op == '/') {
            double Answer = LastAns / Double.parseDouble(tvUp.getText().toString());
            tvUp.setText(String.valueOf(Answer));
        }
        op = '?';
        LastAns = 0;
    }
}
