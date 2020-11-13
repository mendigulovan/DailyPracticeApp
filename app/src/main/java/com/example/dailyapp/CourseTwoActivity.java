package com.example.dailyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class CourseTwoActivity extends MainActivity {

    private ProgressBar progressBar;
    int counter = 0;
    String html = "<iframe src=\"https://h5p.org/h5p/embed/619\" width=\"1090\" height=\"644\" frameborder=\"0\" allowfullscreen=\"allowfullscreen\" allow=\"geolocation *; microphone *; camera *; midi *; encrypted-media *\"></iframe><script src=\"https://h5p.org/sites/all/modules/h5p/library/js/h5p-resizer.js\" charset=\"UTF-8\"></script>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursetwo);

        WebView webView = findViewById(R.id.webview);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());

        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(true);

        webView.getSettings().setDomStorageEnabled(true);
        webView.loadData(html, "text/html", null);

        Button end = (Button) findViewById(R.id.end);

        end.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view) {
                Intent intent = new Intent(view.getContext(), EndCourseActivity.class);
                view.getContext().startActivity(intent);}
        });

        bar2();
    }

    public void bar2(){
        progressBar = (ProgressBar) findViewById(R.id.progressbar2);
        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run()
            {
                counter++;
                progressBar.setProgress(counter);

                if(counter == 15)
                    t.cancel();
            }
        };

        t.schedule(tt,0,50);

    }
}
