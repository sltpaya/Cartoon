package org.sltpaya.cartoon.adapter.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Author: SLTPAYA
 * Date: 2017/2/28
 */
public class CollectPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> fragments;
    private String[] titles;

    public CollectPagerAdapter(FragmentManager fm, String[] titles,
                               ArrayList<Fragment> fragments) {
        super(fm);
        this.titles = titles;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}
