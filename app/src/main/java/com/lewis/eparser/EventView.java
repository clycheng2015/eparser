package com.lewis.eparser;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.lewis.eventparser.EventParser;
import com.lewis.eventparser.OnEventListener;

/**
 * 项目名称：EParser
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2019-01-07
 *
 * @version ${VSERSION}
 */

public class EventView extends View {
    private EventParser mEventParser;
    private OnEventListener mOnEventListener;

    public void setOnEventListener(OnEventListener onEventListener) {
        mOnEventListener = onEventListener;
    }

    public EventView(Context context) {
        this(context, null);
    }

    public EventView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mEventParser = new EventParser();//初始化EventParser

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mEventParser.parseEvent(event);//设置解析对象
        //为EventParser设置监听器
        if(mOnEventListener!=null){
            mEventParser.setOnEventListener(mOnEventListener);
        }
        return true;
    }
}