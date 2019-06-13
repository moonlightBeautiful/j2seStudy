package com.java1234.c15Class;

import java.lang.reflect.Constructor;

public class Test03 {

    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c = Class.forName("com.java1234.c15Class.Student");
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Constructor<?> cons[] = c.getConstructors();
        for (Constructor<?> con : cons) {
            System.out.println("构造方法：" + con);
        }
    }
}
