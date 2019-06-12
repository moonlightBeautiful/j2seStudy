package com.java1234.c06date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {

    public static void main(String[] args) throws ParseException {
        //SimpleDateFormat是对Date类型的处理
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(sdf.format(date));
        System.out.println(sdf.parse("2019-06-12 16:51:34"));
    }
}
