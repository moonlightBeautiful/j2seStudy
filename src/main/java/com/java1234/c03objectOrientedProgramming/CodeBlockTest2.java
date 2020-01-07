package com.java1234.c03objectOrientedProgramming;

public class CodeBlockTest2 {

    /**
     * 构造代码块，在实例化对象之前调用（也就是new的时候调用一次）
     */
    {
        System.out.println("构造代码块，在实例化对象之前调用（也就是new的时候调用一次）");
    }

    /**
     * 构造方法1
     */
    public CodeBlockTest2() {
        System.out.println("构造方法1");
    }

    /**
     * 构造方法2
     */
    public CodeBlockTest2(int i) {
        System.out.println("构造方法2");
    }

    /**
     * 构造方法3
     */
    public CodeBlockTest2(int i, int j) {
        System.out.println("构造方法3");
    }

    public static void main(String[] args) {
        new CodeBlockTest2();
        new CodeBlockTest2(1);
        new CodeBlockTest2(1, 2);
    }
}
