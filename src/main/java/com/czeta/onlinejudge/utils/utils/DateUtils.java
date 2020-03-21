package com.czeta.onlinejudge.utils.utils;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateUtils
 * @Description 时间工具类
 * @Author chenlongjie
 * @Date 2020/3/2 19:53
 * @Version 1.0
 */
@Slf4j
public class DateUtils {
    public static final String formatStr_yyyyMMddHHmmssS_ = "yyyyMMddHHmmss";
    public static final String formatStr_yyyyMMddHHmmssS = "yyyy-MM-dd HH:mm:ss.S";
    public static final String formatStr_yyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss";
    public static final String formatStr_yyyyMMddHHmm = "yyyy-MM-dd HH:mm";
    public static final String formatStr_yyyyMMddHH = "yyyy-MM-dd HH";
    public static final String formatStr_yyyyMMdd = "yyyy-MM-dd";
    public static final String formatStr_yyyy = "yyyy";
    public static final String formatStr_yyyy_MM_dd = "yyyyMMdd";
    public static final String formatStr_yyyyMMddDelimiter = "-";

    public static String getYYYYMMDDHHMMSS(Date date) {
        if (date == null){
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatStr_yyyyMMddHHmmss);
        String dateString = simpleDateFormat.format(date);
        return dateString;
    }

    public static Long getUnixTimeOfSecond(String date) {
        Date date1;
        try {
            date1 = new SimpleDateFormat(formatStr_yyyyMMddHHmmss).parse(date);
        } catch (ParseException ex) {
            log.error("Parse Time Error：{}", ex.getMessage());
            return Long.MAX_VALUE;
        }
        return date1.getTime() / 1000;
    }
}
