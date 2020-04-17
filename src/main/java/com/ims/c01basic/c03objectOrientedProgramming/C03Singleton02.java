package com.ims.c01basic.c03objectOrientedProgramming;

/**
 * ����ʽ
 */
public class C03Singleton02 {

    /**
     * ���췽��˽�л�
     */
    private C03Singleton02() {
        System.out.println("���췽��˽�л�");
    }

    /**
     * ��̬����
     */
    private static C03Singleton02 single = null;

    /**
     * getInstance��̬����������ִ��һ��˽�й��췽������̬����
     */
    public synchronized static C03Singleton02 getInstance() {
        if (single == null) {
            System.out.println("��һ�γ�ʼ��");
            single = new C03Singleton02();
        }
        return single;
    }
}
