package com.example.yagami.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;

import java.util.Stack;
import java.util.StringTokenizer;

public class MainActivity_caluclator extends AppCompatActivity {

    private EditText mEditText;
    private Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttondot,buttonadd,buttonmultiply;
    private Button buttonsubtract,buttondivide,buttonresult,buttonreset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_buttons);
        initilize();
    }

    private void initilize() {
        mEditText = (EditText)findViewById(R.id.tv_editText);
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttondivide = (Button)findViewById(R.id.buttondivide);
        buttonmultiply = (Button)findViewById(R.id.buttonmultiply);
        buttonadd = (Button)findViewById(R.id.buttonadd);
        buttonsubtract = (Button)findViewById(R.id.buttonsubtract);
        buttonresult = (Button)findViewById(R.id.buttonresult);
        buttondot = (Button)findViewById(R.id.button_);
        buttonreset = (Button)findViewById(R.id.reset);
    }
}
