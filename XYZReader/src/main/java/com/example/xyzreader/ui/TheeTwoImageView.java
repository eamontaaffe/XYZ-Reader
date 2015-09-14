package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

import com.android.volley.toolbox.NetworkImageView;

/**
 * Created by Eamon on 14/09/2015.
 */
public class TheeTwoImageView extends ImageView {
    private static final String LOG_TAG = DynamicHeightNetworkImageView.class.getSimpleName();

    public TheeTwoImageView(Context context) {
        super(context);
    }

    public TheeTwoImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TheeTwoImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int threeTwoHeight = MeasureSpec.getSize(widthSpec)*2/3;
        int threeTwoHeightSpec =
                MeasureSpec.makeMeasureSpec(threeTwoHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthSpec,threeTwoHeightSpec);
    }
}
