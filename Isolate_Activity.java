package com.example.adithyasomayajula.covid19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class Isolate_Activity extends AppCompatActivity {

    private Button isolate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_isolate);

        isolate = findViewById(R.id.isolate);
        isolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink();
            }
        });
    }

    public void openLink(){
        Uri uri = Uri.parse("https://covid-19.ontario.ca/self-assessment/r7");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    };
}