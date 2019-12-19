package com.java1234.c06date;

import java.util.Calendar;
import java.util.Date;

public class CalendarStudy {

    public static void main(String[] args) {
        /**
         * Calendar类，获取日期类的 年 月 日 时 分 秒
         */

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR) + "年"
                + (calendar.get(Calendar.MONTH) + 1) + "月"
                + calendar.get(Calendar.DAY_OF_MONTH) + "日"
                + calendar.get(Calendar.HOUR_OF_DAY) + "时"
                + calendar.get(Calendar.MINUTE) + "分"
                + calendar.get(Calendar.SECOND) + "秒");

        /**
         * Calendar类，获取日期类的 Date对象
         */
        Date date = Calendar.getInstance().getTime();
        System.out.println(date);

        /**
         * Calendar类，改变日期类的时间，设置为4号
         */
         calendar.set(Calendar.DAY_OF_MONTH, 4);
        System.out.println(calendar.get(Calendar.YEAR) + "年"
                + (calendar.get(Calendar.MONTH) + 1) + "月"
                + calendar.get(Calendar.DAY_OF_MONTH) + "日"
                + calendar.get(Calendar.HOUR_OF_DAY) + "时"
                + calendar.get(Calendar.MINUTE) + "分"
                + calendar.get(Calendar.SECOND) + "秒");
    }
}
