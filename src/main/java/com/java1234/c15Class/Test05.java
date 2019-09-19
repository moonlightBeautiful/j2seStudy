package com.java1234.c15Class;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * getClassLoader()：取得该Class对象的类装载器。类装载器负责从Java字符文件将字符流读入内存，并构造Class类对象。
 * Class.getResourceAsStream(String path) ： path 不以’/'开头时默认是从此类所在的包下取资源，以’/'开头则是从ClassPath根（target/classes/）下获取。
 * Class.getClassLoader.getResourceAsStream(String path) ：从ClassPath（target/classes/）根下获取，path不能以’/'开头。
 * ServletContext. getResourceAsStream(String path)： 从WebAPP根目录下取资源，Tomcat下path是否以’/'开头无所谓，
 */

public class Test05 {

    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c = Class.forName("com.java1234.c15Class.Student");
            Object obj = c.newInstance();
            /**
             * 带Declared
             */

            // 获取指定属性
            Field nameField = c.getDeclaredField("name");
            // private属性要开启访问权限
            nameField.setAccessible(true);
            // 指定属性赋值
            nameField.set(obj, "张三");
            // 获取指定属性的值
            System.out.println("name:" + nameField.get(obj));

            // 获取指定方法
            Method eatMethod = obj.getClass().getDeclaredMethod("eat");
            // private方法要开启访问权限
            eatMethod.setAccessible(true);
            // 调用指定方法
            eatMethod.invoke(obj);

            /**
             * 不带Declared
             */

            // 获取指定属性
            Field wife = c.getField("wife");;
            // 指定属性赋值
            wife.set(obj, "张三");
            // 获取指定属性的值
            System.out.println("wife:" + wife.get(obj));

            // 获取指定方法
            Method setNameMethod = c.getMethod("setName", String.class);
            Method getNameMethod = obj.getClass().getMethod("getName");
            // 调用指定方法
            setNameMethod.invoke(obj, "张三");
            String name = (String) getNameMethod.invoke(obj);

            System.out.println("name=" + name);


        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
