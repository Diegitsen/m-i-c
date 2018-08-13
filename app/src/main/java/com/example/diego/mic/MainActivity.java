package com.example.diego.mic;

import android.Manifest;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.diego.mic.fragments.FileViewerFragment;
import com.example.diego.mic.fragments.RecordFragment;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    private static final int REQUEST_RECORD_AUDIO_PERMISSION = 200;
    private static final int REQUEST_WRITE_EXTERNAL_STORAGE = 112;

    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter pagerAdapter = new com.example.diego.mic.adapters.PagerAdapter(getSupportFragmentManager());

    // Requesting permission to RECORD_AUDIO
    private boolean permissionToRecordAccepted = false;
    private String [] permissions = {Manifest.permission.RECORD_AUDIO};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this, permissions, REQUEST_RECORD_AUDIO_PERMISSION);
        ActivityCompat.requestPermissions(this, permissions, REQUEST_WRITE_EXTERNAL_STORAGE);


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(pagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

/*
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case REQUEST_RECORD_AUDIO_PERMISSION:
                permissionToRecordAccepted  = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                break;
        }
        if (!permissionToRecordAccepted ) finish();

    }*/





}
