package com.java1234.c15Class;

import java.lang.reflect.Field;

public class Test05 {

    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c = Class.forName("com.java1234.c15Class.Student");
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Field fs[] = c.getDeclaredFields();
        for (Field f : fs) {
            System.out.println("属性" + f); //包含private
        }
    }
}
