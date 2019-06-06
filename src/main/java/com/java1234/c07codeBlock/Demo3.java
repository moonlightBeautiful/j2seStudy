package com.java1234.c07codeBlock;

public class Demo3 {

    /**
     * 静态构造代码块，仅在类加载的时候初始化一次
     */
    static {
        System.out.println("��̬�����");
    }

    /**
     * �����
     */ {
        System.out.println("ͨ�ù����");
    }

    /**
     * ���췽��һ
     */
    public Demo3() {
        System.out.println("���췽��һ");
    }

    /**
     * ���췽����
     */
    public Demo3(int i) {
        System.out.println("���췽����");
    }

    /**
     * ���췽����
     */
    public Demo3(int i, int j) {
        System.out.println("���췽����");
    }

    public static void main(String[] args) {
        new Demo3();
        new Demo3(1);
        new Demo3(1, 2);
    }
}
