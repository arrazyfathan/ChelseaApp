package com.dicoding.chelseaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class ClubHistoryActivity extends AppCompatActivity {
    private ProgressBar mProgresBar;
    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_history);

        mProgresBar = findViewById(R.id.progresbar);
        mProgresBar.setMax(100);

        web = findViewById(R.id.viewHistory);
        web.loadUrl("https://www.chelseafc.com/en/about-chelsea/history");
        web.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                mProgresBar.setVisibility(View.GONE);
            }
        });
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode==KeyEvent.KEYCODE_BACK) && web.canGoBack()){
            web.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

}
