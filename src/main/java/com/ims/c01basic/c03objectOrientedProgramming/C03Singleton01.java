package com.ims.c01basic.c03objectOrientedProgramming;

/**
 * 饿汉式
 */
public class C03Singleton01 {

    /**
     * 构造方法私有化
     */
    private C03Singleton01() {
        System.out.println("构造方法私有化");
    }

    /**
     * 静态常亮=私有构造方法实例化
     */
    private static final C03Singleton01 single = new C03Singleton01();

    /**
     * getInstance静态方法返回静态常亮
     *
     * @return
     */
    public static C03Singleton01 getInstance() {
        return single;
    }
}
