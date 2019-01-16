package com.example.kwak.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class sec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);


        Intent intent = getIntent();

        Map<String,String> a =  (HashMap)intent.getSerializableExtra("data");


        Toast.makeText(this, a.get("method"), Toast.LENGTH_SHORT).show();


    }
}
