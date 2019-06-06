package com.java1234.c12thread.c05synchronized;

public class Music implements Runnable {

    private int baoZi = 1;

    private String threadName;

    public Music(String threadName) {
        super();
        this.threadName = threadName;
    }

    @Override
    public synchronized void run() {
        synchronized (this) {
            while (baoZi <= 10) {
                System.out.println(threadName + " �Ե�" + baoZi + "������");
                baoZi++;
            }

        }
    }

    public static void main(String[] args) {
        //给资源上锁 方式二：方法内使用synchronized (this){}
        Music t1 = new Music("炒鸡张三");

        Thread t11 = new Thread(t1);
        Thread t12 = new Thread(t1);
        Thread t13 = new Thread(t1);

        t11.start();
        t12.start();
        t13.start();
    }

}
