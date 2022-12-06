package com.sintel.informatique3me;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class FicheIntegration extends AppCompatActivity {
    public  int position=Integration.pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_integration);
        WebView webView = findViewById(R.id.webViewIntegration);

        if(position==0){
            String url = "file:///android_asset/integration/integration1.html";
            webView.loadUrl(url);
        }
        else if(position==1){
            String url = "file:///android_asset/integration/integration2.html";
            webView.loadUrl(url);
        }
        else if(position==2){
            String url = "file:///android_asset/integration/integration3.html";
            webView.loadUrl(url);
        }
        else if(position==3){
            String url = "file:///android_asset/integration/integration4.html";
            webView.loadUrl(url);
        }
        else if(position==4){
            String url = "file:///android_asset/integration/integration5.html";
            webView.loadUrl(url);
        }
        else if(position==5){
            String url = "file:///android_asset/integration/integration6.html";
            webView.loadUrl(url);
        }
        else if(position==6){
            String url = "file:///android_asset/integration/integration7.html";
            webView.loadUrl(url);
        }
        if(position==7){
            String url = "file:///android_asset/integration/integration8.html";
            webView.loadUrl(url);
        }
        else if(position==8){
            String url = "file:///android_asset/integration/integration9.html";
            webView.loadUrl(url);
        }
    }
}
