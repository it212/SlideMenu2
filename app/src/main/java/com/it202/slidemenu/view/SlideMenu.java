package com.it202.slidemenu.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lrf on 2017/4/1.
 */

public class SlideMenu extends ViewGroup {

    private View mainView;
    private View menuView;

    public SlideMenu(Context context) {
        super(context);
          init();
    }

    public SlideMenu(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private void init() {

    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mainView = getChildAt(1);
        menuView = getChildAt(0);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mainView.measure(widthMeasureSpec, heightMeasureSpec);
        menuView.measure(menuView.getLayoutParams().width, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        mainView.layout(l, t, r, b);
        menuView.layout(-menuView.getLayoutParams().width,0, 0,b);
    }
}
