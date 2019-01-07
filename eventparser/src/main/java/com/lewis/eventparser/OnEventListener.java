package com.lewis.eventparser;

import android.graphics.PointF;

/**
 * 项目名称：EParser
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2019-01-07
 *
 * @version ${VSERSION}
 */

public interface OnEventListener {
    /**
     * 点击
     *
     * @param pointF 落点
     */
    void down(PointF pointF);

    /**
     * 抬起
     *
     * @param pointF      抬起点
     * @param orientation 方向
     */
    void up(PointF pointF, Orientation orientation);

    /**
     * 移动
     *
     * @param v           速度
     * @param dy          y 位移
     * @param dx          x位移
     * @param dir         角度
     * @param orientation 方向
     */
    void move(double v, float dy, float dx, double dir, Orientation orientation);

}
