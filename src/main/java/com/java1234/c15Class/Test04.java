package com.java1234.c15Class;

import java.lang.reflect.Method;

public class Test04 {

    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c = Class.forName("com.java1234.c15Class.Student");
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Method mds[] = c.getMethods();  //不包含private的，包含自身的和继承的
        for (Method m : mds) {
            System.out.println("方法" + m);
        }
    }
}
