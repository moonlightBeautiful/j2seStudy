package com.java1234.c12thread.c01noThread;

/**
 * @author gaoxu
 * @date 2019-05-30 17:36
 * @description ... 类
 */
public class Eat {

    public void eatFood() {
        for (int i = 0; i < 100; i++) {
            System.out.println("吃包子" + i);
        }
    }
}
