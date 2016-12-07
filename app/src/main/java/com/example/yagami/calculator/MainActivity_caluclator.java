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
    private Stack<String> operator = new Stack<>();
    private Stack<String> operand = new Stack<>();
    private Stack<String> expression = new Stack<>();
    private Stack<Integer> value = new Stack<>();
    private Stack<Character> ops = new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_buttons);
    }
}
