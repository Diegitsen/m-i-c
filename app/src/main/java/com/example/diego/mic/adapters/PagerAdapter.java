package com.example.diego.mic.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.diego.mic.R;
import com.example.diego.mic.fragments.FileViewerFragment;
import com.example.diego.mic.fragments.RecordFragment;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {

    private String[] titles = {String.valueOf(R.string.library), String.valueOf(R.string.record)};

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = new FileViewerFragment();
                break;
            case 1:
                fragment = new RecordFragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
