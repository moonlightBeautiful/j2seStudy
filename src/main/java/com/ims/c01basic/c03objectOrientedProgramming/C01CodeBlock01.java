package com.ims.c01basic.c03objectOrientedProgramming;

public class C01CodeBlock01 {

    public static void main(String[] args) {
        int a = 1;
        /**
         * 普通代码块，没啥用，就是一个概念
         */
        {
            a = 2;
            System.out.println("普通代码块，没啥用，就是一个概念");
        }
        System.out.println("a=" + a);
    }
}
