package com.study;

import com.study.date.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试工具类
 * @author whw
 */
public class Main
{
    public static String tipInfo = "当前日期："; //日期提示语

    public static void main(String[] args)
    {
        System.out.println(tipInfo + DateUtil.getCurenntTime());
    }
}
