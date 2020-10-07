package com.example.adithyasomayajula.covid19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Covid5_Activity extends AppCompatActivity {


    private Button yes;
    private Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_covid5);

        yes = findViewById(R.id.yes);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelfIsolate();
            }
        });

        no = findViewById(R.id.no);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStayHealthy();
            }
        });
    }

    public void openSelfIsolate(){
        Intent intent = new Intent(this, SelfIsolate_Activity.class);
        startActivity(intent);
    };

    public void openStayHealthy(){
        Intent intent = new Intent(this, StayHealthy_Activity.class);
        startActivity(intent);
    };
}