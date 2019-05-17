package com.example.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent service_run = new Intent(MainActivity.this,jobIntent_service.class);
                jobIntent_service.enqueue(MainActivity.this,service_run);
            }
        });

        //stopService(service_run);
    }

    @Override
    protected void onResume() {
        super.onResume();

//        Toast.makeText(this, "on rsume called", Toast.LENGTH_SHORT).show();
    }
}
