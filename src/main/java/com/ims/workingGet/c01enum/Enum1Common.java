package com.ims.workingGet.c01enum;

public class Enum1Common {
    enum WeekEnum {
        MONDAY, TUESDAY, WEDNESDAY, THURDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        System.out.println("枚举类型标识符：" + WeekEnum.FRIDAY);
        for (WeekEnum day : WeekEnum.values()) {
            System.out.print("直接输出：" + day);// toString()
            System.out.print("\t name:" + day.name());
            System.out.println("\t ordinal:" + day.ordinal());// 序数
        }
    }
}
