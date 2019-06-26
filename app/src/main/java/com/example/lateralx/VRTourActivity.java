package com.example.lateralx;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

public class VRTourActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vrtour);
        WebView browser = (WebView) findViewById(R.id.webview);
        browser.setInitialScale(1);
        browser.getSettings().setAppCacheEnabled(false);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.getSettings().setAllowContentAccess(true);
        browser.getSettings().setAllowFileAccess(true);
        browser.getSettings().setAllowFileAccessFromFileURLs(true);
        browser.getSettings().setAllowUniversalAccessFromFileURLs(true);
        browser.getSettings().setAppCacheEnabled(true);
        browser.getSettings().setBlockNetworkImage(false);
        browser.getSettings().setBlockNetworkLoads(false);
        browser.getSettings().setDatabaseEnabled(true);
        browser.getSettings().setDomStorageEnabled(true);
        browser.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        browser.getSettings().setLoadsImagesAutomatically(true);
        browser.getSettings().setSupportZoom(true);
        browser.loadUrl("https://sales.lateralx.com/demo/vrtour");
    }
    public void goBack(View v){
        Intent mainIntent = new Intent(this, MainActivity.class);
        startActivity(mainIntent);
    }
}
