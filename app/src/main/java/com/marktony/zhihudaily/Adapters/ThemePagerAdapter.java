package com.marktony.zhihudaily.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.marktony.zhihudaily.Entities.Themes;
import com.marktony.zhihudaily.UI.Fragments.PageFragment;

import java.util.List;

/**
 * Created by lizhaotailang on 2016/3/21.
 */
public class ThemePagerAdapter extends FragmentPagerAdapter {

    private List<Themes> list;
    private Context context;

    public ThemePagerAdapter(FragmentManager fm, Context context, List<Themes> list) {
        super(fm);
        this.list = list;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position).getName();
    }
}