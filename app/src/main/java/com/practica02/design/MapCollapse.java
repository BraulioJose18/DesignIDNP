package com.practica02.design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class MapCollapse extends AppCompatActivity {
    
     Toolbar toolbar;
     Toolbar custom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_collapse);

        //toolbar = (Toolbar) findViewById(R.id.toolbar);
        custom = (Toolbar) findViewById(R.id.c_toolbar);
        setSupportActionBar(custom);

        
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            //getSupportActionBar().hide();
            //setSupportActionBar(custom);
        }
    }

}