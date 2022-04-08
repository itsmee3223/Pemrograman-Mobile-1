package com.example.if20dx;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    Inisialisasi variabel
    TextView edt_nilai1, edt_nilai2, edt_hasil;
    Button btn_hitung, btn_batal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Definisi variabel
        edt_nilai1 = findViewById(R.id.edt_nilai1);
        edt_nilai2 = findViewById(R.id.edt_nilai2);
        edt_hasil = findViewById(R.id.edt_hasil);

        btn_hitung = findViewById(R.id.btn_hasil);
        btn_batal = findViewById(R.id.btn_batal);

//        1. button hitung
        btn_hitung.setOnClickListener(v -> {

            if(edt_nilai1.getText().toString().isEmpty() || edt_nilai2.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this, "Nilai 1 dan nilai 2 harus diisi!", Toast.LENGTH_SHORT).show();
            } else {
                int input1,input2,hasil;

                input1 = Integer.parseInt(edt_nilai1.getText().toString());
                input2 = Integer.parseInt(edt_nilai2.getText().toString());

                hasil = input1 + input2;
                edt_hasil.setText(Integer.toString(hasil));
            }
        });
//        2. button hasil
        btn_batal.setOnLongClickListener(v -> {
            edt_nilai1.setText("");
            edt_nilai2.setText("");
            edt_hasil.setText("");
            edt_nilai1.requestFocus();
            return false;

        });

    }
}
