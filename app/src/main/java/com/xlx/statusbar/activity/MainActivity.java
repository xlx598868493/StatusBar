package com.xlx.statusbar.activity;



import android.content.Intent;
import android.view.View;

import com.xlx.statusbar.R;

public class MainActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {
        findViewById(R.id.bt_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PictureImmerseActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.bt_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ColorImmerseActivity.class);
                startActivity(intent);
            }
        });
    }
}
