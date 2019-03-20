package com.example.nurhidayati.androidbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Materi3 extends AppCompatActivity {

    public static final String EXTRA_DATA = "EXTRA_DATA";

    private EditText editText;
    private Button btnSendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi3);

        editText=(EditText) findViewById(R.id.editText);
        btnSendData = (Button) findViewById(R.id.button);

        btnSendData.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                String data = editText.getText().toString();
                Intent intent = new Intent(Materi3.this, Target.class);
                intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });
    }
}
