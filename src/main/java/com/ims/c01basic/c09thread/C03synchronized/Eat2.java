package com.ims.c01basic.c09thread.C03synchronized;

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
                System.out.println(threadName + " ³ÔµÚ" + baoZi + "°ü×Ó¡£");
                baoZi++;
            }
        }
    }

}
