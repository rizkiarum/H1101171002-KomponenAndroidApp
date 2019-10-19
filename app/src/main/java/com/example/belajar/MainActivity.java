package com.example.belajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity{

   private LinearLayout satu,dua,tiga,empat,lima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        satu=findViewById(R.id.satu);
        dua=findViewById(R.id.dua);
        tiga=findViewById(R.id.tiga);
        empat=findViewById(R.id.empat);
        lima=findViewById(R.id.lima);

        satu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MateriSatu.class);
                startActivity(intent);
            }
        });

        dua.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MateriDua.class);
                startActivity(intent);
            }
        });

        tiga.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MateriTiga.class);
                startActivity(intent);
            }
        });

        empat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MateriEmpat.class);
                startActivity(intent);
            }
        });

        lima.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MateriLima.class);
                startActivity(intent);
            }
        });
        }

    }

