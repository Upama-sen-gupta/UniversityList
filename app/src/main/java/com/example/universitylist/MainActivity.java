package com.example.universitylist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           //button initialize
      Button btnPublic=findViewById(R.id.btn_public);
      Button btnPrivate=findViewById(R.id.btn_private);

      btnPublic.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent=new Intent(MainActivity.this,SecondActivity.class);
              startActivity(intent);
              Toast.makeText(MainActivity.this, "Click Me", Toast.LENGTH_SHORT).show();
          }
      });

        btnPrivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Click Me", Toast.LENGTH_SHORT).show();
            }
        });



    }
}