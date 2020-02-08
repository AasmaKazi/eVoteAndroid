package com.example.evote;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity
{
    EditText mTextEnterYourAadhaaarNo;
    Button mButonSendOTP;
    TextView mTextViewRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mTextEnterYourAadhaaarNo= (EditText)findViewById(R.id.edittext_aadhaar);
        mButonSendOTP = (Button)findViewById(R.id.sendOTP);
        mTextViewRegister = (TextView)findViewById(R.id.textView3);
        mTextViewRegister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent registerIntent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(registerIntent);
                finish();
            }
        });

    }

}