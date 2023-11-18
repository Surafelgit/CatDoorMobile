package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.view.View;
public class LiveActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);
        webView = findViewById(R.id.webView);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);// makes the width fit into screen
        webView.getSettings().setJavaScriptEnabled(true);
//        webView.getSettings().setDomStorageEnabled(true);
    }

        public void buttonPlayVideo(View view){
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("");// http://ip-address:5000/endpoint
        }

        public void OpenDoor(){// arduino code to open the door implemented here. call the api endpoint maybe.
            System.out.println("Open the Door");
        }

}