package com.example.adithyasomayajula.covid19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Covid4_Activity extends AppCompatActivity {

    private Button yes;
    private Button no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_covid4);

        yes = findViewById(R.id.yes);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIsolate();
            }
        });

        no = findViewById(R.id.no);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCovid5();
            }
        });
    }

    public void openIsolate(){
        Intent intent = new Intent(this, Isolate_Activity.class);
        startActivity(intent);
    };

    public void openCovid5(){
        Intent intent = new Intent(this, Covid5_Activity.class);
        startActivity(intent);
    };
}
