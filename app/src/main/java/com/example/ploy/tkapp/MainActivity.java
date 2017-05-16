package com.example.ploy.tkapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView cd1,cd2,cd3;
    public Button button1,button2,button3;

    public void buttonInit1(){
        button1=(Button)findViewById(R.id.btn_button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Gobtn1=new Intent(MainActivity.this,DetailInfo.class);

                startActivity(Gobtn1);
            }
        });
    }

    public void buttonInit2(){
        button2=(Button)findViewById(R.id.btn_button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Gobtn2=new Intent(MainActivity.this,DetailInfo.class);

                startActivity(Gobtn2);
            }
        });
    }

    public void buttonInit3(){
        button3=(Button)findViewById(R.id.btn_button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Gobtn3=new Intent(MainActivity.this,DetailInfo.class);

                startActivity(Gobtn3);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonInit1();
        buttonInit2();
        buttonInit3();


       /* setContentView(R.layout.activity_main);
        cd1=(CardView)findViewById(R.id.cd_1);
        cd2=(CardView)findViewById(R.id.cd_2);
        cd3=(CardView)findViewById(R.id.cd_3);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"You Click CardView 1",Toast.LENGTH_LONG).show();
            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"You Click CardView 2",Toast.LENGTH_LONG).show();
            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"You Click CardView 3",Toast.LENGTH_LONG).show();
            }
        });
        */
    }
}
