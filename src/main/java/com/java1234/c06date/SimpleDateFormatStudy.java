package com.java1234.c06date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatStudy {

    public static void main(String[] args) throws ParseException {
        /**
         * SimpleDateFormat类：时间格式化类，
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //对Date类型的处理：将给定的 Date 格式成日期/时间字符串，并将结果附加到给定的 String
        Date date = new Date();
        String strDate = sdf.format(date);
        System.out.println(strDate);
        //对字符串的处理：：把String格式化成Date类型
        Date dateFromStr = sdf.parse("2019-02-28 00:00:00");

        System.out.println(dateFromStr.getTime());

    }
}
