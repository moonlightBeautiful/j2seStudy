package com.ims.c01basic.c09thread.C03synchronized;

public class App {

    public static void main(String[] args) {
        //����Դ����  ��ʽ1 �����ϼ�synchronized
        /*Eat1 t1 = new Eat1("��������");

        Thread t11 = new Thread(t1);
        Thread t12 = new Thread(t1);
        Thread t13 = new Thread(t1);

        t11.start();
        t12.start();
        t13.start();*/

        //����Դ����  ��ʽ2 ��Ҫͬ���Ĵ����ϼ�synchronized
        Eat2 t1 = new Eat2("��������");

        Thread t11 = new Thread(t1);
        Thread t12 = new Thread(t1);
        Thread t13 = new Thread(t1);

        t11.start();
        t12.start();
        t13.start();
    }
}
