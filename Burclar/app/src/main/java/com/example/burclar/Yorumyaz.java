package com.example.burclar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Yorumyaz extends AppCompatActivity {

    EditText id,aslan ,ikizler,balik,yengec,boga,akrep,kova,koc,basak,terazi,yay,oglak;
    Database db;
    Button gunlukkayit,aylikkayit,yillikkayit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yorumyaz);

        id=(EditText)findViewById(R.id.id);
        aslan=(EditText)findViewById(R.id.aslan);
        ikizler=(EditText)findViewById(R.id.ikizler);
        balik=(EditText)findViewById(R.id.balik);
        yengec=(EditText)findViewById(R.id.yengec);
        boga=(EditText)findViewById(R.id.boga);
        akrep=(EditText)findViewById(R.id.akrep);
        kova=(EditText)findViewById(R.id.kova);
        koc=(EditText)findViewById(R.id.koc);
        basak=(EditText)findViewById(R.id.basak);
        terazi=(EditText)findViewById(R.id.terazi);
        yay=(EditText)findViewById(R.id.yay);
        oglak=(EditText)findViewById(R.id.oglak);

        db=new Database(this);

        gunlukkayit=(Button)findViewById(R.id.gunlukkayit);
        aylikkayit=(Button)findViewById(R.id.aylikkayit);
        yillikkayit=(Button)findViewById(R.id.yillikkayit);
        gunlukkayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idd=id.getText().length();
                String aslann=aslan.getText().toString();
                String ikizlerr=ikizler.getText().toString();
                String balikk=balik.getText().toString();
                String yengecc=yengec.getText().toString();
                String bogaa=boga.getText().toString();
                String akrepp=akrep.getText().toString();
                String kovaa=kova.getText().toString();
                String kocc=koc.getText().toString();
                String basakk=basak.getText().toString();
                String terazii=terazi.getText().toString();
                String yayy=yay.getText().toString();
                String pglakk=oglak.getText().toString();

                Boolean insert = db.yorumeklegun(idd,aslann,ikizlerr,balikk,yengecc,bogaa,akrepp,kovaa,kocc,basakk,terazii,yayy,pglakk);
                if (insert = true) {
                    Toast.makeText(Yorumyaz.this, "başarıyla kaydolundu....! ", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(Yorumyaz.this, "kayıt başarız oldu...! ", Toast.LENGTH_LONG).show();

                }

            }
        });
        aylikkayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idd=id.getText().length();
                String aslann=aslan.getText().toString();
                String ikizlerr=ikizler.getText().toString();
                String balikk=balik.getText().toString();
                String yengecc=yengec.getText().toString();
                String bogaa=boga.getText().toString();
                String akrepp=akrep.getText().toString();
                String kovaa=kova.getText().toString();
                String kocc=koc.getText().toString();
                String basakk=basak.getText().toString();
                String terazii=terazi.getText().toString();
                String yayy=yay.getText().toString();
                String pglakk=oglak.getText().toString();

                Boolean insert = db.yorumekleay(idd,aslann,ikizlerr,balikk,yengecc,bogaa,akrepp,kovaa,kocc,basakk,terazii,yayy,pglakk);
                if (insert = true) {
                    Toast.makeText(Yorumyaz.this, "başarıyla kaydolundu....! ", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(Yorumyaz.this, "kayıt başarız oldu...! ", Toast.LENGTH_LONG).show();

                }

            }
        });
        yillikkayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idd=id.getText().length();
                String aslann=aslan.getText().toString();
                String ikizlerr=ikizler.getText().toString();
                String balikk=balik.getText().toString();
                String yengecc=yengec.getText().toString();
                String bogaa=boga.getText().toString();
                String akrepp=akrep.getText().toString();
                String kovaa=kova.getText().toString();
                String kocc=koc.getText().toString();
                String basakk=basak.getText().toString();
                String terazii=terazi.getText().toString();
                String yayy=yay.getText().toString();
                String pglakk=oglak.getText().toString();

                Boolean insert = db.yorumekleyil(idd,aslann,ikizlerr,balikk,yengecc,bogaa,akrepp,kovaa,kocc,basakk,terazii,yayy,pglakk);
                if (insert = true) {
                    Toast.makeText(Yorumyaz.this, "başarıyla kaydolundu....! ", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(Yorumyaz.this, "kayıt başarız oldu...! ", Toast.LENGTH_LONG).show();

                }

            }
        });


    }
}