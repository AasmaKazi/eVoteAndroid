package com.example.evote;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    ImageView iRegister;
    ImageView iLogin;
    ImageView iNews;
    ImageView iResult;
    ImageView iuProfile;
    ImageView icProfile;
    ImageView iVote;
    ImageView iHelp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        iRegister = (ImageView)findViewById(R.id.imgregister);
        iLogin = (ImageView)findViewById(R.id.imglogin);
        iNews = (ImageView)findViewById(R.id.imgnews);
        iResult = (ImageView)findViewById(R.id.imgresult);
        iuProfile = (ImageView)findViewById(R.id.imguprofile);
        icProfile = (ImageView)findViewById(R.id.imgcprofile);
        iVote = (ImageView)findViewById(R.id.imgvote);
        iHelp = (ImageView)findViewById(R.id.imghelp);


        iRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(DashboardActivity.this,RegisterActivity.class);
                startActivity(registerIntent);
                finish();
            }
        });

        iLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(DashboardActivity.this,LoginActivity.class);
                startActivity(registerIntent);
                finish();
            }
        });

        iNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(DashboardActivity.this,NewsActivity.class);
                startActivity(registerIntent);
                finish();
            }
        });

        iVote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(DashboardActivity.this,VoteActivity.class);
                startActivity(registerIntent);
                finish();
            }
        });

        icProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(DashboardActivity.this,CandidateProfileActivity.class);
                startActivity(registerIntent);
                finish();
            }
        });

        iuProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(DashboardActivity.this,UserProfileActivity.class);
                startActivity(registerIntent);
                finish();
            }
        });

        iHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(DashboardActivity.this,HelpActivity.class);
                startActivity(registerIntent);
                finish();
            }
        });

        iResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(DashboardActivity.this,ResultActivity.class);
                startActivity(registerIntent);
                finish();
            }
        });



    }
}
