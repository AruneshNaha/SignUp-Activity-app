package com.example.arunesh.signupactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sgnup,btnact,btnS,btnCal,rt,web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sgnup = (Button)findViewById(R.id.btnsign);
        btnact = (Button)findViewById(R.id.btnvisible);
        btnS = (Button)findViewById(R.id.btnSeek);
        btnCal = (Button)findViewById(R.id.btnCalc);
        rt = (Button)findViewById(R.id.btnRt);
        web = (Button)findViewById(R.id.Web);

        btnact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ButtonInvisibility.class);
                startActivity(i);
            }
        });

        sgnup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(i);
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Seeking.class);
                startActivity(i);
            }
        });

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SimpleCalculator.class);
                startActivity(i);
            }
        });

        rt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Rating.class);
                startActivity(i);
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,WebPage.class);
                startActivity(i);
            }
        });
    }
}
