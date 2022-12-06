package com.sintel.informatique3me;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Sujet_Examen extends AppCompatActivity {

    public int i = Examen.group;
    public int j= Examen.child;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sujet__examen);
        WebView webView = findViewById(R.id.webView);

        if(i==0 && j==0) {
            String url = "file:///android_asset/examen/pratique2018.html";
            webView.loadUrl(url);
        }
        else if(i==0 && j==1) {
            String url = "file:///android_asset/examen/pratique2019.html";
            webView.loadUrl(url);
        }
        else if(i==1 && j==0) {
            String url = "file:///android_asset/examen/theorique2018.html";
            webView.loadUrl(url);
        }
        else if(i==1 && j==1) {
            String url = "file:///android_asset/examen/theorique2019.html";
            webView.loadUrl(url);
        }
    }
}
