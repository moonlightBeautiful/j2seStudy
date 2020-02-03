package com.java1234.c09thread.c03implementsRunnable;

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
            System.out.println(threadName + " 吃第" + baoZi + "个包子");
            baoZi++;
        }
    }

    public static void main(String[] args) {
        /**
         * 实现方式1：创建各自独立的资源空间，非共享资源，如果未对共享资源加锁，可能会出现资源
         */
        Eat eat1 = new Eat("张三线程");
        Eat eat2 = new Eat("李四线程");
        Thread eat1Thread = new Thread(eat1);
        Thread eat2Thread = new Thread(eat2);
        eat1Thread.start();
        eat2Thread.start();

        /**
         * 实现方式2：创建共享资源空间，共享资源,如果未加锁，可能资源重复使用
         */
       /* Eat t1 = new Eat("超级张三线程");
        Thread t11 = new Thread(t1);
        Thread t12 = new Thread(t1);
        Thread t13 = new Thread(t1);
        t11.start();
        t12.start();
        t13.start();*/
    }
}
