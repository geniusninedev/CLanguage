package com.geniusnine.android.clanguage.StringMathUnion;
//callin string,math and union webview
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.clanguage.R;

public class CallStringDetails extends AppCompatActivity {
WebView StringWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_string_details);
        StringWebview = (WebView) findViewById(R.id.StringWebView);
        WebSettings MbaWebSettings = StringWebview.getSettings();
        MbaWebSettings.setBuiltInZoomControls(true);
        MbaWebSettings.setJavaScriptEnabled(true);
        StringWebview.setWebViewClient(new CallStringDetails.WebViewClient());
        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            StringWebview.loadUrl("file:///android_res/raw/stringg1.html");
        } else if (position == 1) {
            StringWebview.loadUrl("file:///android_res/raw/stringgmethods.html");
        } else if (position == 2) {
            StringWebview.loadUrl("file:///android_res/raw/math.html");
        } else if (position == 3) {
            StringWebview.loadUrl("file:///android_res/raw/structure.html");
        } else if (position == 4) {
            StringWebview.loadUrl("file:///android_res/raw/nestedstructure.html");

        } else if (position == 5) {
            StringWebview.loadUrl("file:///android_res/raw/twodimen.html");
        }else if (position == 6) {
            StringWebview.loadUrl("file:///android_res/raw/dynamicmem.html");
        }

    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }



}
