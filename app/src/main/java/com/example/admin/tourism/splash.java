package com.example.admin.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class splash extends AppCompatActivity {
ProgressBar p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        p=(ProgressBar)findViewById(R.id.progressBar);
        p.setMax(100);
        p.setProgress(0);
        Thread t=new Thread()
        {
            @Override
            public void run() {
                super.run();
                try{
                    for(int i=0;i<100;i++)

                    {

                        p.setProgress(i);
                        sleep(25);
                    }
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent i;
                    i=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };t.start();

    }
}
