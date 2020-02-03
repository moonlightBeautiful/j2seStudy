package com.java1234.c09thread.c05synchronized;

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
            System.out.println(threadName + " 吃第" + baoZi + "包子。");
            baoZi++;
        }
    }

    public static void main(String[] args) {
        //给资源上锁  方式1 方法上加synchronized
        Eat1 t1 = new Eat1("炒鸡张三");

        Thread t11 = new Thread(t1);
        Thread t12 = new Thread(t1);
        Thread t13 = new Thread(t1);

        t11.start();
        t12.start();
        t13.start();
    }

}
