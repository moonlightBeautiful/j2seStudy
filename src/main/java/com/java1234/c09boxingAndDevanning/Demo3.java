package com.java1234.c09boxingAndDevanning;

public class Demo3 {

    public static void main(String[] args) {
        String a = "3";
        String b = "5";
        int m = Integer.valueOf(a); // valueO 把String转换成 int类型
        int n = Integer.valueOf(b);
        System.out.println("a+b=" + (m + n));
    }
}
