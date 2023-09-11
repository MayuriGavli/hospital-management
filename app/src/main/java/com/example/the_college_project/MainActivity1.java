package com.example.the_college_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Calendar;

public class MainActivity1 extends AppCompatActivity {

     EditText name,Email,phone,DOB,Password;

    int year;
    int month;
    int day;
    Button button,btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });

        name =  findViewById(R.id.username);
        Email = findViewById(R.id.email_address);
        Password = findViewById(R.id.password);
        phone = findViewById(R.id.phone);
        DOB  = findViewById(R.id.DOB);
        button = findViewById(R.id.submit);

        final Calendar cal = Calendar.getInstance();

        DOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                year = cal.get(Calendar.YEAR);
                month = cal.get(Calendar.MONTH);
                day = cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity1.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        DOB.setText(year+"/"+month+"/"+day);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameInput = name.getText().toString();
                String emailInput = Email.getText().toString();
                String phoneinput = phone.getText().toString();



                boolean check = validate(nameInput, emailInput, phoneinput);

                if (check == true) {
                    Toast.makeText(getApplicationContext(), "Appointment Has Booked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Sorry check information again", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


    private boolean validate(String nameInput, String emailInput, String phoneInput) {

        if (nameInput.length() == 0) {
            name.requestFocus();
            name.setError("fields cannot be empty");
            return false;
        } else if (!nameInput.matches("[A-Za-z]+")) {
            name.requestFocus();
            name.setError("enter only alphabetical character");
            return false;
        } else if (emailInput.length() == 0) {
            Email.requestFocus();
            Email.setError("email cannot be empty");
            return false;
        } else if (!emailInput.matches("[a-zA-Z0-9._-]+@gmail+\\.+com")) {
            Email.requestFocus();
            Email.setError("invalid email addresss");
            return false;
        } else if (phone.length() == 0) {
            phone.requestFocus();
            phone.setError("phone cannot be empty");
            return false;
        } else if (!phoneInput.matches("^[0-9]{10,13}$")) {
            phone.requestFocus();
            phone.setError("enter proper phone number");
            return false;
        } else if (Password.length() == 0) {
            Password.requestFocus();
            Password.setError("phone cannot be empty");
            return false;
        }
        return true;
    }


    public void openActivity3() {
        Intent intent = new Intent(MainActivity1.this,MainActivity3.class);
        startActivity(intent);
    }

}