package com.ims.c01basic.c07Class;

import java.lang.reflect.Constructor;

/**
 * 通过Class类的对象获取实例
 * 1.Class类的对象.newInstance()：默认调用的是无参数构造方法
 * 2.获取构造方法，
 */
public class C02GetObjectByClassObject {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.ims.c01basic.c07Class.Student");
            try {
                System.out.println("通过newInstance获取实例！");
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
                System.out.println("通过getConstructors获取构造方法，构造方法newInstance获取实例！");
                Constructor<?>[] cons = c.getConstructors();
                Student s = (Student) cons[0].newInstance("李四", 28);
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
