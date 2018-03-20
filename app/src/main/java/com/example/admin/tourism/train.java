package com.example.admin.tourism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class train extends AppCompatActivity {
WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);
        w = (WebView) findViewById(R.id.webview4);


        w.getSettings().setJavaScriptEnabled(true); //to make it work fast and ignore java code.
        w.setWebViewClient(new webcab.HelloWebViewClient());
        w.loadUrl("www.indianrail.gov.in/");
    }

}
