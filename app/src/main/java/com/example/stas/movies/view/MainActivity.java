package com.example.stas.movies.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.stas.movies.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add project list fragment if this is first creation
        if (savedInstanceState == null) {
            MovieListFragment fragment = new MovieListFragment();

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment, MovieListFragment.TAG).commit();
        }
    }
}