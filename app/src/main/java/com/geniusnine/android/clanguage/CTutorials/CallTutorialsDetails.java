package com.geniusnine.android.clanguage.CTutorials;
//calling tutoriallist all Webviews
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.clanguage.R;

public class CallTutorialsDetails extends AppCompatActivity {

    WebView tutorialsWebView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_tutorials_details);

        tutorialsWebView = (WebView) findViewById(R.id.CallTutorialWebViwId);

        WebSettings webSetting = tutorialsWebView.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        tutorialsWebView.setWebViewClient(new CallTutorialsDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            tutorialsWebView.loadUrl("file:///android_res/raw/install.html");
        } else if (position == 1) {
            tutorialsWebView.loadUrl("file:///android_res/raw/firstcprog.html");
        } else if (position == 2) {
            tutorialsWebView.loadUrl("file:///android_res/raw/flowofc.html");
        } else if (position == 3) {
            tutorialsWebView.loadUrl("file:///android_res/raw/psk.html");
        } else if (position == 4) {
            tutorialsWebView.loadUrl("file:///android_res/raw/variables.html");

        } else if (position == 5) {
            tutorialsWebView.loadUrl("file:///android_res/raw/datatypes.html");
        } else if (position == 6) {
            tutorialsWebView.loadUrl("file:///android_res/raw/comments.html");
        } else if (position == 7) {
            tutorialsWebView.loadUrl("file:///android_res/raw/escape.html");
        }
        else if (position == 8) {
            tutorialsWebView.loadUrl("file:///android_res/raw/fundamental.html");
        } else if (position == 9) {
            tutorialsWebView.loadUrl("file:///android_res/raw/cs.html");
        }else if (position == 10) {
            tutorialsWebView.loadUrl("file:///android_res/raw/function2.html");
        }else if (position == 11) {
            tutorialsWebView.loadUrl("file:///android_res/raw/array1.html");
        }else if (position == 12) {
            tutorialsWebView.loadUrl("file:///android_res/raw/point.html");
        }else if (position == 13) {
            tutorialsWebView.loadUrl("file:///android_res/raw/str.html");
        }else if (position == 14) {
            tutorialsWebView.loadUrl("file:///android_res/raw/structure1.html");
        }

    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }



}

