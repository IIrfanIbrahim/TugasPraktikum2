package com.widiawati.android.praktikum2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private EditText editStb, editNama;
    private RadioButton Rti, Rsi;
    private RadioGroup ps;
    private Spinner angkatan;
    private CheckBox Cbem, Cpen, Ck, Csen, Cjur, Cola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editStb = findViewById(R.id.stb);
        editNama = findViewById(R.id.nama);
        Rti = findViewById(R.id.ti);
        Rsi = findViewById(R.id.si);
        angkatan = findViewById(R.id.spinner);
        Cbem = findViewById(R.id.bem);
        Cpen = findViewById(R.id.penulisan);
        Ck = findViewById(R.id.usaha);
        Csen = findViewById(R.id.seni);
        Cjur = findViewById(R.id.junalistik);
        Cola = findViewById(R.id.olahraga);

    }

}