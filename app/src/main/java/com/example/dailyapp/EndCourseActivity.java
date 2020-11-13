package com.example.dailyapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class EndCourseActivity extends CourseActivity {
    private ProgressBar progressBar;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endcourse);

        Button back = (Button) findViewById(R.id.back);
        Button cont = (Button) findViewById(R.id.cont);

        cont.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), CourseActivity.class);
                view.getContext().startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                view.getContext().startActivity(intent);
            }
        });




    }
}