package com.example.adithyasomayajula.covid19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Covid_Activity extends AppCompatActivity {

    private Button proceed;
    private EditText firstName;
    private EditText lastName;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_covid);

        proceed = (Button) findViewById(R.id.proceed);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCovid1();
            }
        });

        firstName = (EditText) findViewById(R.id.firstName);
        firstName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstName.getText().clear();
            }
        });

        lastName = (EditText) findViewById(R.id.lastName);
        lastName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lastName.getText().clear();
            }
        });

        email = (EditText) findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email.getText().clear();
            }
        });


    }

    public void openCovid1(){
        Intent intent = new Intent(this, Covid1_Activity.class);
        startActivity(intent);
    }
}
