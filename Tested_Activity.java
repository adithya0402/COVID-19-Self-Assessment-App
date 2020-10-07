package com.example.adithyasomayajula.covid19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tested_Activity extends AppCompatActivity {

    private Button tested;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tested);

        tested = findViewById(R.id.tested);
        tested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink();
            }
        });
    }

    public void openLink(){
        Uri uri = Uri.parse("https://covid-19.ontario.ca/covid-19-test-and-testing-location-information?gclid=CjwKCAjwq_D7BRADEiwAVMDdHnyvqqJMUsdAwRisoAqmzds0ugHv9OX6sHQKvN6-yWQO3hg2p8iGshoCqZwQAvD_BwE");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    };


}
