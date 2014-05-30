package com.project.tabswithswipe.fragments;

import com.project.tabswithswipe.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
 * Movies fragment
 */
public class PersonalVideosFragment extends Fragment {
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_personalvideos, container, false);
         
        return rootView;
    }
}
