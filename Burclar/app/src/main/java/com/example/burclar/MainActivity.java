package com.example.burclar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button hesapla,giris,yorumlar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hesapla = (Button) findViewById(R.id.hesapla);
        giris = (Button) findViewById(R.id.giris);
        yorumlar = (Button) findViewById(R.id.yorumlar);

        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sayfagiris= new Intent(MainActivity.this,editorGirisi.class);
                startActivity(sayfagiris);
            }
        });
        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sayfagiris= new Intent(MainActivity.this,BurcHesapla.class);
                startActivity(sayfagiris);
            }
        });
        yorumlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sayfagiris= new Intent(MainActivity.this,Secenekler.class);
                startActivity(sayfagiris);
            }
        });
    }
}