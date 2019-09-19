package com.java1234.c15Class;

/**
 * @author gaoxu
 * @date 2019-09-19 11:09
 * @description ... 类
 */
public class People {
    private int aaa;
    public static final String HOBBY = "run";
    public int getAaa() {
        return aaa;
    }

    public void setAaa(int aaa) {
        this.aaa = aaa;
    }
    public People() {
    }
    public People(int aaa) {
        this.aaa = aaa;
    }

    public void run() {
        System.out.println("父跑");
    }
}
