package com.java1234.c08innerClass;

/**
 * �ⲿ��
 *
 * @author user
 */
public class Outer {

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
        Outer outer = new Outer();
        outer.show();
    }
}
