package com.example.the_college_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    ImageView home;
    ImageView Appointment;
    ImageView Profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        home = (ImageView) findViewById(R.id.Home);
        Appointment = (ImageView) findViewById(R.id.Appointment);
        Profile = (ImageView) findViewById(R.id.profile);


        Appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityAppoit();
            }
        });
        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityProfile();
            }
        });
    }



    public void openActivityAppoit() {
        Intent intent = new Intent(MainActivity3.this,Main4Activity.class);
        startActivity(intent);
    }

    public void openActivityProfile() {
        Intent intent = new Intent(MainActivity3.this,MainActivity5.class);
        startActivity(intent);
    }
}


