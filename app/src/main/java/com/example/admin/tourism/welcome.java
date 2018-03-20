package com.example.admin.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button8);
        b8=(Button)findViewById(R.id.button9);
        b9=(Button)findViewById(R.id.button10);
        b10=(Button)findViewById(R.id.button11);
        b11=(Button)findViewById(R.id.button12);
        b12=(Button)findViewById(R.id.button13);
        b13=(Button)findViewById(R.id.button14);
        b14=(Button)findViewById(R.id.button15);
        b15=(Button)findViewById(R.id.button16);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 1);
                startActivity(i);

            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 2);
                startActivity(i);

            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 3);
                startActivity(i);

            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 4);
                startActivity(i);

            }

        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 5);
                startActivity(i);

            }

        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 6);
                startActivity(i);

            }

        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 7);
                startActivity(i);

            }

        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 8);
                startActivity(i);

            }

        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 9);
                startActivity(i);

            }

        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 10);
                startActivity(i);

            }

        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 11);
                startActivity(i);

            }

        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 12);
                startActivity(i);

            }

        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 13);
                startActivity(i);

            }

        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 14);
                startActivity(i);

            }

        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),jaipurcity.class);
                i.putExtra("buttonNumber", 15);
                startActivity(i);

            }

        });


    }
    }

