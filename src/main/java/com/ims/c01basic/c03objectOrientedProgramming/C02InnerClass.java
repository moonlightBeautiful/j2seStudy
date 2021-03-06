package com.ims.c01basic.c03objectOrientedProgramming;

/**
 *  外部类与内部类
 *
 * @author user
 */
public class C02InnerClass {

    private int a = 1;

    /**
     * 内部类
     *
     * @author user
     */
    class Inner {
        public void show() {
            System.out.println(a); // 内部类可以直接使用外部类的变量
        }
    }

    public void show() {
        Inner inner = new Inner();
        inner.show();
    }

    public static void main(String[] args) {
        //简介调用内部类
        /*Outer outer = new Outer();
        outer.show();*/
        //直接调用内部类
        C02InnerClass outer = new C02InnerClass();
        C02InnerClass.Inner inner = outer.new Inner();
        inner.show();
    }
}
