package com.example.baitap13_10.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Adapter extends FragmentStatePagerAdapter {
    public Adapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new home();
            case 1:
                return new video();
            case 2:
                return new user();
            default:
                return new home();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
