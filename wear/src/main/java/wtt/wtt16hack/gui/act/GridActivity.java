package wtt.wtt16hack.gui.act;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import watch.nudge.gesturelibrary.AbstractGestureClientActivity;
import watch.nudge.gesturelibrary.GestureConstants;
import wtt.wtt16hack.R;
import wtt.wtt16hack.gui.adapter.MyViewPagerAdapter;
import wtt.wtt16hack.gui.frag.CustomFragment;

/**
 * Created by Davide on 12/11/2016.
 */

public class GridActivity extends AbstractGestureClientActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);

        //final GridViewPager mGridPager = (GridViewPager) findViewById(R.id.pager);
        //mGridPager.setAdapter(new SampleGridPagerAdapter(this, getFragmentManager()));
        final ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(mViewPager);
        setAmbientEnabled();
        setSubscribeWindowEvents(false);
    }

    private void setupViewPager(ViewPager viewPager){
        List<String> text = new ArrayList<>();
        text.add("Monitoring");
        text.add("Gesture");
        text.add("Gesture 2");
        MyViewPagerAdapter mAdapter = new MyViewPagerAdapter(getFragmentManager(), text);
        CustomFragment mScenarioFragment = new CustomFragment();
        CustomFragment mMonitoringFragment = new CustomFragment();

        viewPager.setAdapter(mAdapter);
    }

    @Override
    public ArrayList<GestureConstants.SubscriptionGesture> getGestureSubscpitionList() {
        ArrayList<GestureConstants.SubscriptionGesture> gestures = new ArrayList<GestureConstants.SubscriptionGesture>();
        gestures.add(GestureConstants.SubscriptionGesture.FLICK);
        gestures.add(GestureConstants.SubscriptionGesture.SNAP);
        gestures.add(GestureConstants.SubscriptionGesture.TWIST);

        return gestures;
    }

    @Override
    public boolean sendsGestureToPhone() {
        return true;
    }

    @Override
    public void onSnap() {
        Toast.makeText(this,"Snap it up",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFlick() {
        Toast.makeText(this,"Got a flick!",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onTwist() {
        Toast.makeText(this,"Just twist it",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onGestureWindowClosed() {
        Toast.makeText(this,"Gesture window closed.",Toast.LENGTH_LONG).show();
    }

    //These functions won't be called until you subscribe to the appropriate gestures.

    @Override
    public void onTiltX(float x) {
        throw new IllegalStateException("This function should not be called unless subscribed to TILT_X.");
    }

    @Override
    public void onTilt(float x, float y, float z) {
        throw new IllegalStateException("This function should not be called unless subscribed to TILT.");
    }
}
