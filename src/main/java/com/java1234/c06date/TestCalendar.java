package com.java1234.c06date;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

    public static void main(String[] args) {
        Date date;
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);

        System.out.println(calendar.get(Calendar.YEAR) + "年"
                + (calendar.get(Calendar.MONTH) + 1) + "月"
                + calendar.get(Calendar.DAY_OF_MONTH) + "日"
                + calendar.get(Calendar.HOUR_OF_DAY) + "时"
                + calendar.get(Calendar.MINUTE) + "分"
                + calendar.get(Calendar.SECOND) + "秒");
        date = calendar.getTime();
        System.out.println(date);
        calendar.set(Calendar.DAY_OF_MONTH, -4);
        System.out.println(calendar.get(Calendar.YEAR) + "年"
                + (calendar.get(Calendar.MONTH) + 1) + "月"
                + calendar.get(Calendar.DAY_OF_MONTH) + "日"
                + calendar.get(Calendar.HOUR_OF_DAY) + "时"
                + calendar.get(Calendar.MINUTE) + "分"
                + calendar.get(Calendar.SECOND) + "秒");
        date = calendar.getTime();
        System.out.println(date);

    }
}
