package com.java1234.c07Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过Class类的对象（记录对象的类的信息） 获取方法和属性
 * <p>
 * 带Declared返回的是当前Class对象（类）中明确声明过的Method/Field(包括：public、protected、default、private，不包括：父类或父接口的Method/Field)
 * 不带Declared的返回的是当前Class对象（类）的实例能调用的所有public Method/Field（包含从父类或父接口继承而来没有重写的public Method/Field）
 */
public class Test03 {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.java1234.c07Class.Student");
            /**
             * 带Declared返回的是当前类声明的所有(包括：public,protected,default,private)Method/Field,但不包括父类或父接口的Method/Field
             */
            Constructor<?> declaredCons[] = c.getDeclaredConstructors();
            for (Constructor<?> con : declaredCons) {
                System.out.println("构造方法：" + con);
            }

            Method declaredMds[] = c.getDeclaredMethods();
            for (Method m : declaredMds) {
                System.out.println("非构造方法" + m);
            }

            Field declaredFs[] = c.getDeclaredFields();
            for (Field f : declaredFs) {
                System.out.println("属性" + f);
            }
            /**
             * 不带Declared返回的是当前Class对象的所有public Method/Field,包括父类或父接口的public Method/Field
             */
            System.out.println("不带Declared");

            Constructor<?> cons[] = c.getConstructors();
            for (Constructor<?> con : cons) {
                System.out.println("构造方法：" + con);
            }

            Method mds[] = c.getMethods();
            for (Method m : mds) {
                System.out.println("非构造方法" + m);
            }

            Field fs[] = c.getFields();
            for (Field f : fs) {
                System.out.println("属性" + f);
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
