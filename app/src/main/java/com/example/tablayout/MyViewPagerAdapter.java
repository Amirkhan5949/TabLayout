package com.example.tablayout;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyViewPagerAdapter extends FragmentPagerAdapter {
    public MyViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new HomeFragment();

            case 1:
                return new BookmarkFragment();

            case 2:
                return new HomeFragment();
                default:
            return null;
        }


    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
         switch (position){
             case 0:
                 return "Home";
             case 1:
                 return "Bookmark";
             case 2:
                 return "History";
                 default:

                 return null;
         }
    }
}


