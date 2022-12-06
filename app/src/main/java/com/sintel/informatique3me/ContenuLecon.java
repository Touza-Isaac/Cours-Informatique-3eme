package com.sintel.informatique3me;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ContenuLecon extends AppCompatActivity {

    public  int position = LeconActivity.pos;
    public int positiongroup =Cours.i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenu_lecon);

        WebView webView = findViewById(R.id.webViewLecon);

        if(positiongroup==0 ) {
            if (position==0) {
                String url = "file:///android_asset/cours/lecon1.html";
                webView.loadUrl(url);
            } else if(position==1){
                String url = "file:///android_asset/cours/lecon2.html";
                webView.loadUrl(url);
            }
        }
        else if(positiongroup==1 ) {
            if (position==0) {
                String url = "file:///android_asset/cours/lecon3.html";
                webView.loadUrl(url);
            } else if(position==1){
                String url = "file:///android_asset/cours/lecon4.html";
                webView.loadUrl(url);
            }
        }

        else if(positiongroup==2 ) {
            if (position==0) {
                String url = "file:///android_asset/cours/lecon5.html";
                webView.loadUrl(url);
            } else if(position==1){
                String url = "file:///android_asset/cours/lecon6.html";
                webView.loadUrl(url);
            }
        }

        else if(positiongroup==3 ) {
            if (position==0) {
                String url = "file:///android_asset/cours/lecon7.html";
                webView.loadUrl(url);
            } else if(position==1){
                String url = "file:///android_asset/cours/lecon8.html";
                webView.loadUrl(url);
            } else if(position==2){
                String url = "file:///android_asset/cours/lecon9.html";
                webView.loadUrl(url);
            }
        }

        else if(positiongroup==4 ) {
            if (position==0) {
                String url = "file:///android_asset/cours/lecon10.html";
                webView.loadUrl(url);
            } else if(position==1){
                String url = "file:///android_asset/cours/lecon11.html";
                webView.loadUrl(url);
            } else if(position==2){
                String url = "file:///android_asset/cours/lecon12.html";
                webView.loadUrl(url);
            } else if(position==3){
                String url = "file:///android_asset/cours/lecon13.html";
                webView.loadUrl(url);
            } else if(position==4){
                String url = "file:///android_asset/cours/lecon14.html";
                webView.loadUrl(url);
            }
        }
        else if(positiongroup==5 ) {
            if (position==0) {
                String url = "file:///android_asset/cours/lecon15.html";
                webView.loadUrl(url);
            } else if(position==1){
                String url = "file:///android_asset/cours/lecon16.html";
                webView.loadUrl(url);
            } else if(position==2){
                String url = "file:///android_asset/cours/lecon17.html";
                webView.loadUrl(url);
            }
        }
        else if(positiongroup==6 ) {
            if (position==0) {
                String url = "file:///android_asset/cours/lecon18.html";
                webView.loadUrl(url);
            } else if(position==1){
                String url = "file:///android_asset/cours/lecon19.html";
                webView.loadUrl(url);
            }
        }
        else if(positiongroup==7) {
            if (position==0) {
                String url = "file:///android_asset/cours/lecon20.html";
                webView.loadUrl(url);
            } else if(position==1){
                String url = "file:///android_asset/cours/lecon21.html";
                webView.loadUrl(url);
            }
        }
        else if(positiongroup==8) {
            if (position==0) {
                String url = "file:///android_asset/cours/lecon22.html";
                webView.loadUrl(url);
            } else if(position==1){
                String url = "file:///android_asset/cours/lecon23.html";
                webView.loadUrl(url);
            } else if(position==2){
                String url = "file:///android_asset/cours/lecon24.html";
                webView.loadUrl(url);
            }else if(position==3){
                String url = "file:///android_asset/cours/lecon25.html";
                webView.loadUrl(url);
            }

        }



    }
}
