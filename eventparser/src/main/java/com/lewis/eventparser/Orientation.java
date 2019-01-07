package com.lewis.eventparser;

/**
 * 项目名称：EParser
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2019-01-07
 *
 * @version ${VSERSION}
 */

public enum Orientation {
    NO("无"),//无
    TOP("上"), //上
    BOTTOM("下"),//下
    LEFT("左"),//左
    RIGHT("右"),//右
    LEFT_TOP("左上"),// 左上
    RIGHT_TOP("右上"), // 右上
    LEFT_BOTTOM("左下"),//左下
    RIGHT_BOTTOM("右下");//右下

    private String or;

    Orientation(String or) {
        this.or = or;

    }

    public String value() {
        return or;
    }
}
