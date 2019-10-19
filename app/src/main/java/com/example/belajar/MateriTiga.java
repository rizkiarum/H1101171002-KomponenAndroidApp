package com.example.belajar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MateriTiga extends AppCompatActivity {
    private TextView mLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_tiga);

        mLink = (TextView) findViewById(R.id.link);
        if (mLink !=null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
    }

