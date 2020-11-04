package com.example.poemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


     Button btnPoem1,btnPoem2,btnPoem3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnpoem1=findViewById(R.id.btn_poem1);
        Button btnPoem2=findViewById(R.id.btn_poem2);
        Button btnPoem3=findViewById(R.id.btn_poem3);


        btnpoem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity2.this,MainActivity3.class);
                i.putExtra("poem","poem1");
                startActivity(i);

            }
        });
        btnPoem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity2.this,MainActivity3.class);
                i.putExtra("poem","poem2");
                startActivity(i);
            }
        });
        btnPoem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity2.this,MainActivity3.class);
                i.putExtra("poem","poem3");
                startActivity(i);
            }
        });


    }
}