package com.example.android.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tx=findViewById(R.id.cp);
        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            String n = extras.getString("code");
            tx.setText(n);
        }
    }
}
