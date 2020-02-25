package com.java1234.c09thread.c021extendsThread;

/**
 * @author gaoxu
 * @date 2019-05-30 17:42
 * @description ... ¿‡
 */
public class App {
    public static void main(String[] args) {
        Music music = new Music();
        Eat eat = new Eat();

        Thread musicThread = new Thread(music);
        Thread eatThread = new Thread(eat);

        musicThread.start();
        eatThread.start();
    }
}
