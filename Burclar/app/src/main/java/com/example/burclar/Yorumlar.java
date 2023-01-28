package com.example.burclar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Yorumlar<Cursor> extends AppCompatActivity {

    ImageView resim;
    TextView txt;
    Database db;
    ListView yorum;
    Button gunluk,aylik,yillik;
    int idd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yorumlar);
        idd = 1;
        aylik = (Button) findViewById(R.id.aylik);
        yillik = (Button) findViewById(R.id.yillik);
        txt = (TextView) findViewById(R.id.txt);
        db = new Database(this);
        yorum = (ListView) findViewById(R.id.yorum);
        gunluk = (Button) findViewById(R.id.gunluk);
        resim = (ImageView) findViewById(R.id.resim);

        Intent intent = getIntent();
        String txtt = intent.getStringExtra("buttonn");
        txt.setText(txtt);
        gunluk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gungetir();
            }
        });
        aylik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                aygetir();
            }
        });yillik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yilgetir();
            }
        });
    }
    public void gungetir(){
        Database dbb = new Database(Yorumlar.this);
        List<String> veriler = dbb.kayitgooster(Integer.parseInt(String.valueOf(idd)), txt.getText().toString());
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Yorumlar.this, android.R.layout.simple_list_item_1, veriler);
        yorum.setAdapter(adapter);
        resim.setImageResource(getResources().getIdentifier(txt.getText().toString(),"drawable",getPackageName()));
    }
    public void aygetir(){
        Database dbb = new Database(Yorumlar.this);
        List<String> veriler = dbb.kayitgooster2(idd, txt.getText().toString());
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Yorumlar.this, android.R.layout.simple_list_item_1, veriler);
        yorum.setAdapter(adapter);
        resim.setImageResource(getResources().getIdentifier(txt.getText().toString(),"drawable",getPackageName()));
    }
    public void yilgetir(){
        Database dbb = new Database(Yorumlar.this);
        List<String> veriler = dbb.kayitgooster3(idd, txt.getText().toString());
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Yorumlar.this, android.R.layout.simple_list_item_1, veriler);
        yorum.setAdapter(adapter);
        resim.setImageResource(getResources().getIdentifier(txt.getText().toString(),"drawable",getPackageName()));
    }



}