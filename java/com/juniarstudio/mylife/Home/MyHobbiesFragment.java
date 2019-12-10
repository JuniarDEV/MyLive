package com.juniarstudio.mylife.Home;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.juniarstudio.mylife.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyHobbiesFragment extends Fragment {


    public MyHobbiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_hobbies, container, false);
    }

}
