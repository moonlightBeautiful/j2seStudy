package com.java1234.c15Class;

import java.lang.reflect.Constructor;

public class Test02 {

    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c = Class.forName("com.java1234.c15Class.Student");
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Student s = null;
        System.out.println("Class" +
                "对象直接获取实例====================================================================================");
        try {
            s = (Student) c.newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        s.setName("张三");
        s.setAge(28);
        System.out.println(s);
        System.out.println("Class" +
                "对象获取构造方法再获取实例====================================================================================");

        Constructor<?>[] cons = c.getConstructors();
        try {
            s = (Student) cons[1].newInstance("李四", 28);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(s);
    }
}
