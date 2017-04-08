package com.example.choisc.placefragments.fragments.factory;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.choisc.placefragments.R;

public class FactoryFragment extends Fragment {

    // 이 키를 사용하지 않고, 밑에 직접 입력했음.
    /*private static final String ARG_PARAM1 = "param1";*/

    // 액티비티에서 받아온 값이 되는 필드 변수.
    private int mCounter;
    private TextView mTextView;


    public FactoryFragment() {
        // Required empty public constructor
    }

    // Activity 로 부터 값을 받아, 자신을 생성해서 return.
    // 이 static 메소드가 받는 값을 자신이 원하는대로 수정해야 합니다.
    public static FactoryFragment newInstance(int count) {
        FactoryFragment fragment = new FactoryFragment();
        Bundle args = new Bundle();

        // Map 형태를 띄고 있음. 키/값
        args.putInt("String Key", count);
        // 수정 해야할 부분.

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // factory 메소로 newinstance해서 생성된 경우, Argument에 값이 존재합니다.
        // 그때 null체크를 하여, 필드변수에 받은 값을 대입합니다.
        if (getArguments() != null) {
            mCounter = getArguments().getInt("String Key");
        } else {
            mCounter = 0;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 뷰 리턴.
        return inflater.inflate(R.layout.fragment_factory, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTextView = (TextView) view.findViewById(R.id.factory_fragment_text_view);
    }

    @Override
    public void onStart() {
        super.onStart();
        // 액티비티로 받아온 값을 표시.
        mTextView.setText(String.valueOf(mCounter));
    }
}
