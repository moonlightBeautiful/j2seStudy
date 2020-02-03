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
                System.out.println(threadName + " 吃第" + baoZi + "包子。");
                baoZi++;
            }
        }
    }

    public static void main(String[] args) {
        //给资源上锁  方式2 需要同步的代码上加synchronized
        Eat2 t1 = new Eat2("炒鸡张三");

        Thread t11 = new Thread(t1);
        Thread t12 = new Thread(t1);
        Thread t13 = new Thread(t1);

        t11.start();
        t12.start();
        t13.start();
    }

}
