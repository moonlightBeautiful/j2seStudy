package com.java1234.c06date;

import java.util.Calendar;
import java.util.Date;

public class CalendarStudy {

    public static void main(String[] args) {
        /**
         * Calendar�࣬��ȡ������� �� �� �� ʱ �� ��
         */

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR) + "��"
                + (calendar.get(Calendar.MONTH) + 1) + "��"
                + calendar.get(Calendar.DAY_OF_MONTH) + "��"
                + calendar.get(Calendar.HOUR_OF_DAY) + "ʱ"
                + calendar.get(Calendar.MINUTE) + "��"
                + calendar.get(Calendar.SECOND) + "��");

        /**
         * Calendar�࣬��ȡ������� Date����
         */
        Date date = Calendar.getInstance().getTime();
        System.out.println(date);

        /**
         * Calendar�࣬�ı��������ʱ�䣬����Ϊ4��
         */
         calendar.set(Calendar.DAY_OF_MONTH, 4);
        System.out.println(calendar.get(Calendar.YEAR) + "��"
                + (calendar.get(Calendar.MONTH) + 1) + "��"
                + calendar.get(Calendar.DAY_OF_MONTH) + "��"
                + calendar.get(Calendar.HOUR_OF_DAY) + "ʱ"
                + calendar.get(Calendar.MINUTE) + "��"
                + calendar.get(Calendar.SECOND) + "��");
    }
}
