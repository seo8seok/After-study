package com.example.choisc.placefragments.fragments.dynamic;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.choisc.placefragments.R;


public class TopFragment extends Fragment {


    public TopFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Fragment 의 view를 리턴하는 곳.
        return inflater.inflate(R.layout.fragment_top, container, false);
    }

}
