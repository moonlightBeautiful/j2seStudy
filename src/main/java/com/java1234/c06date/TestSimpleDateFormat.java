package com.java1234.c06date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {

    public static void main(String[] args) throws ParseException {
        //SimpleDateFormat是对Date类型的处理
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        //把Date类型对象格式化成str
        String strDate = sdf.format(date);
        System.out.println(strDate);
        //把String格式化成Date类型对象
        Date dateFromStr = sdf.parse("2019-02-28 00:00:00");

        System.out.println(dateFromStr.getTime());

    }
}
