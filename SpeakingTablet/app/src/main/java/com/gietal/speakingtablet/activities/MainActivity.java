package com.gietal.speakingtablet.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.gietal.speakingtablet.fragments.MainFragment;
import com.gietal.speakingtablet.fragments.MainHeaderFragment;
import com.gietal.speakingtablet.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();

        // this tries to get an existing fragment
        MainFragment mainFragment = (MainFragment)fm.findFragmentById(R.id.mainContainer);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();
            fm.beginTransaction().add(R.id.mainContainer, mainFragment).commit();
        }

        MainHeaderFragment headerFragment = (MainHeaderFragment)fm.findFragmentById(R.id.headerContainer);
        if (headerFragment == null) {
            headerFragment = new MainHeaderFragment();
            fm.beginTransaction().add(R.id.headerContainer, headerFragment).commit();
        }
    }
}
