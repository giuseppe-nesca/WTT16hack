package wtt.wtt16hack.gui.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.wearable.view.CardFragment;
import android.support.wearable.view.FragmentGridPagerAdapter;

import java.util.ArrayList;

import wtt.wtt16hack.R;
import wtt.wtt16hack.io.SimplePage;
import wtt.wtt16hack.io.SimpleRow;

/**
 * Created by Davide on 12/11/2016.
 */

public class SampleGridPagerAdapter extends FragmentGridPagerAdapter {

    private final Context mContext;
    private ArrayList<SimpleRow> mPages;

    public SampleGridPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        initPages();
    }

    private void initPages() {


        mPages = new ArrayList<SimpleRow>();

        SimpleRow row1 = new SimpleRow();
        row1.addPages(new SimplePage("Monitoring", "Monitoring text", R.drawable.ic_full_cancel, R.color.ColorPrimaryDark));
        row1.addPages(new SimplePage("Gesture", "Gesture Text", R.drawable.ic_full_cancel, R.color.ColorPrimaryDark));
        row1.addPages(new SimplePage("Monitoring 2", "Monitoring text 2", R.drawable.ic_launcher, R.color.ColorPrimaryDark));

        //SimpleRow row2 = new SimpleRow();
        //row2.addPages(new SimplePage("Gesture", "Gesture Text", R.drawable.ic_full_cancel, R.drawable.close_button));

        mPages.add(row1);
       // mPages.add(row2);
    }

    @Override
    public Fragment getFragment(int row, int col) {
        SimplePage page = ((SimpleRow)mPages.get(row)).getPages(col);
        CardFragment fragment = CardFragment.create(page.mTitle, page.mText, page.mIconId);
            fragment = CardFragment.create(page.mTitle, page.mText, page.mBackgroundId);
        return fragment;
    }

    @Override
    public Drawable getBackgroundForPage(int row, int column) {
        Drawable drawable = mContext.getResources().getDrawable(R.color.ColorPrimaryDark);
        return drawable;
    }


    @Override
    public int getRowCount() {
        return mPages.size();
    }

    @Override
    public int getColumnCount(int row) {
        return mPages.get(row).size();
    }

}