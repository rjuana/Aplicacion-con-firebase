package com.jhon.webservices.menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.jhon.webservices.R;

public class ActivityAbout extends AppCompatActivity {
    TextView about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        /*setContentView(R.layout.activity_mis_contactos);
        Toolbar tootb = findViewById(R.id.actionbar);
        setSupportActionBar(tootb);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tootb.setLogo(R.drawable.pataperro);
        about = findViewById(R.id.about);*/
    }
}