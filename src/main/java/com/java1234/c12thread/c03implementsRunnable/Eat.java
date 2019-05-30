package com.java1234.c12thread.c03implementsRunnable;

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
}
