package com.jhon.webservices.database;

import android.content.ContentValues;
import android.content.Context;

import com.jhon.webservices.R;
import com.jhon.webservices.pojo.Contacto;

import java.util.ArrayList;

public class Constructorcontactos {

    private static final int LIKE = 1;
    private Context context;
    public Constructorcontactos(Context context) {
        this.context = context;
    }
    public ArrayList<Contacto> obtenerdatos (){
     BaseDatos db = new BaseDatos(context);
     insertarcontactos(db);
     return db.obtenertodocontactos();
    }

    public void insertarcontactos(BaseDatos db) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE , "Otto");
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.m1);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE , "Lucy");;
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.m2);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE , "kely");
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.m3);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE , "Bruno");
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.m4);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE, "fox");
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.m5);
        db.insertarcontacto(contentValues);

        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE , "rex");
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.m6);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE , "pancho");;
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.m7);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE , "snow");
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.m8);
        db.insertarcontacto(contentValues);



    }

    public ArrayList<Contacto> obtenerfavoritos (){
        ArrayList<Contacto> mascotas = new ArrayList<>();
        BaseDatos db = new BaseDatos(context);
        db.obtenertodofavoritos();
        return db.obtenertodofavoritos();

    }
    public void darlike (Contacto contacto){
         BaseDatos db = new BaseDatos(context);
         ContentValues contentValues = new ContentValues();
         contentValues.put(ContanteBaseDatos.TABLE_LIKES_MASCOTAS_ID_CONTACTO, contacto.getId());
         contentValues.put(ContanteBaseDatos.TABLE_LIKES_MASCOTAS_NUMERO_LIKES, LIKE);
         db.insertarcontactolike(contentValues);
    }
    public int obtenerlikescontacto(Contacto contacto){
        BaseDatos db = new BaseDatos(context);
        return  db.obtenerlikescontacto(contacto);
    }
}
