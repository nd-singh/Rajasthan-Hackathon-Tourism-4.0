package com.example.admin.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class webcab extends AppCompatActivity {
int pressedButtonNumber;
WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webcab);
        w = (WebView) findViewById(R.id.wv);
        pressedButtonNumber = getIntent().getExtras().getInt("buttonNumber");

            switch (pressedButtonNumber) {
                case 1:

                    w.getSettings().setJavaScriptEnabled(true); //to make it work fast and ignore java code.
                    w.setWebViewClient(new HelloWebViewClient());
                    w.loadUrl("https://www.olacabs.com/");

                    //Do Something for clicking button 1 scenario
                    break;
                case 2:

                    w.getSettings().setJavaScriptEnabled(true); //to make it work fast and ignore java code.
                    w.setWebViewClient(new HelloWebViewClient());
                    w.loadUrl("https://www.uber.com/en-IN/fare-estimate/");
                    //Do Something for clicking button 1 scenario
                    break;


        }
        }


    public static class HelloWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
