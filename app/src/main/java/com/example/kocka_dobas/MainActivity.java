package com.example.kocka_dobas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView IVkocka1;
    private ImageView IVkocka2;
    private Button BTNkocka1;
    private Button BTNkocka2;
    private Button BTNdobas;
    private Button BTNreset;
    private TextView TVeredmeny;
    private boolean ketto = true;

    private String eredmeny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        BTNkocka1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IVkocka2.setVisibility(View.GONE);
            }
        });
        BTNkocka2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IVkocka2.setVisibility(View.VISIBLE);
            }
        });
    }


    public void init()
    {
        IVkocka1 = findViewById(R.id.IVkocka1);
        IVkocka2 = findViewById(R.id.IVkocka2);

        BTNkocka1 = findViewById(R.id.BTNkocka1);
        BTNkocka2 = findViewById(R.id.BTNkocka2);
        BTNdobas = findViewById(R.id.BTNdobas);
        BTNreset = findViewById(R.id.BTNreset);

        TVeredmeny = findViewById(R.id.TVeredmeny);
    }
}