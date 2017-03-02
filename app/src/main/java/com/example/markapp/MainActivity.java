package com.example.markapp;

import android.media.MediaPlayer;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //media player objects
    MediaPlayer kylo1;
    MediaPlayer kylo2;
    MediaPlayer kylo3;
    MediaPlayer kylo4;
    MediaPlayer kylo5;
    MediaPlayer kylo6;
    MediaPlayer kylo7;
    MediaPlayer kiritsugu1;
    MediaPlayer kiritsugu2;
    MediaPlayer kiritsugu3;
    MediaPlayer kiritsugu4;
    MediaPlayer mayuri1;
    MediaPlayer mayuri2;
    MediaPlayer mayuri3;
    MediaPlayer yuno1;

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create kylo ren media players
        kylo1 = MediaPlayer.create(this, R.raw.darkside);
        kylo2 = MediaPlayer.create(this, R.raw.guest);
        kylo3 = MediaPlayer.create(this, R.raw.whativecomefor);
        kylo4 = MediaPlayer.create(this, R.raw.takewhateveriwant);
        kylo5 = MediaPlayer.create(this, R.raw.lightsaber);
        kylo6 = MediaPlayer.create(this, R.raw.ifeelitagain);
        kylo7 = MediaPlayer.create(this, R.raw.darkness);

        //create kiritsugu media players
        kiritsugu1 = MediaPlayer.create(this, R.raw.doubleaccel);
        kiritsugu2 = MediaPlayer.create(this, R.raw.tripleaccel);
        kiritsugu3 = MediaPlayer.create(this, R.raw.squareaccel);
        kiritsugu4 = MediaPlayer.create(this, R.raw.triplestagnate);

        //create yuno media players
        yuno1 = MediaPlayer.create(this, R.raw.yuki);

        //create mayuri media players
        mayuri1 = MediaPlayer.create(this, R.raw.tuturu);
        mayuri2 = MediaPlayer.create(this, R.raw.juicy_chicken);
        mayuri3 = MediaPlayer.create(this, R.raw.chickentenders);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "I love you -Aoife", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    //play sounds
    public void kylo1 (View view){
        kylo1.start();
    }
    public void kylo2 (View view){
        kylo2.start();
    }
    public void kylo3 (View view){
        kylo3.start();
    }
    public void kylo4 (View view){
        kylo4.start();
    }
    public void kylo5 (View view){
        kylo5.start();
    }
    public void kylo6 (View view){
        kylo6.start();
    }
    public void kylo7 (View view){
        kylo7.start();
    }
    public void kiritsugu1 (View view){
        kiritsugu1.start();
    }
    public void kiritsugu2 (View view){
        kiritsugu2.start();
    }
    public void kiritsugu3 (View view){
        kiritsugu3.start();
    }
    public void kiritsugu4 (View view){
        kiritsugu4.start();
    }
    public void yuno1 (View view){
        yuno1.start();
    }
    public void mayuri1 (View view){
        mayuri1.start();
    }
    public void mayuri2 (View view){
        mayuri2.start();
    }
    public void mayuri3 (View view){
        mayuri3.start();
    }

/*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
    //deleted PlaceholderFragment class
    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    tab1kylo tab1 = new tab1kylo();
                    return tab1;
                case 1:
                    tab2kiritsugu tab2 = new tab2kiritsugu();
                    return tab2;
                case 2:
                    tab3yuno tab3 = new tab3yuno();
                    return tab3;
                case 3:
                    tab4mayuri tab4 = new tab4mayuri();
                    return tab4;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "KYLO REN";
                case 1:
                    return "KIRITSUGU";
                case 2:
                    return "YUNO";
                case 3:
                    return "MAYURI";
            }
            return null;
        }
    }
}
