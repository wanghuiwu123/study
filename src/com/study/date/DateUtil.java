package com.study.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 * @author whw
 */
public class DateUtil
{
    /**
     * 获取当前日期（2018-09-09）
     * @return
     */
    public static String getCurenntTime()
    {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    /**
     * 获取指定格式的日期
     * @param format
     * @return
     */
    public static String getFormatTime(String format)
    {
        return new SimpleDateFormat(format).format(new Date());
    }
}
