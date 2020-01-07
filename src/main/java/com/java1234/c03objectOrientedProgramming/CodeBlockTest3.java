package com.java1234.c03objectOrientedProgramming;

public class CodeBlockTest3 {

    /**
     * 静态构造代码块，仅在类加载的时候初始化一次
     */
    static {
        System.out.println("静态构造代码块，仅在类加载的时候初始化一次");
    }

    /**
     * 构造方法1
     */
    public CodeBlockTest3() {
        System.out.println("构造方法1");
    }

    /**
     * 构造方法2
     */
    public CodeBlockTest3(int i) {
        System.out.println("构造方法2");
    }

    /**
     * 构造方法3
     */
    public CodeBlockTest3(int i, int j) {
        System.out.println("构造方法3");
    }

    public static void main(String[] args) {
        new CodeBlockTest3();
        new CodeBlockTest3(1);
        new CodeBlockTest3(1, 2);
    }
}
