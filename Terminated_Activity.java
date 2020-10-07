package com.example.adithyasomayajula.covid19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Terminated_Activity extends AppCompatActivity {

    private Button again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminated);


        again = (Button)  findViewById(R.id.again);
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCovid();
            }
        });
    }

    public void openCovid(){
        Intent intent = new Intent(this, Covid_Activity.class);
        startActivity(intent);
    };


}
