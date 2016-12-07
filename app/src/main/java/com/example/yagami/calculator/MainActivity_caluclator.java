package com.example.yagami.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity_caluclator extends AppCompatActivity {

    private TextView mEditText;
    private Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttondot,buttonadd,buttonmultiply;
    private Button buttonsubtract,buttondivide,buttonresult,buttonreset,buttonForLeftBracket,buttonForRightBracket;
    private Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_caluclator);
        buttonStart = (Button)findViewById(R.id.starter);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.calculator_buttons);
                initilize();
                listenersforButtons();
            }
        });
    }

    private void listenersforButtons() {
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(button0.getText());
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(button1.getText());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(button2.getText());
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(button3.getText());
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(button4.getText());
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(button5.getText());
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(button6.getText());
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(button7.getText());
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(button8.getText());
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(button9.getText());
            }
        });
        buttonsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(buttonsubtract.getText());
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(buttonadd.getText());
            }
        });
        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(buttondivide.getText());
            }
        });
        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(buttonmultiply.getText());
            }
        });
        buttonForLeftBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(buttonForLeftBracket.getText());
            }
        });
        buttonForRightBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText.append(buttonForRightBracket.getText());
            }
        });
        buttonresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    evaluateResult();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void evaluateResult() throws InterruptedException {
        String txt = mEditText.getText().toString();
        double result;
        Expression expression = new ExpressionBuilder(txt).build();
        try {
            result = expression.evaluate();
            mEditText.setText(Double.toString(result));
        }
        catch (ArithmeticException e)
        {
            mEditText.setText(R.string.error);
        }
        catch (IllegalArgumentException e)
        {
            mEditText.setText(R.string.error);
        }
    }

    private void initilize() {
        mEditText = (TextView) findViewById(R.id.tv_editText);
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
        buttonForLeftBracket = (Button)findViewById(R.id.leftbracket);
        buttonForRightBracket = (Button)findViewById(R.id.rightbracket);
    }

    public void resetstate(View view){
        mEditText.setText("");
    }
}
