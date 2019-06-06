package com.java1234.c09boxingAndDevanning;

public class Demo1 {


    public static void main(String[] args) {
        int a = 1;
        Integer i = new Integer(a); // 装箱
        int b = i.intValue(); // 拆箱
        System.out.println("a=" + a);
        System.out.println("i=" + i);
        System.out.println("b=" + b);
    }
}
