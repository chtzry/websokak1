package com.websokak.websokak;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        WebView tarayici;
        tarayici = (WebView)findViewById(R.id.WebView);
        tarayici.getSettings().setJavaScriptEnabled(true);
        tarayici.setWebViewClient(new WebViewClient());
        tarayici.setWebChromeClient(new WebChromeClient());
        tarayici.loadUrl("http://www.websokak.com");

    }
}
