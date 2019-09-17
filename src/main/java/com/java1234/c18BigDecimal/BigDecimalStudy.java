package com.java1234.c18BigDecimal;

import java.math.BigDecimal;

/**
 * @author gaoxu
 * @date 2019-09-17 17:19
 * @description BigDecimal 类
 */
public class BigDecimalStudy {
    public static void main(String[] args) {
        /**
         * Java中提供了大数字(超过16位有效位)的操作类,即 java.math.BinInteger 类和 java.math.BigDecimal 类,用于高精度计算.
         * 其中 BigInteger 类是针对大整数的处理类,而 BigDecimal 类则是针对大小数的处理类.
         * float和Double只能用来做科学计算或者是工程计算;
         * 在商业计算中,对数字精度要求较高,必须使用 BigInteger 类和 BigDecimal 类,它支持任何精度的定点数,可以用它来精确计算货币值.
         *
         */
        /**
         *  BigDecimal(double d); //此种方式绝对不允许!!!!!虽然不报错，但是精度会丢失
         *  new BigDecimal(String s);   //常用,推荐使用
         *  BigDecimal.valueOf(double d);     //常用,推荐使用
         */


       /* double d1 = 0.10334;
        double d2 = 1234.0;

        //此种方式绝对不允许!!!!!
        System.out.println("new BigDecimal(" + d1 + ")=" + new BigDecimal(d1));
        System.out.println("new BigDecimal(" + d2 + ")=" + new BigDecimal(d2));
        System.out.println("");

        System.out.println("new BigDecimal(String.valueOf(" + d1 + "))=" + new BigDecimal(String.valueOf(d1)));
        System.out.println("new BigDecimal(String.valueOf(" + d2 + "))=" + new BigDecimal(String.valueOf(d2)));
        System.out.println("");

        System.out.println("new BigDecimal(String.valueOf(" + d1 + "))=" + new BigDecimal(Double.toString(d1)));
        System.out.println("new BigDecimal(String.valueOf(" + d2 + "))=" + new BigDecimal(Double.toString(d2)));
        System.out.println("");

        System.out.println("BigDecimal.valueOf(" + d1 + ")=" + BigDecimal.valueOf(d1));
        System.out.println("BigDecimal.valueOf(" + d2 + ")=" + BigDecimal.valueOf(d2));
        System.out.println("");

        BigDecimal b1 = BigDecimal.valueOf(1);
        BigDecimal b2 = BigDecimal.valueOf(1.00000);
        System.out.println(b1.equals(b2));
        System.out.println(b1.compareTo(b2));*/

        /**
         * setScale方法用于格式化小数点，默认方式是四舍五入
         */
        BigDecimal decimal = new BigDecimal("1.123455");
        System.out.println(decimal);
        //ROUND_DOWN直接删除多余的小数位
        BigDecimal setScale1 = decimal.setScale(4, BigDecimal.ROUND_DOWN);
        System.out.println(setScale1);
        //ROUND_UP进位
        BigDecimal setScale2 = decimal.setScale(3, BigDecimal.ROUND_UP);
        System.out.println(setScale2);
        //ROUND_HALF_UP四舍五入
        BigDecimal setScale3 = decimal.setScale(4, BigDecimal.ROUND_HALF_UP);
        System.out.println(setScale3);
        //ROUND_HALF_UP五舍六入
        BigDecimal setScale4 = decimal.setScale(5, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(setScale4);

    }
}
