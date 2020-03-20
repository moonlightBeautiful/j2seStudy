package com.ims.c01basic.c09thread.C03synchronized;

public class App {

    public static void main(String[] args) {
        //给资源上锁  方式1 方法上加synchronized
        /*Eat1 t1 = new Eat1("炒鸡张三");

        Thread t11 = new Thread(t1);
        Thread t12 = new Thread(t1);
        Thread t13 = new Thread(t1);

        t11.start();
        t12.start();
        t13.start();*/

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
