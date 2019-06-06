package com.java1234.c12thread.c02extendsThread;

/**
 * @author gaoxu
 * @date 2019-05-30 17:47
 * @description ... 类
 */
public class XieZuoYe extends Thread {
    private int zuoye = 1;

    private String threadName;

    public XieZuoYe(String threadName) {
        super();
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (zuoye <= 10) {
            System.out.println(threadName + " 写到第" + zuoye + "份作业");
            zuoye++;
        }
    }

    public static void main(String[] args) {
        // 张三 李四一起写作业 每人写10份  共享zuoye  ：分别创建各自的资源空间
        XieZuoYe t1 = new XieZuoYe("张三");
        XieZuoYe t2 = new XieZuoYe("李四");

        t1.start();
        t2.start();
    }
}
