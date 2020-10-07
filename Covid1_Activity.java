package com.example.adithyasomayajula.covid19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Covid1_Activity extends AppCompatActivity {

    private Button yes;
    private Button no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_covid1);

        yes = findViewById(R.id.yes);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTerminated();
            }
        });

        no = findViewById(R.id.no);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCovid2();
            }
        });
    }

    public void openTerminated(){
        Intent intent = new Intent(this, Terminated_Activity.class);
        startActivity(intent);
    };

    public void openCovid2(){
        Intent intent = new Intent(this, Covid2_Activity.class);
        startActivity(intent);
    };



}
