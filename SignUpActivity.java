package com.example.arunesh.signupactivity;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    Button b;
    EditText et1,email,pswd;
    RadioGroup rg;
    RadioButton rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        b=(Button)findViewById(R.id.btnAc);
        et1=(EditText)findViewById(R.id.et1);
        email=(EditText)findViewById(R.id.etmail);
        pswd=(EditText)findViewById(R.id.etpswd);
        rg=(RadioGroup)findViewById(R.id.radioGroup);
        rb1=(RadioButton)findViewById(R.id.m);
        rb2=(RadioButton)findViewById(R.id.f);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String name=et1.getText().toString();
                final String mail=email.getText().toString();
                final String pass=pswd.getText().toString();
                final String salute;

                if(rb1.isChecked())
                    salute = "Mr.";
                else
                    salute = "Mrs.";

                int i=rg.getCheckedRadioButtonId();

                RadioButton rb = (RadioButton)rg.findViewById(i);
                Toast.makeText(SignUpActivity.this,"Clicked",Toast.LENGTH_LONG).show();
                Toast.makeText(SignUpActivity.this,"Name: "+name+"\nE-mail:"+mail+"\nGender:"+rb.getText().toString()+"\nPassword:"+pass,Toast.LENGTH_LONG).show();


                AlertDialog.Builder ab = new AlertDialog.Builder(SignUpActivity.this);
                ab.setMessage("Name"+name);
                Intent j = new Intent(SignUpActivity.this,ShowUp.class);

                j.putExtra("Name",name);
                j.putExtra("Email",mail);
                j.putExtra("Password",pass);
                j.putExtra("Gender",salute);

                startActivity(j);
            }
        });
    }
}
