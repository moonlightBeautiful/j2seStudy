package com.java1234.c13designPattern;

/**
 * 饿汉式
 */
public class Singleton {

    /**
     * 构造方法私有化
     */
    private Singleton() {

    }

    //静态常亮实例化
    private static final Singleton single = new Singleton();

    /**
     * 获取类加载时候初始化的实例
     * @return
     */
    public static Singleton getInstance() {
        return single;
    }
}
