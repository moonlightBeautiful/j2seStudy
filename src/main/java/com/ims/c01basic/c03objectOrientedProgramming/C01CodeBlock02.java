package com.ims.c01basic.c03objectOrientedProgramming;

public class C01CodeBlock02 {

    /**
     * 静态构造代码块，仅在类加载的时候初始化一次
     */
    static {
        System.out.println("静态构造代码块，仅在类加载的时候初始化一次");
    }

    /**
     * 构造方法1
     */
    public C01CodeBlock02() {
        System.out.println("构造方法1");
    }

    /**
     * 构造方法2
     */
    public C01CodeBlock02(int i) {
        System.out.println("构造方法2");
    }

    /**
     * 构造方法3
     */
    public C01CodeBlock02(int i, int j) {
        System.out.println("构造方法3");
    }

    public static void main(String[] args) {
        new C01CodeBlock02();
        new C01CodeBlock02(1);
        new C01CodeBlock02(1, 2);
    }
}
