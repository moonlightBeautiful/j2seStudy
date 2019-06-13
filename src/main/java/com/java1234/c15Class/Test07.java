package com.java1234.c15Class;

import java.lang.reflect.Field;

public class Test07 {

    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c = Class.forName("com.java1234.c15Class.Student");
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            Object obj = c.newInstance();
            Field nameField = c.getDeclaredField("name");   //获取指定属性
            nameField.setAccessible(true); // private属性要开启访问权限
            nameField.set(obj, "张三");
            System.out.println("name:" + nameField.get(obj));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
