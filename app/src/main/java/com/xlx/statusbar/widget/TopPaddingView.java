package com.xlx.statusbar.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

import com.xlx.statusbar.BaseApp;


/** 布局顶部状态栏自动填充 View 适用于界面顶部背景穿透布局 */
public class TopPaddingView extends View {

    private int mHeight;

    public TopPaddingView(Context context) {
        super(context);
        initHeight();
    }

    public TopPaddingView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initHeight();
    }

    public TopPaddingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initHeight();
    }

    public TopPaddingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initHeight();
    }

    private void initHeight() {
        mHeight = getStatusBarHeight();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(widthMeasureSpec, mHeight);
    }

    /** 获取状态栏高度 */
    public int getStatusBarHeight() {
        int sbHeight = dpToPx(24); // 默认高度24dp
        try {
            int resourceId = BaseApp.getI().getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (resourceId > 0)
                sbHeight = BaseApp.getI().getResources().getDimensionPixelSize(resourceId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sbHeight;
    }

    /** dp 转为 像素 ： 适用于控件单位 */
    public int dpToPx(int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, Resources.getSystem().getDisplayMetrics());
    }

}
