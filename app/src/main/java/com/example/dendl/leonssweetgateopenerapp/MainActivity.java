package com.example.dendl.leonssweetgateopenerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static String WIDGET_BUTTON = "com.example.dendl.leonssweetgateopenerapp.btn_triggerGate";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.btn_test_broadcast);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getApplicationContext().sendBroadcast(new Intent(WIDGET_BUTTON));
            }
        });

    }
}
