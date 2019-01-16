package com.example.kwak.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

//    View.OnClickListener tsetClick = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            switch (v.getId()){
//                case R.id.button :
//                    Toast.makeText(MainActivity.this, "버튼1", Toast.LENGTH_SHORT).show(); break;
//                case R.id.button3 :
//                    Toast.makeText(MainActivity.this, "버튼3", Toast.LENGTH_SHORT).show(); break;
//                case R.id.button2 :
//                    Toast.makeText(MainActivity.this, "버튼2", Toast.LENGTH_SHORT).show(); break;
//                case R.id.button4 :
//                    Toast.makeText(MainActivity.this, "버튼4", Toast.LENGTH_SHORT).show(); break;
//            }
//        }
//    };


    public void tset2Click(View v){
        ((Button)findViewById(v.getId())).getText();
        switch (v.getId()){
            case R.id.button :
                Toast.makeText(MainActivity.this, "1111", Toast.LENGTH_SHORT).show();
                makeIntent();
            break;
            case R.id.button3 :
                Toast.makeText(MainActivity.this, "버튼33333", Toast.LENGTH_SHORT).show(); break;
            case R.id.success_btn :

                Toast.makeText(MainActivity.this, ((Button)v).getText(), Toast.LENGTH_SHORT).show(); break;
            case R.id.button4 :
                Toast.makeText(MainActivity.this, "버튼444444", Toast.LENGTH_SHORT).show(); break;
        }
    }


    public void makeIntent(){

        Bundle bundle = new Bundle();
        Map<String, Object> testMap = new HashMap<>();
        testMap.put("method", "getPinPage");
        testMap.put("data", "");

        Intent intent = new Intent(MainActivity.this, sec.class);
        intent.putExtra("data", (Serializable) testMap);

        startActivity(intent);
    }




}
