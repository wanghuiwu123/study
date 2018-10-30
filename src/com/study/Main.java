package com.study;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试工具类
 * @author whw
 */
public class Main
{
    public static void main(String[] args)
    {
        String format = "yyyy-MM-dd HH:mm:dd";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        System.out.println(sdf.format(new Date()));
    }
}
