package com.ims.c01basic.c11debug;

//F9 �ϵ�ִ��
//F8 һ��һ��ִ��
//F7 ���룬���û�з�������һ��һ��ִ�У�����������������˳���롣
//Alt + F8 ����ѡ�б��ʽ�����
//Ctrl + F8	 ���ù�굱ǰ��Ϊ�ϵ㣬�����ǰ�Ѿ��Ƕϵ���ȥ���ϵ�
//Shift + F7  ���ܲ��롣�ϵ����������ж���������ã��ᵯ�������ĸ�����
//Shift + F8 ����ִ�еķ��������û�н��뷽�������F9һ��

public class DebugTest {
    private static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    private static int add2(int a, int b) {
        int c = a + b;
        return c;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = add(a, b); c = add2(a, b);
        System.out.println(c);
    }
}
