package com.geniusnine.android.clanguage.ControlStatements;
//calling controlstatement listview
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.clanguage.R;

public class CallControlStatementDetails extends AppCompatActivity {
WebView Contolwebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_control_statement_details);
        Contolwebview = (WebView) findViewById(R.id.CallcsWebViwId);

        WebSettings webSetting = Contolwebview.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        Contolwebview.setWebViewClient(new CallControlStatementDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            Contolwebview.loadUrl("file:///android_res/raw/ifelse.html");
        } else if (position == 1) {
            Contolwebview.loadUrl("file:///android_res/raw/switchh.html");
        } else if (position == 2) {
            Contolwebview.loadUrl("file:///android_res/raw/loop.html");
        } else if (position == 3) {
            Contolwebview.loadUrl("file:///android_res/raw/dowhile.html");
        } else if (position == 4) {
            Contolwebview.loadUrl("file:///android_res/raw/whilee.html");

        } else if (position == 5) {
            Contolwebview.loadUrl("file:///android_res/raw/forr.html");
        } else if (position == 6) {
            Contolwebview.loadUrl("file:///android_res/raw/breakk.html");
        } else if (position == 7) {
            Contolwebview.loadUrl("file:///android_res/raw/conti.html");
        } else if (position == 8) {
            Contolwebview.loadUrl("file:///android_res/raw/gotoandtypecasting.html");
        }

    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }



}




