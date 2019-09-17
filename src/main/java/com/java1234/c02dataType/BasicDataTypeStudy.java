package com.java1234.c02dataType;

/**
 * @author gaoxu
 * @date 2019-09-17 17:03
 * @description 基本数据类型学习
 */
public class BasicDataTypeStudy {
    /**
     * 基本数据类型分为8类： 数值类 byte short int long float double 布尔类 boolean 字符类 char
     */
    public static void main(String[] args) {
        /**
         * 数值类，浮点类
         * float占32位（bit），double占 64位（bit）
         * 有效数字:在一个数中，从该数的第一个非零数字起，直到末尾数字止的数字称为有效数字
         * float的精度为6-7位有效数字。double的精度为15-16位。不同的编译器规定不同，有些是7位，有些8位
         */
        float f = 134.123456789f;
        double d = 123.123123123123;
        System.out.println(f);
        System.out.println(d);

    }
}
