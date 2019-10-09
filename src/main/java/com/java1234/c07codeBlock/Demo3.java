package com.java1234.c07codeBlock;

public class Demo3 {

    /**
     * 静态构造代码块，仅在类加载的时候初始化一次
     */
    static {
        System.out.println("静态构造代码块，仅在类加载的时候初始化一次");
    }

    /**
     * 构造方法1
     */
    public Demo3() {
        System.out.println("构造方法1");
    }

    /**
     * 构造方法2
     */
    public Demo3(int i) {
        System.out.println("构造方法2");
    }

    /**
     * 构造方法3
     */
    public Demo3(int i, int j) {
        System.out.println("构造方法3");
    }

    public static void main(String[] args) {
        new Demo3();
        new Demo3(1);
        new Demo3(1, 2);
    }
}
