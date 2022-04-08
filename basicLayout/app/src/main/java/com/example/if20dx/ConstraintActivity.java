package com.example.if20dx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class ConstraintActivity extends AppCompatActivity {
    Button btn_menu1, btn_menu2, btn_menu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);

        btn_menu1 = findViewById(R.id.button3);
        btn_menu2 = findViewById(R.id.button);
        btn_menu3 = findViewById(R.id.button2);

        btn_menu1.setOnClickListener(v -> {
            Intent in;
            in = new Intent(this, MainActivity.class);
            startActivity(in);
        });

        btn_menu2.setOnClickListener(v -> {
            Intent in;
            String no = "tel:08984287381";
            in = new Intent(Intent.ACTION_DIAL, Uri.parse(no));
            startActivity(in);
        });

        btn_menu3.setOnClickListener(v -> {
            Intent in;
            String web = "https://teknokrat.ac.id";
            in = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
            startActivity(in);
        });
    }
}