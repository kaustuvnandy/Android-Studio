package com.kaustuv.viewpagerlive;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final String[] PAGE_TITLES=new String[4];
    public ViewPagerAdapter(FragmentManager fm){
        super(fm);
        PAGE_TITLES[0]="Page 1";
        PAGE_TITLES[1]="Page 2";
        PAGE_TITLES[2]="Page 3";
        PAGE_TITLES[3]="Page 4";

    }
    @Override
    public Fragment getItem(int position)
    {
        switch(position){
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();
            case 3:
                return new Fragment4();
            default:
                return null;
        }
    }

    @Override
    public int getCount(){
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return PAGE_TITLES[position];
    }
}
