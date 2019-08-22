package com.hjl.artisan.tool.view.ActualMeasurement;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import com.hjl.artisan.R;
import razerdp.basepopup.BasePopupWindow;

public class SelectFlooerPop extends BasePopupWindow {
    public SelectFlooerPop(Context context) {
        super(context);
        setBlurBackgroundEnable(true);
        setPopupGravity(Gravity.BOTTOM);
    }
    @Override
    protected Animation onCreateShowAnimation() {
        return getTranslateVerticalAnimation(1f, 0, 250);
    }

    @Override
    protected Animation onCreateDismissAnimation() {
        return getTranslateVerticalAnimation(0, 1f, 250);
    }

    @Override
    public View onCreateContentView() {
        return createPopupById(R.layout.dialog_selectfooler);
    }

}
