package com.java1234.c07Class;

import java.lang.reflect.Constructor;

/**
 * 通过Class类的对象获取实例
 *  1.newInstance()：默认调用的是无参数构造方法
 *  2.获取构造方法，
 */
public class Test02 {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.java1234.c07Class.Student");
            try {
                Student s = (Student) c.newInstance();
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

            try {
                //按照类中构造方法的顺序排序
                Constructor<?>[] cons = c.getConstructors();
                Student    s = (Student) cons[1].newInstance("李四", 28);
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
