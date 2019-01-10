package com.example.arunesh.signupactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleCalculator extends AppCompatActivity {

    int a,b,c=0;
    double d;
    EditText et1,et2;
    Button btn;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        btn=(Button)findViewById(R.id.btnAdd);
        t=(TextView)findViewById(R.id.TVAns);
    }

    public void add(View v){
        try {
            a = Integer.parseInt(et1.getText().toString());
            b = Integer.parseInt(et2.getText().toString());
            c = a + b;
        }
        catch (Exception e){
            t.setText("Invalid Inputs");
        }
        finally {
            t.setText("Ans is: "+c);
        }
    }

    public void multiply(View v){
        try {
            a = Integer.parseInt(et1.getText().toString());
            b = Integer.parseInt(et2.getText().toString());
            c = a * b;
        }
        catch (Exception e){
            t.setText("Invalid Inputs");
        }
        finally {
            t.setText("Ans is:"+c);
        }
    }

    public void divide(View v){
        try {
            int a = Integer.parseInt(et1.getText().toString());
            int b = Integer.parseInt(et2.getText().toString());
            if (a > b)
                d = (double) a / (double) b;
            else
                d = (double) b / (double) a;
        }
        catch (Exception e){
            t.setText("Invalid Inputs");
        }
        finally {
            t.setText("Ans is:"+d);
        }
    }

    public void subtract(View v){
        try {
            int a = Integer.parseInt(et1.getText().toString());
            int b = Integer.parseInt(et2.getText().toString());
            if (a > b)
                c = a - b;
            else
                c = b - a;
        }
        catch (Exception e){
            t.setText("Invalid Inputs");
        }
        finally {
            t.setText("Ans is:"+c);
        }
    }
}
