package com.java1234.c03objectOrientedProgramming;

public class CodeBlockTest3 {

    /**
     * ��̬�������飬��������ص�ʱ���ʼ��һ��
     */
    static {
        System.out.println("��̬�������飬��������ص�ʱ���ʼ��һ��");
    }

    /**
     * ���췽��1
     */
    public CodeBlockTest3() {
        System.out.println("���췽��1");
    }

    /**
     * ���췽��2
     */
    public CodeBlockTest3(int i) {
        System.out.println("���췽��2");
    }

    /**
     * ���췽��3
     */
    public CodeBlockTest3(int i, int j) {
        System.out.println("���췽��3");
    }

    public static void main(String[] args) {
        new CodeBlockTest3();
        new CodeBlockTest3(1);
        new CodeBlockTest3(1, 2);
    }
}
