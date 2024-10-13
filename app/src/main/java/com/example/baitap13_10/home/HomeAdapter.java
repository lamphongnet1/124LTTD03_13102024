package com.example.baitap13_10.home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.baitap13_10.fragment.home;
import com.example.baitap13_10.fragment.user;
import com.example.baitap13_10.fragment.video;

public class HomeAdapter extends FragmentStatePagerAdapter {
    public HomeAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new tab1();
            case 1:
                return new tab2();
            case 2:
                return new tab3();
            default:
                return new tab1();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Tin nóng";
            case 1:
                return "Thế giới";
            case 2:
                return "Pháp luật";
            default: return "Tin nóng";
        }
    }
}
