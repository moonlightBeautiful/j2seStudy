package com.ims.c01basic.c03objectOrientedProgramming;

public class C01CodeBlock03 {

    /**
     * �������飬��ʵ��������֮ǰ���ã�Ҳ����new��ʱ�����һ�Σ�
     */
    {
        System.out.println("�������飬��ʵ��������֮ǰ���ã�Ҳ����new��ʱ�����һ�Σ�");
    }

    /**
     * ���췽��1
     */
    public C01CodeBlock03() {
        System.out.println("���췽��1");
    }

    /**
     * ���췽��2
     */
    public C01CodeBlock03(int i) {
        System.out.println("���췽��2");
    }

    /**
     * ���췽��3
     */
    public C01CodeBlock03(int i, int j) {
        System.out.println("���췽��3");
    }

    public static void main(String[] args) {
        new C01CodeBlock03();
        new C01CodeBlock03(1);
        new C01CodeBlock03(1, 2);
    }
}
