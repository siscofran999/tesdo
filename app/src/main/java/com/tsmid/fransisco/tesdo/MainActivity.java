package com.tsmid.fransisco.tesdo;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import java.util.List;

import okhttp3.logging.HttpLoggingInterceptor;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mMainViewModel;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        mMainViewModel.getData().observe(this, new Observer<List<model>>() {
            @Override
            public void onChanged(@Nullable List<model> models) {
                Log.i(TAG, "onChanged: "+models.get(0).getSaleTeamId());
                // disini lu lempar lagi ke viewmodel buat request ke yang POST
            }
        });
    }
}
