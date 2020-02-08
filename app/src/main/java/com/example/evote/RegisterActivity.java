package com.example.evote;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;

//import com.android.support:appcompact.v-7:28.0.0; */

public class RegisterActivity extends AppCompatActivity {

    EditText mTextFullName;
    EditText mTextAadharNo;
    EditText mTextContactNo;
    EditText mTextEmailId;
    EditText mTextDOB;
    RadioButton mMale;
    RadioButton mFemale;
    RadioButton mOther;
    Button mBRgister;
    TextView mLogin;
    AwesomeValidation awesomeValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mTextFullName=(EditText)findViewById(R.id.name);
        mTextAadharNo = (EditText)findViewById(R.id.aadhaar_no);
        mTextContactNo = (EditText)findViewById(R.id.contact_no);
        mTextEmailId = (EditText)findViewById(R.id.email_id);
        mTextDOB = (EditText)findViewById(R.id.dob);
        mMale =(RadioButton)findViewById(R.id.Male);
        mFemale = (RadioButton)findViewById(R.id.Female);
        mOther = (RadioButton)findViewById(R.id.Other);
        mBRgister = (Button)findViewById(R.id.btregister);
        mLogin = (TextView)findViewById(R.id.txlogin);



        awesomeValidation=new AwesomeValidation(ValidationStyle.BASIC);

        //validation for name
        awesomeValidation.addValidation(this,R.id.name,"^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",R.string.invalid_name);

        //for aadharcard no
        awesomeValidation.addValidation(this,R.id.aadhaar_no,"[0-9]{12}$",R.string.invalid_aadharcard_no);

        //for mobile no
        awesomeValidation.addValidation(this,R.id.contact_no, "[7-9]{1}[0-9]{9}$",R.string.invalid_mobile);

        awesomeValidation.addValidation(this,R.id.email_id, Patterns.EMAIL_ADDRESS,R.string.invalid_emailid);

        mBRgister.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //check validation
                if(awesomeValidation.validate()){
                    Toast.makeText(getApplicationContext(),"form validate successfully",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext()
                            ,"vaidation faild",Toast.LENGTH_SHORT).show();
                }
            }
        });

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(registerIntent);
                finish();
            }
        });


    }

}
