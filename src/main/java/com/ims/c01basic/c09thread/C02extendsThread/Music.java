package com.ims.c01basic.c09thread.C02extendsThread;

public class Music extends Thread {
    private int shou = 1;
    private String threadName;

    public Music(String threadName) {
        super();
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (shou <= 10) {
            System.out.println(threadName + " ÌýµÚ" + shou + "Ê×ÒôÀÖ");
            shou++;
        }
    }


}
