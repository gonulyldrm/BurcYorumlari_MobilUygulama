package com.example.burclar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteOpenHelper {
    private static final String veritabaniad="veritabani";
    private static final int  versionn=1;


    public Database( Context context) {
        super(context,veritabaniad,null, versionn);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE editorler(kullaniciadi text,sifre Text);");
        db.execSQL("CREATE TABLE burclargunluk(id int,aslan Text,ikizler Text,balik Text , yengec Text,boga Text,akrep Text,kova Text, koc Text,basak Text,terazi Text,yay Text,oglak Text);");
        db.execSQL("CREATE TABLE burclaraylik(id int,aslan Text,ikizler Text,balik Text , yengec Text,boga Text,akrep Text,kova Text, koc Text,basak Text,terazi Text,yay Text,oglak Text);");
        db.execSQL("CREATE TABLE burclaryillik(id int,aslan Text,ikizler Text,balik Text , yengec Text,boga Text,akrep Text,kova Text, koc Text,basak Text,terazi Text,yay Text,oglak Text);");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE İF EXİSTS editorler");
        db.execSQL("DROP TABLE İF EXİSTS  burclargunluk");
        db.execSQL("DROP TABLE İF EXİSTS  burclaraylik");
        db.execSQL("DROP TABLE İF EXİSTS  burclaryillik");

        onCreate(db);
    }
    public Boolean editorekle(String kullaniciad,String sifre){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues val=new ContentValues();

        val.put("kullaniciadi", kullaniciad);
        val.put("sifre",sifre);

        long result =db.insert("editorler",null,val);
        if (result==-1) return false;
        else
            return true;
    }
    public Boolean kullaniciadsifrekontrol(String kullaniciadi,String sifre){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("select * from editorler where kullaniciadi = ? and sifre = ?",new String[] {kullaniciadi,sifre});
        if (cursor.getCount()>0) return true;
        else {
            return false;
        }
    }

    public Boolean yorumeklegun(int id,String aslan,String ikizler,String balik,String yengec,String boga,String akrep,String kova,String koc,String basak,String terazi,String yay,String oglak){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues val=new ContentValues();

        val.put("id",id);
        val.put("aslan",aslan);
        val.put("ikizler",ikizler);
        val.put("balik",balik);
        val.put("yengec",yengec);
        val.put("boga",boga);
        val.put("akrep",akrep);
        val.put("kova",kova);
        val.put("koc",koc);
        val.put("basak",basak);
        val.put("terazi",terazi);
        val.put("yay",yay);
        val.put("oglak",oglak);

        long result =db.insert("burclargunluk",null,val);
        if (result==-1) return false;
        else
            return true;
    }
    public Boolean yorumekleay(int id,String aslan,String ikizler,String balik,String yengec,String boga,String akrep,String kova,String koc,String basak,String terazi,String yay,String oglak){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues val=new ContentValues();

        val.put("id",id);
        val.put("aslan",aslan);
        val.put("ikizler",ikizler);
        val.put("balik",balik);
        val.put("yengec",yengec);
        val.put("boga",boga);
        val.put("akrep",akrep);
        val.put("kova",kova);
        val.put("koc",koc);
        val.put("basak",basak);
        val.put("terazi",terazi);
        val.put("yay",yay);
        val.put("oglak",oglak);

        long result =db.insert("burclaraylik",null,val);
        if (result==-1) return false;
        else
            return true;
    }
    public Boolean yorumekleyil(int id,String aslan,String ikizler,String balik,String yengec,String boga,String akrep,String kova,String koc,String basak,String terazi,String yay,String oglak){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues val=new ContentValues();

        val.put("id",id);
        val.put("aslan",aslan);
        val.put("ikizler",ikizler);
        val.put("balik",balik);
        val.put("yengec",yengec);
        val.put("boga",boga);
        val.put("akrep",akrep);
        val.put("kova",kova);
        val.put("koc",koc);
        val.put("basak",basak);
        val.put("terazi",terazi);
        val.put("yay",yay);
        val.put("oglak",oglak);

        long result =db.insert("burclaryillik",null,val);
        if (result==-1) return false;
        else
            return true;
    }
    public Boolean kullanicikontrol(String kullaniciadi){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("select * from editorler where kullaniciadi=?",new String[]{kullaniciadi});
        if (cursor.getCount()>0) return true;
        else
            return false;
    }

    public List<String> kayitgooster(int id,String secilenburc){
        List<String> veri =new ArrayList<String>();
        SQLiteDatabase db=this.getWritableDatabase() ;
        String sql="select g."+secilenburc+" from burclargunluk g where id="+id+" and "+secilenburc+" = "+secilenburc;
        Cursor cursor= db.rawQuery(sql,null);
        while (cursor.moveToNext()){
            veri.add(cursor.getString(0));
        }
        return veri ;
    }
    public List<String> kayitgooster2(int id,String secilenburc){
        List<String> veri =new ArrayList<String>();
        SQLiteDatabase db=this.getWritableDatabase() ;
        String sql="select a."+secilenburc+" from burclaraylik a where id="+id+" and "+secilenburc+" = "+secilenburc;
        Cursor cursor= db.rawQuery(sql,null);
        while (cursor.moveToNext()){
            veri.add(cursor.getString(0));
        }
        return veri ;
    }
    public List<String> kayitgooster3(int id,String secilenburc){
        List<String> veri =new ArrayList<String>();
        SQLiteDatabase db=this.getWritableDatabase() ;
        String sql="select y."+secilenburc+" from burclaryillik y where id="+id+" and "+secilenburc+" = "+secilenburc;
        Cursor cursor= db.rawQuery(sql,null);
        while (cursor.moveToNext()){
            veri.add(cursor.getString(0));
        }
        return veri ;
    }
}
