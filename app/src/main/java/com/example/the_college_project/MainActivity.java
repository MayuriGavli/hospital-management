package com.example.the_college_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_signin;
    private Button btn_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        btn_signin = (Button) findViewById(R.id.sign_in_btn);
        btn_signup = (Button) findViewById(R.id.sign_up_btn);
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity0();
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity1();
            }
        });
    }

    public void openActivity0() {
        Intent intent = new Intent(MainActivity.this, MainActivity0.class);
        startActivity(intent);
    }

    public void openActivity1() {
        Intent intent = new Intent(MainActivity.this, MainActivity1.class);
        startActivity(intent);
    }
}

