package com.ims.c01basic.c03objectOrientedProgramming;

/**
 * ����ʽ
 */
public class C03Singleton01 {

    /**
     * ���췽��˽�л�
     */
    private C03Singleton01() {
        System.out.println("���췽��˽�л�");
    }

    /**
     * ��̬����=˽�й��췽��ʵ����
     */
    private static final C03Singleton01 single = new C03Singleton01();

    /**
     * getInstance��̬�������ؾ�̬����
     *
     * @return
     */
    public static C03Singleton01 getInstance() {
        return single;
    }
}
