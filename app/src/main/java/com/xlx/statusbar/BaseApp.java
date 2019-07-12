package com.xlx.statusbar;

import android.app.Application;
import android.os.Handler;

/**
 * 版权：智慧式控股公司 版权所有
 *
 * @author SweepingMonk
 * 版本：1.0
 * 创建日期：2019/7/10 20
 * 描述：
 */
public class BaseApp extends Application {
    private static BaseApp mBaseApp; // 本类实例
    public Handler mHandler; // 公共单例Handler

    public BaseApp() {
        mBaseApp = this;
        mHandler = new Handler();
    }
    /** 获取 BaseApp 的实例 */
    public static BaseApp getI() {
        return mBaseApp;
    }
}
