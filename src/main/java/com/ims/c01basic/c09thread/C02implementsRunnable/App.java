package com.ims.c01basic.c09thread.C02implementsRunnable;

public class App {

    public static void main(String[] args) {
        /**
         * 实现方式1：创建各自独立的资源空间，非共享资源
         */
        /*Eat eat1 = new Eat("张三线程");
        Eat eat2 = new Eat("李四线程");
        Thread eat1Thread = new Thread(eat1);
        Thread eat2Thread = new Thread(eat2);
        eat1Thread.start();
        eat2Thread.start();*/

        /**
         * 实现方式2：创建共享资源空间，共享资源,如果未加锁，可能资源重复使用
         */
        Eat t1 = new Eat("超级张三线程");
        Thread t11 = new Thread(t1);
        Thread t12 = new Thread(t1);
        Thread t13 = new Thread(t1);
        t11.start();
        t12.start();
        t13.start();
    }
}
