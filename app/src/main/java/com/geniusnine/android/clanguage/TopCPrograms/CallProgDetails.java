package com.geniusnine.android.clanguage.TopCPrograms;
//calling programs webview
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.clanguage.FileHAndlingAndPreprocessor.CallFileDetails;
import com.geniusnine.android.clanguage.R;

public class CallProgDetails extends AppCompatActivity {
WebView progweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_prog_details);
        progweb = (WebView) findViewById(R.id.CallprogWebViwId);
        WebSettings MbaWebSettings = progweb.getSettings();
        MbaWebSettings.setBuiltInZoomControls(true);
        MbaWebSettings.setJavaScriptEnabled(true);
        progweb.setWebViewClient(new CallProgDetails.WebViewClient());
        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            progweb.loadUrl("file:///android_res/raw/febi.html");
        } else if (position == 1) {
            progweb.loadUrl("file:///android_res/raw/prime.html");
        } else if (position == 2) {
            progweb.loadUrl("file:///android_res/raw/palindrome.html");
        } else if (position == 3) {
            progweb.loadUrl("file:///android_res/raw/fact.html");
        } else if (position == 4) {
            progweb.loadUrl("file:///android_res/raw/armstrong.html");

        } else if (position == 5) {
            progweb.loadUrl("file:///android_res/raw/sum.html");
        } else if (position == 6) {
            progweb.loadUrl("file:///android_res/raw/reverse.html");
        } else if (position == 7) {
            progweb.loadUrl("file:///android_res/raw/swap.html");
        }
        else if (position == 8) {
            progweb.loadUrl("file:///android_res/raw/hello.html");
        }else if (position == 9) {
            progweb.loadUrl("file:///android_res/raw/assembly.html");
        }
        else if (position == 10) {
            progweb.loadUrl("file:///android_res/raw/cpro.html");
        }else if (position == 11) {
            progweb.loadUrl("file:///android_res/raw/matrix.html");
        }else if (position == 12) {
            progweb.loadUrl("file:///android_res/raw/dtob.html");
        }else if (position == 13) {
            progweb.loadUrl("file:///android_res/raw/numberinchar.html");
        }
        else if (position == 14) {
            progweb.loadUrl("file:///android_res/raw/alpha.html");
        }
        else if (position == 15) {
            progweb.loadUrl("file:///android_res/raw/num.html");
        } else if (position == 16) {
            progweb.loadUrl("file:///android_res/raw/febotriangle.html");
        } else if (position == 17) {
            progweb.loadUrl("file:///android_res/raw/dowhi.html");
        }else if (position == 18) {
            progweb.loadUrl("file:///android_res/raw/for1.html");
        }else if (position == 19) {
            progweb.loadUrl("file:///android_res/raw/switchprog.html");
        }else if (position == 20) {
            progweb.loadUrl("file:///android_res/raw/gotoo.html");
        }else if (position == 21) {
            progweb.loadUrl("file:///android_res/raw/recursionn.html");
        }else if (position == 22) {
            progweb.loadUrl("file:///android_res/raw/arrayy.html");
        }else if (position == 23) {
            progweb.loadUrl("file:///android_res/raw/nestedd.html");
        }else if (position == 24) {
            progweb.loadUrl("file:///android_res/raw/continuee.html");
        }




    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }



}


