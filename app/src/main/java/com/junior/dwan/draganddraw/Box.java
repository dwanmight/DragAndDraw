package com.junior.dwan.draganddraw;

import android.graphics.PointF;

/**
 * Created by Might on 10.01.2017.
 */

public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin) {
        mOrigin = mCurrent = origin;
    }

    public void setCurrent(PointF curent) {
        mCurrent = curent;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public PointF getOrigin() {
        return mOrigin;
    }
}
