package com.example.burclar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class BurcHesapla extends AppCompatActivity {
    EditText gun ,ay,yil;
    Button hesaplaa;
    TextView sonuc;
    ImageView resimm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burc_hesapla);

        gun=(EditText)findViewById(R.id.gun);
        ay=(EditText)findViewById(R.id.ay);
        yil=(EditText)findViewById(R.id.yil);
        gun=(EditText)findViewById(R.id.gun);
        hesaplaa=(Button)findViewById(R.id.hesaplaa);
        sonuc=(TextView)findViewById(R.id.sonuc);

        resimm=(ImageView)findViewById(R.id.resimm);
        hesaplaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int gunn = Integer.parseInt( gun.getText().toString());
                int ayy = Integer.parseInt( ay.getText().toString());
                int yill =Integer.parseInt( yil.getText().toString());
                int a;

                if (yill % 4==0){
                    a=30;
                }
                else a=29;


                if (ayy == 1) {
                    if (gunn < 22) {
                        sonuc.setText("oglak");
                    }
                    else if(gunn>21 && gunn<31) sonuc.setText("kova");
                    else sonuc.setText("yanlis tarıh girdin...");
                }
                else if (ayy == 2) {
                    if (gunn < 20) {
                        sonuc.setText("kova");
                    }
                    else if(gunn>19 && gunn<a) sonuc.setText("balik");
                    else sonuc.setText("yanlis tarıh girdin...");

                }
                else if (ayy == 3) {
                    if (gunn < 21) {
                        sonuc.setText("balik");
                    }

                    else if(gunn>20 && gunn<31) sonuc.setText("koc");
                    else sonuc.setText("yanlis tarıh girdin...");

                } else if (ayy == 4) {
                    if (gunn < 21) {
                        sonuc.setText("koc");
                    }
                    else if(gunn>20 && gunn<31) sonuc.setText("boga");
                    else sonuc.setText("yanlis tarıh girdin...");

                }
                else if (ayy == 5) {
                    if (gunn < 22) {
                        sonuc.setText("boga");
                    }
                    else if(gunn>21 && gunn<31) sonuc.setText("ikizler");
                    else sonuc.setText("yanlis tarıh girdin...");

                }
                else if (ayy == 6) {
                    if (gunn < 23) {
                        sonuc.setText("ikizler");
                    }
                    else if(gunn>22 && gunn<31) sonuc.setText("yengec");
                    else sonuc.setText("yanlis tarıh girdin...");

                }
                else if (ayy == 7) {
                    if (gunn < 23) {
                        sonuc.setText("yengec");
                    }
                    else if(gunn>22 && gunn<31) sonuc.setText("aslan");
                    else sonuc.setText("yanlis tarıh girdin...");

                }
                else if (ayy == 8) {
                    if (gunn < 23) {
                        sonuc.setText("aslan");
                    }
                    else if(gunn>22 && gunn<31) sonuc.setText("basak");
                    else sonuc.setText("yanlis tarıh girdin...");

                }
                else if (ayy == 9) {
                    if (gunn < 23) {
                        sonuc.setText("basak");
                    }
                    else if(gunn>22 && gunn<31) sonuc.setText("terazi");
                    else sonuc.setText("yanlis tarıh girdin...");

                }
                else if (ayy == 10) {
                    if (gunn < 23) {
                        sonuc.setText("terazi");
                    }
                    else if(gunn>22 && gunn<31) sonuc.setText("akrep");
                    else sonuc.setText("yanlis tarıh girdin...");
                }
                else if (ayy == 11) {
                    if (gunn < 22) {
                        sonuc.setText("akrep");
                    }
                    else if(gunn>21 && gunn<31) sonuc.setText("yay");
                    else sonuc.setText("yanlis tarıh girdin...");

                } else if (ayy == 12) {
                    if (gunn < 22) {
                        sonuc.setText("yay");
                    }
                    else if(gunn>21 && gunn<31) sonuc.setText("oglak");
                    else sonuc.setText("yanlis tarıh girdin...");

                }
                else sonuc.setText("yanlış tarıh gırdınız");
                resimm.setImageResource(getResources().getIdentifier(sonuc.getText().toString(),"drawable",getPackageName()));

            }
        });

    }
}