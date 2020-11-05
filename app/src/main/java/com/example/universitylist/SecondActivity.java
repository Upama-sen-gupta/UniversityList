package com.example.universitylist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //button initialize
        Button btnCuet = findViewById(R.id.btn_cuet);
        Button btnCu = findViewById(R.id.btn_cu);

        btnCuet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cuet.ac.bd/"));
                startActivity(intent);
                Toast.makeText(SecondActivity.this, "Click Me", Toast.LENGTH_SHORT).show();
            }
        });


        btnCu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cu.ac.bd/"));
                startActivity(intent);
                Toast.makeText(SecondActivity.this, "Click Me", Toast.LENGTH_SHORT).show();
            }
        });
    }
}