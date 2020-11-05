package com.example.universitylist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button btnIiuc = findViewById(R.id.btn_iiuc);
        Button btnPciu = findViewById(R.id.btn_pciu);
        Button btnPremier = findViewById(R.id.btn_premier);

        btnIiuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iiuc.ac.bd/"));
                startActivity(intent);
                Toast.makeText(ThirdActivity.this, "Click Me", Toast.LENGTH_SHORT).show();
            }
        });


        btnPciu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.portcity.edu.bd/"));
                startActivity(intent);
                Toast.makeText(ThirdActivity.this, "Click Me", Toast.LENGTH_SHORT).show();
            }
        });

        btnPremier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://puc.ac.bd/"));
                startActivity(intent);
                Toast.makeText(ThirdActivity.this, "Click Me", Toast.LENGTH_SHORT).show();
            }
        });


    }
}


