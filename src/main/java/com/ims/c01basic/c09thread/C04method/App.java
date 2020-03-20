package com.ims.c01basic.c09thread.C04method;

/**
 * @author gaoxu
 * @date 2019-05-30 18:27
 * @description ... 类
 */
public class App implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "：" + i);
        }
    }

    public static void main(String[] args) {
        App app1 = new App();
        //构造方法 可以为线程取名字，Thread.currentThread().getName() 使用
        /* new Thread(app1).start();
        new Thread(app1, "自己定义线程名字").start();*/
        //是否正在运行
        /* System.out.println("app1是否活动：" + new Thread(app1).isAlive());*/
        //设置线程优先级
       /* App app2 = new App();
        Thread t1 = new Thread(app2, "线程A");
        Thread t2 = new Thread(app2, "线程B");
        Thread t3 = new Thread(app2, "线程C");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();*/
        //得到当前正在运行的线程
        /* Thread thread = Thread.currentThread();*/
        //当前执行的线程礼让，进入等待队列，等待下一个时间片
        /* Thread.yield();*/
    }
}
