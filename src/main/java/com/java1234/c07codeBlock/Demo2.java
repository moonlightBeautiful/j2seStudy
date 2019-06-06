package com.java1234.c07codeBlock;

public class Demo2 {

    /**
     * 构造代码块，在实例化对象之前调用，每次new的时候调用一次
     */ {
        System.out.println("构造代码块");
    }

    /**
     * 构造方法1
     */
    public Demo2() {
        System.out.println("���췽��һ");
    }

    /**
     * 构造方法2
     */
    public Demo2(int i) {
        System.out.println("���췽����");
    }

    /**
     * 构造方法3
     */
    public Demo2(int i, int j) {
        System.out.println("���췽����");
    }

    public static void main(String[] args) {
        new Demo2();
        new Demo2(1);
        new Demo2(1, 2);
    }
}
