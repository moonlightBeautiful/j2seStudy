package com.java1234.c15Class;

import java.lang.reflect.Method;

public class Test06 {

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
            Method setNameMethod = c.getMethod("setName", String.class); // 获取指定方法
            setNameMethod.invoke(obj, "张三");  // 调用指定方法

            Method getNameMethod = obj.getClass().getMethod("getName");
            String name = (String) getNameMethod.invoke(obj);
            System.out.println("name=" + name);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
