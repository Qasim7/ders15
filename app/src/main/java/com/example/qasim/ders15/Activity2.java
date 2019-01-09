package com.example.qasim.ders15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView textView=findViewById(R.id.txtv);
        Intent intent=getIntent();
        String a=intent.getStringExtra("value");
        textView.setText(a);
    }
}
