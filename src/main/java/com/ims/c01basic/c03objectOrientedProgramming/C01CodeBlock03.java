package com.ims.c01basic.c03objectOrientedProgramming;

public class C01CodeBlock03 {

    /**
     * 构造代码块，在实例化对象之前调用（也就是new的时候调用一次）
     */
    {
        System.out.println("构造代码块，在实例化对象之前调用（也就是new的时候调用一次）");
    }

    /**
     * 构造方法1
     */
    public C01CodeBlock03() {
        System.out.println("构造方法1");
    }

    /**
     * 构造方法2
     */
    public C01CodeBlock03(int i) {
        System.out.println("构造方法2");
    }

    /**
     * 构造方法3
     */
    public C01CodeBlock03(int i, int j) {
        System.out.println("构造方法3");
    }

    public static void main(String[] args) {
        new C01CodeBlock03();
        new C01CodeBlock03(1);
        new C01CodeBlock03(1, 2);
    }
}
