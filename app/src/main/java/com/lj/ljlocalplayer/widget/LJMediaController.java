package com.lj.ljlocalplayer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.MediaController;

/**
 * Created by Administrator on 2017/4/12 0012.
 */

public class LJMediaController extends MediaController {

    public LJMediaController(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LJMediaController(Context context, boolean useFastForward) {
        super(context, useFastForward);
    }

    public LJMediaController(Context context) {
        super(context);
    }
}
