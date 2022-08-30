package com.soninsony.backgroundthread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class LatterPadActivity extends AppCompatActivity {
      WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latter_pad);

        webView = findViewById(R.id.webview);
        webView.loadData(String.valueOf(R.layout.activity_pdf), "text/html", "UTF-8");
    }
}