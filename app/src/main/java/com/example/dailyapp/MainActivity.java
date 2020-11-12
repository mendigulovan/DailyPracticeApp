package com.example.dailyapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    String html = "<iframe src=\"https://h5p.org/h5p/embed/63159\" width=\"1090\" height=\"886\" frameborder=\"0\" allowfullscreen=\"allowfullscreen\" allow=\"geolocation *; microphone *; camera *; midi *; encrypted-media *\"></iframe><script src=\"https://h5p.org/sites/all/modules/h5p/library/js/h5p-resizer.js\" charset=\"UTF-8\"></script> ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       WebView webView = findViewById(R.id.webview);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());

        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(true);

        webView.getSettings().setDomStorageEnabled(true);
        webView.loadData(html, "text/html", null);
       // webView.loadUrl("file:///android_asset/www/index.html");






    }
}
