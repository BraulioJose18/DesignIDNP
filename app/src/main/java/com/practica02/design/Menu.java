package com.practica02.design;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.practica02.design.fragment.Adivice;
import com.practica02.design.fragment.Music;
import com.practica02.design.fragment.Profile;
import com.practica02.design.fragment.Run;
import com.practica02.design.fragment.Static;

public class Menu extends AppCompatActivity {

    BottomNavigationView mBottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        showSelectedFragment(new Profile());

        mBottomNavigation = (BottomNavigationView) findViewById(R.id.menu);

        mBottomNavigation.setSelectedItemId(R.id.item3);
        mBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId() == R.id.item1){
                    showSelectedFragment(new Run());
                }
                if(item.getItemId() == R.id.item2){
                    showSelectedFragment(new Profile());
                }
                if(item.getItemId() == R.id.item3){
                    showSelectedFragment(new Music());
                }
                if(item.getItemId() == R.id.item4){
                    showSelectedFragment(new Adivice());
                }
                if(item.getItemId() == R.id.item5){
                    showSelectedFragment(new Static());
                }

                return true;
            }
        });
    }
    private void showSelectedFragment (Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }
}