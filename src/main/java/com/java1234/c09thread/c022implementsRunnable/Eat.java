package com.java1234.c09thread.c022implementsRunnable;

public class Eat implements Runnable {

    private int baoZi = 1;

    private String threadName;

    public Eat(String threadName) {
        super();
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (baoZi <= 10) {
            System.out.println(threadName + " �Ե�" + baoZi + "������");
            baoZi++;
        }
    }


}
