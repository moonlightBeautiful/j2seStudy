package com.ims.c01basic.c07Class;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过 对象、类全名、类 反射得到Class类的对象（记录对象的类的信息）
 * 然后通过Class类的对象（记录对象的类的信息）new Object类型实例
 * 最后用new的实例Object类型获取和调用指定方法（private类型不可以）
 * <p>
 * 带Declared返回的是当前Class对象（类）中明确声明过的Method/Field(包括：public、protected、default、private，不包括：父类或父接口的Method/Field)
 * 不带Declared的返回的是当前Class对象（类）的实例能调用的所有public Method/Field（包含从父类或父接口继承而来没有重写的public Method/Field）
 * note：如果直接转换成具体类型，则可以直接调用方法
 */

public class C04usePropertyAndMethod {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.ims.c01basic.c07Class.Student");

            /**
             * private
             */
            // 获取对象
            Object obj = c.newInstance();


            // 获取指定属性
           /* Field nameField = c.getDeclaredField("name");
            // private属性要开启访问权限
            nameField.setAccessible(true);
            // 对象属性赋值
            nameField.set(obj, "张三");
            // 获取指定属性的值
            System.out.println("name:" + nameField.get(obj));
            // 获取指定方法
            Method eatMethod = c.getDeclaredMethod("eat");
            // private方法要开启访问权限
            eatMethod.setAccessible(true);
            // 调用指定方法
            eatMethod.invoke(obj);*/

            /**
             * public
             */
            // 获取指定属性
            Field wife = c.getField("wife");
            // 指定属性赋值
            wife.set(obj, "张三");
            // 获取指定属性的值
            System.out.println("wife:" + wife.get(obj));
            // 获取指定方法
            Method setNameMethod = c.getMethod("setName", String.class);
            Method getNameMethod = c.getMethod("getName");
            // 调用指定方法
            setNameMethod.invoke(obj, "张三");
            String name = (String) getNameMethod.invoke(obj);
            System.out.println("name=" + name);


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
