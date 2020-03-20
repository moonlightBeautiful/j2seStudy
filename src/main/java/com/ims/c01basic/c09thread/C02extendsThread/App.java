package com.ims.c01basic.c09thread.C02extendsThread;

/**
 * @author gaoxu
 * @date 2019-05-30 17:42
 * @description ... 类
 */
public class App {
    public static void main(String[] args) {
      /*  Music music1 = new Music("张三");
        Music music2 = new Music("李四");

        Thread music1Thread = new Thread(music1);
        Thread music2Thread = new Thread(music2);

        music1Thread.start();
        music2Thread.start();*/

        Music music = new Music("炒鸡张三");
        Thread music1 = new Thread(music);
        Thread music2 = new Thread(music);
        music1.start();
        music2.start();

    }
}
