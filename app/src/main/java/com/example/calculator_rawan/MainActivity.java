package com.example.calculator_rawan;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    EditText T1, T2;
    TextView V1, V2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1 = (EditText) findViewById(R.id.Text1);
        T2 = (EditText) findViewById(R.id.Text2);
        V1 = (TextView) findViewById(R.id.sign);
        V2 = (TextView) findViewById(R.id.View0);
    }

    public void onClick(View v) {
        float number1, number2;
        float result = 0;

        if (TextUtils.isEmpty(T1.getText().toString())
                || TextUtils.isEmpty(T2.getText().toString())) {
            return;
        }

        number1 = Float.parseFloat(T1.getText().toString());
        number2 = Float.parseFloat(T2.getText().toString());

        switch (v.getId()) {
            case R.id.on1:
                result = number1 + number2;
                V1.setText("+");
                break;
            case R.id.on2:
                result = number1 - number2;
                V1.setText("-");
                break;
            case R.id.on3:
                result = number1 / number2;
                V1.setText("/");
                break;
            case R.id.on4:
                result = number1 * number2;
                V1.setText("×");
                break;


            default:
        }

        V2.setText("" + result + "");
    }
}


