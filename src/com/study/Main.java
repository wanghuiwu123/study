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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(new Date()));
    }
}
