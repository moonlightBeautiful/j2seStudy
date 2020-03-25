package com.ims.workingGet.c02BigDecimal;

import java.math.BigDecimal;


public class BigDecimalStudy {
    public static void main(String[] args) {

        double d1 = 0.2;
        double d2 = 0.1;
        /**
         * 为什么不能使用double进行运算，因为使用double进行运算，精度可能会丢失!!!!
         */
       /* System.out.println("为什么不能使用double，因为double间的运算可能会出错。");
        System.out.println(d1 + " + " + d2 + " = " + (0.2 + 0.1));
        System.out.println(d1 + " - " + d2 + " = " + (0.3 - 0.1));
        System.out.println(d1 + " * " + d2 + " = " + (0.2 * 0.1));
        System.out.println(d1 + " / " + d2 + " = " + (0.3 / 0.1));
        System.out.println("===============================================================");*/
        /**
         * BigDecimal的实例化一：new BigDecimal(double)，此种方式绝对不允许，精度会丢失!!!!!
         */
       /* System.out.println("BigDecimal的实例化方式一：new BigDecimal(double)，精度会丢失!!!!!");
        System.out.println("new BigDecimal(" + d1 + ") = " + new BigDecimal(d1));
        System.out.println("new BigDecimal(" + d2 + ") = " + new BigDecimal(d2));
        System.out.println("===============================================================");*/

        /**
         * BigDecimal的实例化二：new BigDecimal(double)，此种方式绝对不允许，精度会丢失!!!!!
         */
       /* System.out.println("BigDecimal的实例化方式二：new BigDecimal(string)，精度不丢失!!!!!");
        System.out.println("new BigDecimal(String.valueOf(" + d1 + "))=" + new BigDecimal(String.valueOf(d1)));
        System.out.println("new BigDecimal(String.valueOf(" + d2 + "))=" + new BigDecimal(String.valueOf(d2)));
        System.out.println("===============================================================");*/

        /**
         * setScale设置精度
         */
        /*BigDecimal decimal = new BigDecimal("0.1234500");
        System.out.println("初始值：" + decimal);
        BigDecimal setScale1 = decimal.setScale(5);
        System.out.println("默认丢弃多余的0，但是不能舍弃最后的非0：" + setScale1);
        BigDecimal setScale2 = decimal.setScale(4, BigDecimal.ROUND_HALF_UP);
        System.out.println("ROUND_HALF_UP四舍五入：" + setScale2);
        BigDecimal setScale3 = decimal.setScale(4, BigDecimal.ROUND_DOWN);
        System.out.println("ROUND_DOWN直接删除多余的小数位：" + setScale3);
        BigDecimal setScale4 = decimal.setScale(4, BigDecimal.ROUND_UP);
        System.out.println("ROUND_UP进位："+setScale4);
        BigDecimal setScale5 = decimal.setScale(4, BigDecimal.ROUND_HALF_DOWN);
        System.out.println("ROUND_HALF_UP五舍六入："+setScale5);
        System.out.println("===============================================================");*/
        /**
         * valueOf转换成BigDecimal对象
         */
        /*System.out.println("BigDecimal BigDecimal.valueOf(" + d2 + ") = " + BigDecimal.valueOf(d2));*/
        /**
         * BigDecimal的加减乘除
         */
        BigDecimal a = new BigDecimal("4.00");
        BigDecimal b = new BigDecimal("1.2");
        System.out.println("a + b =" + a.add(b));
        System.out.println("a - b =" + a.subtract(b));
        System.out.println("a * b =" + a.multiply(b));
        System.out.println("a / b =" + a.divide(b,2,BigDecimal.ROUND_HALF_UP));
    }
}
