package com.project.tabswithswipe.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.project.tabswithswipe.fragments.*;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	/*
	 * Fragment selection
	 */
	@Override
	public Fragment getItem(int index) {
		
		switch(index){
		case 0:
			//MOVIES
			return new MoviesFragment();	
		case 1:
			//TV SHOWS
			return new TvShowsFragment();
		case 2:
			//PERSONAL VIDEOS
			return new PersonalVideosFragment();
		}
		return null;
	}

	/*
	 * Return the item count which is equal to the number of tabs 
	 */
	@Override
	public int getCount() {
		return 3;
	}

}
