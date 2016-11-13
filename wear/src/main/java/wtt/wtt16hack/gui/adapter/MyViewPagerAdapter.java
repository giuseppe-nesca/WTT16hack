package wtt.wtt16hack.gui.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import wtt.wtt16hack.gui.frag.CustomFragment;

/**
 * Created by Davide on 12/11/2016.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    private final List<CustomFragment> mFragments = new ArrayList<>();
    private final List<String> mFragmentTitles = new ArrayList<>();
    private List<String> myText;


    public MyViewPagerAdapter(FragmentManager fm, List<String> text) {
        super(fm);
        myText = text;
    }


    @Override
    public Fragment getItem(int position) {
        CustomFragment fragment = new CustomFragment();
        if(position == 0)
            fragment.setMyText(myText.get(position));
        else
            fragment.setMyText("");
        fragment.setPosition(position);

        return fragment;
    }

    @Override
    public int getCount() {
        return myText.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitles.get(position);
    }

}
