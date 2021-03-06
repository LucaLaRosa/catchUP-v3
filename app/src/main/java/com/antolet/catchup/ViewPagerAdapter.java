package com.antolet.catchup;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter{

	private String[] tabsTitles;

    public ViewPagerAdapter(FragmentManager fm, String[] tabsTitles) {
		super(fm);
        this.tabsTitles = tabsTitles;
	}

    @Override
    public CharSequence getPageTitle(int position) {
        return tabsTitles[position];
    }

    @Override
	public Fragment getItem(int index) {
		switch(index) {
		case 0:
			return new FirstFragment();
		//da qui in poi cambiare con i nuovi fragment "nearby, points..."
		case 1:
			return new NearbyFragment();
		case 2:
			return new ThirdFragment();
		case 3:
			return new FourthFragment();
		case 4:
			return new BlackFragment();


		}
		
		return null;
	}
	
	@Override
	public int getCount() {
        return tabsTitles.length;
	}
}
