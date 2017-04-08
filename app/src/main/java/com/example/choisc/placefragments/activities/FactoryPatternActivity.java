package com.example.choisc.placefragments.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.choisc.placefragments.R;
import com.example.choisc.placefragments.fragments.factory.FactoryFragment;

public class FactoryPatternActivity extends AppCompatActivity {

    // 버튼 파라미터
    /*private Button mPlusButton;
    private Button mMinusButton;
    private Button mSubmitButton;*/

    private int mCounter = 0;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_pattern);

        // 버튼 생성.
        /*mPlusButton = (Button) findViewById(R.id.factory_main_plus_button);
        mMinusButton = (Button) findViewById(R.id.factory_main_minus_button);
        mSubmitButton = (Button) findViewById(R.id.factory_main_submit_button);*/

        mTextView = (TextView) findViewById(R.id.factory_main_text_view);

    }

    // setOnClick
    /*@Override
    protected void onStart() {
        super.onStart();
        mPlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter++;
                mTextView.setText(String.valueOf(mCounter));
            }
        });

        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter--;
                mTextView.setText(String.valueOf(mCounter));
            }
        });

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.factory_main_bottom_layout, FactoryFragment.newInstance(mCounter)).commit();
            }
        });
    }*/

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.factory_main_plus_button:
                mCounter++;
                mTextView.setText(String.valueOf(mCounter));
                break;
            case R.id.factory_main_minus_button:
                mCounter--;
                mTextView.setText(String.valueOf(mCounter));
                break;
            case R.id.factory_main_submit_button:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.factory_main_bottom_layout, FactoryFragment.newInstance(mCounter)).commit();
                Toast.makeText(this, "프래그먼트를 재배치 하였습니다.", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
