package com.ims.c01basic.c07Class;

/**
 * 通过Class类的对象（记录对象的类的信息） 获取方法和属性
 * <p>
 * 带Declared返回的是当前Class对象（类）中明确声明过的Method/Field(包括：public、protected、default、private，不包括：父类或父接口的Method/Field)
 * 不带Declared的返回的是当前Class对象（类）的实例能调用的所有public Method/Field（包含从父类或父接口继承而来没有重写的public Method/Field）
 */
public class C03GetClassContent {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.ims.c01basic.c07Class.Student");
            /**
             * 带Declared返回的是当前类声明的所有方法、属性，但不包括父类或父接口的方法、属性。
             */
            /*System.out.println("获取声明的所有构造方法：=========================================================");
            Constructor<?> declaredCons[] = c.getDeclaredConstructors();
            for (Constructor<?> con : declaredCons) {
                System.out.println("构造方法：" + con);
            }*/

              /* System.out.println("获取声明的普通方法：==========================================================");
            Method declaredMds[] = c.getDeclaredMethods();
            for (Method m : declaredMds) {
                System.out.println("普通方法：" + m);
            }

            System.out.println("获取声明的属性：=============================================================");
            Field declaredFs[] = c.getDeclaredFields();
            for (Field f : declaredFs) {
                System.out.println("属性" + f);
            }*/
            /**
             * 不带Declared返回的是当前Class对象的所有public 方法、属性，包括父类或父接口的public 方法、属性
             */
            /*System.out.println("获取声明+继承的public构造方法：=========================================================");
            Constructor<?> cons[] = c.getConstructors();
            for (Constructor<?> con : cons) {
                System.out.println("构造方法：" + con);
            }*/

            /*System.out.println("获取声明+继承的public普通方法：=========================================================");
            Method mds[] = c.getMethods();
            for (Method m : mds) {
                System.out.println("普通方法：" + m);
            }*/

            /*System.out.println("获取声明+继承的public属性：=========================================================");
            Field fs[] = c.getFields();
            for (Field f : fs) {
                System.out.println("属性：" + f);
            }*/
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
