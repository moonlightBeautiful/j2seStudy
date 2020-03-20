package com.ims.c01basic.c09thread.C03synchronized;

public class Eat1 implements Runnable {

    private int baoZi = 1;

    private String threadName;

    public Eat1(String threadName) {
        super();
        this.threadName = threadName;
    }

    @Override
    public synchronized void run() {
        while (baoZi <= 10) {
            System.out.println(threadName + " ³ÔµÚ" + baoZi + "°ü×Ó¡£");
            baoZi++;
        }
    }



}
