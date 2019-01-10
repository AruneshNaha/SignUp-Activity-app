package com.example.arunesh.signupactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebPage extends AppCompatActivity {
    WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_page);
        wb=(WebView)findViewById(R.id.OurWeb);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.loadUrl("https://sumublogs.wordpress.com");
    }
}


