package wtt.wtt16hack.gui.act;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import wtt.wtt16hack.R;
import wtt.wtt16hack.gui.adapter.MyViewPagerAdapter;
import wtt.wtt16hack.gui.frag.CustomFragment;

/**
 * Created by Davide on 12/11/2016.
 */

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);

        //final GridViewPager mGridPager = (GridViewPager) findViewById(R.id.pager);
        //mGridPager.setAdapter(new SampleGridPagerAdapter(this, getFragmentManager()));
        final ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        List<String> text = new ArrayList<>();
        text.add("Monitoring");
        text.add("Gesture");
        text.add("Gesture 2");
        MyViewPagerAdapter mAdapter = new MyViewPagerAdapter(getSupportFragmentManager(), text);
        CustomFragment mScenarioFragment = new CustomFragment();
        CustomFragment mMonitoringFragment = new CustomFragment();

        viewPager.setAdapter(mAdapter);
    }
}
