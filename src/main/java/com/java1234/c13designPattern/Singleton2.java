package com.java1234.c13designPattern;

/**
 * 懒汉式
 */
public class Singleton2 {

    /**
     * 构造方法私有化
     */
    private Singleton2() {

    }

    //静态常亮
    private static Singleton2 single = null;

    /**
     * 在静态getInstance中初始化一次，就一次，判断条件single是否为空，并且上锁。安全，防止重复初始化
     *
     * @return
     */
    public synchronized static Singleton2 getInstance() {
        if (single == null) {
            System.out.println("第一次初始化");
            single = new Singleton2();
        }
        return single;
    }
}
