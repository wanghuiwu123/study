package com.study.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 * @author whw
 */
public class DateUtil
{
    public static String getCurenntTime()
    {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
