package com.ims.c01basic.c03objectOrientedProgramming;

public class C01CodeBlock02 {

    /**
     * ��̬�������飬��������ص�ʱ���ʼ��һ��
     */
    static {
        System.out.println("��̬�������飬��������ص�ʱ���ʼ��һ��");
    }

    /**
     * ���췽��1
     */
    public C01CodeBlock02() {
        System.out.println("���췽��1");
    }

    /**
     * ���췽��2
     */
    public C01CodeBlock02(int i) {
        System.out.println("���췽��2");
    }

    /**
     * ���췽��3
     */
    public C01CodeBlock02(int i, int j) {
        System.out.println("���췽��3");
    }

    public static void main(String[] args) {
        new C01CodeBlock02();
        new C01CodeBlock02(1);
        new C01CodeBlock02(1, 2);
    }
}
