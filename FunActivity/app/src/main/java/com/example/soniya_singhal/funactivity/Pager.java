package com.example.soniya_singhal.funactivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Soniya_Singhal on 1/22/2018.
 */

public class Pager extends FragmentStatePagerAdapter {
int  tabCount;
    public Pager(FragmentManager fm, int tabCount){
        super(fm);
        this.tabCount=tabCount;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                SportsFragment sportsFragment=new SportsFragment();
                return  sportsFragment;
            case 1:
                TechnologiesFragment technologiesFragment= new TechnologiesFragment();
                return technologiesFragment;
            case 2:
                MoviesFragment moviesFragment=new MoviesFragment();
                return moviesFragment;
            case 3:
                DesignFragment designFragment=new DesignFragment();
                return designFragment;
            case 4:
                PoliticsFragment politicsFragment=new PoliticsFragment();
                return politicsFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
