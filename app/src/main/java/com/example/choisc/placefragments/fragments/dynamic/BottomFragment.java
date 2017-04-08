package com.example.choisc.placefragments.fragments.dynamic;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.choisc.placefragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment {


    public BottomFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Fragment 의 view를 리턴하는 곳.
        return inflater.inflate(R.layout.fragment_bottom, container, false);
    }

}
