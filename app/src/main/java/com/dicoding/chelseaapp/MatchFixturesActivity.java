package com.dicoding.chelseaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class MatchFixturesActivity extends AppCompatActivity {
    WebView web;
    ProgressBar mProgresBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_fixtures);

        mProgresBar = findViewById(R.id.progresbarFixtures);
        mProgresBar.setMax(100);

        web = findViewById(R.id.viewFixtures);
        web.loadUrl("https://www.chelseafc.com/en/matches/fixtures");
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
