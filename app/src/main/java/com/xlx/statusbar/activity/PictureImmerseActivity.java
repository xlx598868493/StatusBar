package com.xlx.statusbar.activity;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.view.ActionMode;
import android.util.Log;
import android.widget.ImageView;

import com.xlx.statusbar.BaseApp;
import com.xlx.statusbar.R;
import com.xlx.statusbar.statusbar.StatusBarUtil;

import java.util.Random;

/**
 * 版权：智慧式控股公司 版权所有
 *
 * @author SweepingMonk
 * 版本：1.0
 * 创建日期：2019/7/10 20
 * 描述：
 */
public class PictureImmerseActivity extends BaseActivity{
    ImageView image;
    int[] colors = {R.color.colorAccent,R.color.colorPrimary,R.color.C_FAD223,R.color.C_FF868D,R.color.orange};
    @Override
    public int getLayoutId() {
        return R.layout.activity_picture_immerse;
    }

    @Override
    public void initData() {
        StatusBarUtil.setRootViewFitsSystemWindows(this,false);
        StatusBarUtil.setStatusBarDarkTheme(this,false);
        image = findViewById(R.id.image);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    SystemClock.sleep(3000);
                    BaseApp.getI().mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            int rand = new Random().nextInt(colors.length);
                            Log.e("run","------"+rand);
                            image.setBackgroundColor(colors[rand]);
                        }
                    });
                }

            }
        }).start();
    }

    @Nullable
    @Override
    public ActionMode onWindowStartingSupportActionMode(@NonNull ActionMode.Callback callback) {
        return super.onWindowStartingSupportActionMode(callback);
    }

}
