package com.example.nurhidayati.androidbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Target extends AppCompatActivity {
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        txtResult = (TextView)findViewById(R.id.textView);

        //get data
        if (getIntent().getExtras() != null) {
            String data = getIntent().getExtras().getString(Materi3.EXTRA_DATA);
            txtResult.setText(data);
        }
    }
}
