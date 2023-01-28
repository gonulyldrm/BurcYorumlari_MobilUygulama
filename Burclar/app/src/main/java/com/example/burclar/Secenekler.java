package com.example.burclar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Secenekler extends AppCompatActivity {

    Button aslan ,ikizler,balik,yengec,boga,akrep,kova,koc,basak,terazi,yay,oglak;
    Database db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secenekler);

        aslan=(Button) findViewById(R.id.aslann);
        ikizler=(Button)findViewById(R.id.ikizlerr);
        balik=(Button)findViewById(R.id.balikk);
        yengec=(Button)findViewById(R.id.yengecc);
        boga=(Button)findViewById(R.id.bogaa);
        akrep=(Button)findViewById(R.id.akrepp);
        kova=(Button) findViewById(R.id.kovaa);
        koc=(Button) findViewById(R.id.kocc);
        basak=(Button) findViewById(R.id.basakk);
        terazi=(Button) findViewById(R.id.terazii);
        yay=(Button) findViewById(R.id.yayy);
        oglak=(Button) findViewById(R.id.oglakk);
        aslan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veriaktar(aslan);
            }
        });
        ikizler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veriaktar(ikizler);
            }
        });
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veriaktar(balik);
            }
        });
        yengec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veriaktar(yengec);
            }
        });
        boga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veriaktar(boga);
            }
        });
        akrep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veriaktar(akrep);
            }
        });kova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veriaktar(kova);
            }
        });koc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veriaktar(koc);
            }
        });basak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veriaktar(basak);
            }
        });
        terazi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veriaktar(terazi);
            }
        });yay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veriaktar(yay);
            }
        });oglak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veriaktar(oglak);
            }
        });
    }

    public void veriaktar(Button buton){
        Intent intent=new Intent(getApplicationContext(),Yorumlar.class);
        intent.putExtra("buttonn",buton.getText().toString());
        startActivity(intent);
    }
}