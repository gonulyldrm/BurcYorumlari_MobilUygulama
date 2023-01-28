package com.example.burclar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class editorGirisi extends AppCompatActivity {

    EditText kullaniciad,sifre;
    Button girisyap,kayitol;
    Database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor_girisi);

        db=new Database(this);

        girisyap=(Button)findViewById(R.id.girisyap);
        kayitol=(Button)findViewById(R.id.kayitol);
        kullaniciad=(EditText)findViewById(R.id.kullaniciad);
        sifre=(EditText)findViewById(R.id.sifre);

        kayitol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kullaniciadii=kullaniciad.getText().toString();
                String sifree =sifre.getText().toString();
                if (sifree.equals("") ||kullaniciadii.equals(""))
                    Toast.makeText(editorGirisi.this,"alanlar boş bırakılamaz...!!!",Toast.LENGTH_LONG).show();
                else {

                        Boolean insert = db.editorekle(kullaniciadii, sifree);
                        if (insert = true) {
                            Toast.makeText(editorGirisi.this, "başarıyla kaydolundu....! ", Toast.LENGTH_LONG).show();
                            Intent sayfagiris = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(sayfagiris);
                        } else {
                            Toast.makeText(editorGirisi.this, "kayıt başarız oldu...! ", Toast.LENGTH_LONG).show();

                        }
                    }
                }

        });
        girisyap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernamee=kullaniciad.getText().toString();
                String passwordd=sifre.getText().toString();
                Boolean kontrolkullanicisifre=db.kullaniciadsifrekontrol(usernamee,passwordd);
                if (kontrolkullanicisifre)
                {
                    Toast.makeText(editorGirisi.this,"Giriş Başarılı....!!!!",Toast.LENGTH_LONG).show();
                    Intent sayfagiris= new Intent(getApplicationContext(),Yorumyaz.class);
                    startActivity(sayfagiris);
                }
                else{
                    Toast.makeText(editorGirisi.this,"Giriş Başarısız....!!!!",Toast.LENGTH_LONG).show();

                }

            }
        });


    }
}