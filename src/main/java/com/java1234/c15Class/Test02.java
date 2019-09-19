package com.java1234.c15Class;

import java.lang.reflect.Constructor;

/**
 * 通过 对象、类全名、类 反射得到Class类的对象（记录对象的类的信息）
 * 然后通过Class类的对象（记录对象的类的信息）new实例
 */
public class Test02 {

    public static void main(String[] args) {

        System.out.println("通过全类名（包路径+类名）获取Class对象（记录对象的类的信息）");
        try {
            Class<?> c = null;
            c = Class.forName("com.java1234.c15Class.Student");
            System.out.println(c.getName());

            System.out.println("通过Class对象（记录对象的类的信息）直接new实例");
            try {
                Student s = null;
                s = (Student) c.newInstance();
                s.setName("张三");
                s.setAge(28);
                System.out.println(s);
            } catch (InstantiationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("通过Class对象（记录对象的类的信息）用构造函数new实例");
            try {
                //按照类中构造方法的顺序排序
                Constructor<?>[] cons = c.getConstructors();
                /* System.out.println( cons[0]);*/
                Student s = null;
                s = (Student) cons[1].newInstance("李四", 28);
                System.out.println(s);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
