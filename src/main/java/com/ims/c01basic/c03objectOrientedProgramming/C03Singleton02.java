package com.ims.c01basic.c03objectOrientedProgramming;

/**
 * 懒汉式
 */
public class C03Singleton02 {

    /**
     * 构造方法私有化
     */
    private C03Singleton02() {
        System.out.println("构造方法私有化");
    }

    /**
     * 静态变亮
     */
    private static C03Singleton02 single = null;

    /**
     * getInstance静态方法上锁、执行一次私有构造方法并静态变亮
     */
    public synchronized static C03Singleton02 getInstance() {
        if (single == null) {
            System.out.println("第一次初始化");
            single = new C03Singleton02();
        }
        return single;
    }
}
