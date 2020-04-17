package com.ims.c01basic.c03objectOrientedProgramming;

public class C03SingletonTest {

    public static void main(String[] args) {
        C03Singleton01 single = C03Singleton01.getInstance();
        C03Singleton01 single2 = C03Singleton01.getInstance();
        System.out.println(single == single2);

        C03Singleton02 single3 = C03Singleton02.getInstance();
        C03Singleton02 single4 = C03Singleton02.getInstance();
        System.out.println(single3 == single4);
    }
}
