package com.java1234.c09thread.c022implementsRunnable;

public class App {

    public static void main(String[] args) {
        /**
         * ʵ�ַ�ʽ1���������Զ�������Դ�ռ䣬�ǹ�����Դ
         */
       /* Eat eat1 = new Eat("�����߳�");
        Eat eat2 = new Eat("�����߳�");
        Thread eat1Thread = new Thread(eat1);
        Thread eat2Thread = new Thread(eat2);
        eat1Thread.start();
        eat2Thread.start();*/

        /**
         * ʵ�ַ�ʽ2������������Դ�ռ䣬������Դ,���δ������������Դ�ظ�ʹ��
         */
        Eat t1 = new Eat("���������߳�");
        Thread t11 = new Thread(t1);
        Thread t12 = new Thread(t1);
        Thread t13 = new Thread(t1);
        t11.start();
        t12.start();
        t13.start();
    }
}
