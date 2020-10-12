package com.jhon.webservices;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.squareup.picasso.Picasso;

public class Mascotas extends AppCompatActivity {
    private static final String KEY_EXTRA_URL = "url";
    private static final String KEY_EXTRA_LIKES = "like";
    private ImageView imgFotoDetalle;
    private TextView tvLikesDetalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_mascota);

        Bundle extras = getIntent().getExtras();
        Toolbar tootb = findViewById(R.id.actionbar);
        setSupportActionBar(tootb);

        imgFotoDetalle = findViewById(R.id.imgFotoDetalle);
        String url   = extras.getString(KEY_EXTRA_URL);
        int likes    = extras.getInt(KEY_EXTRA_LIKES);
        tvLikesDetalle     = (TextView) findViewById(R.id.tvLikesDetalle);
        tvLikesDetalle.setText(String.valueOf(likes));
        Picasso.with(this)
                .load(url)
                .placeholder(R.drawable.m1)
                .into(imgFotoDetalle);
    }
  /*  public void llamar (View v)
    {
    String Tel = CTelefono.getText().toString();
        startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse(Tel)));
    }
    public void enviarcorreo(View v){
        String Correo = CCorreo.getText().toString();
        Intent email = new Intent(Intent.ACTION_SEND);
        email.setData(Uri.parse("mail to"));
        email.putExtra(Intent.EXTRA_EMAIL,Correo);
        email.setType("message/rfr822");
        startActivity(Intent.createChooser(email,"Email"));
    }*/
  public boolean onKeyDown (int keyCode, KeyEvent event) {

      if (keyCode == KeyEvent.KEYCODE_BACK){
          Intent intent= new Intent(this,MainActivity.class);
          startActivity(intent);
      }
      return super.onKeyDown(keyCode, event);
  }


}
