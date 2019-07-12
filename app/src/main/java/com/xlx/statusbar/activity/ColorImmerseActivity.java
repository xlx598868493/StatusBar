package com.xlx.statusbar.activity;

import com.xlx.statusbar.R;
import com.xlx.statusbar.statusbar.StatusBarUtil;

/**
 * 版权：智慧式控股公司 版权所有
 *
 * @author SweepingMonk
 * 版本：1.0
 * 创建日期：2019/7/12 09
 * 描述：
 */
public class ColorImmerseActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_color_immserse;
    }

    @Override
    public void initData() {
        StatusBarUtil.setStatusBarDarkTheme(this,false);
        StatusBarUtil.setStatusBarColor(this,getResources().getColor(R.color.C_FAD223));
    }
}
