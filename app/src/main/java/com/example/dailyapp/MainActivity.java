package com.example.dailyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = (Button) findViewById(R.id.intro);

        start.setOnClickListener(new View.OnClickListener() {
        public void onClick (View view) {
            Intent intent = new Intent(view.getContext(), CourseActivity.class);
            view.getContext().startActivity(intent);}
    });

        Button inter = (Button) findViewById(R.id.inter);

        inter.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view) {
                Intent intent = new Intent(view.getContext(), CourseTwoActivity.class);
                view.getContext().startActivity(intent);}
        });



    }

}
