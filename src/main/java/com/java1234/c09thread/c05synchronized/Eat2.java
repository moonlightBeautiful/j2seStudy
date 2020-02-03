package com.java1234.c09thread.c05synchronized;

public class Eat2 implements Runnable {

    private int baoZi = 1;

    private String threadName;

    public Eat2(String threadName) {
        super();
        this.threadName = threadName;
    }

    @Override
    public void run() {
        synchronized (this) {
            while (baoZi <= 10) {
                System.out.println(threadName + " �Ե�" + baoZi + "���ӡ�");
                baoZi++;
            }
        }
    }

    public static void main(String[] args) {
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
