package com.uti.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    deklarasi variabel komponen
    Button btn_menu1,btn_menu2,btn_menu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        definisi variabel komponen
        btn_menu1 = (Button) findViewById(R.id.btn_menu1);
        btn_menu2 = (Button) findViewById(R.id.btn_menu2);
        btn_menu3 = (Button) findViewById(R.id.btn_menu3);

//        buat event
//        1. Menu Fragment 1
        btn_menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_container, new Menu1Fragment())
                        .commit();
            }
        });

//        2. Menu Fragment 2
        btn_menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_container, new Menu2Fragment())
                        .commit();
            }
        });

//        3. Menu Fragment 3
        btn_menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_container, new Menu3Fragment())
                        .commit();
            }
        });
    }
}