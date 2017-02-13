package com.geniusnine.android.clanguage.FileHAndlingAndPreprocessor;
//calling filehandling and preprocessor webview
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.clanguage.R;

public class CallFileDetails extends AppCompatActivity {
WebView fileweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_file_details);
        fileweb = (WebView) findViewById(R.id.fileWebView);
        WebSettings MbaWebSettings = fileweb.getSettings();
        MbaWebSettings.setBuiltInZoomControls(true);
        MbaWebSettings.setJavaScriptEnabled(true);
        fileweb.setWebViewClient(new CallFileDetails.WebViewClient());
        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            fileweb.loadUrl("file:///android_res/raw/filehandling.html");
        } else if (position == 1) {
            fileweb.loadUrl("file:///android_res/raw/fhmethods.html");
        } else if (position == 2) {
            fileweb.loadUrl("file:///android_res/raw/preprocessors.html");
        } else if (position == 3) {
            fileweb.loadUrl("file:///android_res/raw/premethods.html");
        } else if (position == 4) {
            fileweb.loadUrl("file:///android_res/raw/methods.html");

        } else if (position == 5) {
            fileweb.loadUrl("file:///android_res/raw/command.html");
        } else if (position == 6) {
            fileweb.loadUrl("file:///android_res/raw/comments.html");
        } else if (position == 7) {
            fileweb.loadUrl("file:///android_res/raw/escape.html");
        }


    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }



}

