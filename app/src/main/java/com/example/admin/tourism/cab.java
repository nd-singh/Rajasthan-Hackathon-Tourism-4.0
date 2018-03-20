package com.example.admin.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class cab extends AppCompatActivity {
ImageButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cab);
        b1=(ImageButton)findViewById(R.id.olaa);
        b2=(ImageButton)findViewById(R.id.uber);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),webcab.class);
                i.putExtra("buttonNumber", 1);
                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),webcab.class);
                i.putExtra("buttonNumber", 2);
                startActivity(i);

            }
        });
    }
}
