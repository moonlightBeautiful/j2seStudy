package com.ims.workingGet.c01enum;

public class Enum1Common {
    enum WeekEnum {
        MONDAY, TUESDAY, WEDNESDAY, THURDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        System.out.println("ö�����ͱ�ʶ����" + WeekEnum.FRIDAY);
        for (WeekEnum day : WeekEnum.values()) {
            System.out.print("ֱ�������" + day);// toString()
            System.out.print("\t name:" + day.name());
            System.out.println("\t ordinal:" + day.ordinal());// ����
        }
    }
}
