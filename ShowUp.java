package com.example.arunesh.signupactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowUp extends AppCompatActivity {


    TextView sal,sname,pass,mail;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_up);

        Intent i = getIntent();

        String name=i.getStringExtra("Name");
        String gender = i.getStringExtra("Gender");
        String password = i.getStringExtra("Password");
        String email = i.getStringExtra("Email");

        sal = (TextView)findViewById(R.id.salute);
        sname = (TextView)findViewById(R.id.Name);
        pass = (TextView)findViewById(R.id.pswd);
        mail = (TextView)findViewById(R.id.mail);

        sal.setText(gender);
        sname.setText(name);
        pass.setText(password);
        mail.setText(email);
    }
}
