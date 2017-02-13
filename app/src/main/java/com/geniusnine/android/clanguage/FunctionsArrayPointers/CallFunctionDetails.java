package com.geniusnine.android.clanguage.FunctionsArrayPointers;
//calling Functions,arrays and pointers webview
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.clanguage.R;

public class CallFunctionDetails extends AppCompatActivity {
WebView FunctionWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_function_details);
        FunctionWebView = (WebView) findViewById(R.id.FunctionWebView);
        WebSettings WebSettings = FunctionWebView.getSettings();
        WebSettings.setBuiltInZoomControls(true);
        WebSettings.setJavaScriptEnabled(true);
        FunctionWebView.setWebViewClient(new CallFunctionDetails.WebViewClient());
        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            FunctionWebView.loadUrl("file:///android_res/raw/functionn.html");
        } else if (position == 1) {
            FunctionWebView.loadUrl("file:///android_res/raw/call.html");
        } else if (position == 2) {
            FunctionWebView.loadUrl("file:///android_res/raw/recur.html");
        } else if (position == 3) {
            FunctionWebView.loadUrl("file:///android_res/raw/storage.html");
        } else if (position == 4) {
            FunctionWebView.loadUrl("file:///android_res/raw/onedimen.html");

        } else if (position == 5) {
            FunctionWebView.loadUrl("file:///android_res/raw/twodimen.html");
        }else if (position == 6) {
            FunctionWebView.loadUrl("file:///android_res/raw/dynamicmem.html");
        }

    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }



}

