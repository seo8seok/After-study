package com.example.choisc.placefragments.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.choisc.placefragments.R;
import com.example.choisc.placefragments.fragments.dynamic.BottomFragment;
import com.example.choisc.placefragments.fragments.dynamic.MidFragment;
import com.example.choisc.placefragments.fragments.dynamic.TopFragment;

public class DynamicPlacementActivity extends AppCompatActivity {

    // UI 변수들.
    /*private Button mFirstPlacementButton;
    private Button mSecondPlacementButton;
    private Button mThirdPlacementButton;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_placement);

        // 버튼 생성
        /*mFirstPlacementButton = (Button) findViewById(R.id.dynamic_first_button);
        mSecondPlacementButton = (Button) findViewById(R.id.dynamic_second_button);
        mThirdPlacementButton = (Button) findViewById(R.id.dynamic_third_button);*/

    }

    // 버튼을 XML의 onClick으로 구현 했을 때.
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.dynamic_first_button:
                // Fragment의 Layout만 표시할 것이기 때문에, 빈 생성자를 통해서 new로 Fragment를 생성.
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.dynamic_top_layout, new TopFragment()).commit();
                Toast.makeText(this, "1번 프래그먼트 생성완료!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.dynamic_second_button:
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.dynamic_mid_layout, new MidFragment()).commit();
                Toast.makeText(this, "2번 프래그먼트 생성완료!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.dynamic_third_button:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.dynamic_bottom_layout, new BottomFragment()).commit();
                Toast.makeText(this, "3번 프래그먼트 생성완료!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    // 버튼을 setOnClickListener로 구현 했을 때.
     /*@Override
    protected void onStart() {
        super.onStart();
        mFirstPlacementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.dynamic_top_layout, new TopFragment()).commit();
            }
        });
        mSecondPlacementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.dynamic_mid_layout, new MidFragment()).commit();
            }
        });
        mThirdPlacementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.dynamic_bottom_layout, new BottomFragment()).commit();
            }
        });*/
}
