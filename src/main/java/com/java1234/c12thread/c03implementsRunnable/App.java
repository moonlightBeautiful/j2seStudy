package com.java1234.c12thread.c03implementsRunnable;

/**
 * @author gaoxu
 * @date 2019-05-30 17:54
 * @description ... 类
 */
public class App {
    public static void main(String[] args) {
       /* //创建各自的资源空间，非共享资源
        Eat t1=new Eat("张三线程");
        Eat t2=new Eat("李四线程");

        Thread t11=new Thread(t1);
        Thread t12=new Thread(t2);
        t11.start();
        t12.start();*/

        //创建相同的资源空间，共享资源, 共享资源的时候，拿到资源的状态不一样，则共享的资源不能及时得到更新
        Eat t1 = new Eat("超级张三线程");

        Thread t11 = new Thread(t1);
        Thread t12 = new Thread(t1);
        Thread t13 = new Thread(t1);

        t11.start();
        t12.start();
        t13.start();
    }
}
