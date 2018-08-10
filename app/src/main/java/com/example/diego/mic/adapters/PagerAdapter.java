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

    private String[] titles = {"l i b r a r y","r e c o r d"};

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = FileViewerFragment.newInstance(position);
                break;
            case 1:
                fragment = RecordFragment.newInstance(position);
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
