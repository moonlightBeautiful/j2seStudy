package com.java1234.c12thread.c02extendsThread;

/**
 * @author gaoxu
 * @date 2019-05-30 17:42
 * @description ... 类
 */
public class App {
    public static void main(String[] args) {
        Music musicThread = new Music();
        Eat eatThread = new Eat();
        musicThread.start();
        eatThread.start();
    }
}
