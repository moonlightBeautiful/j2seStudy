package com.ims.c01basic.c09thread.C04method;

/**
 * @author gaoxu
 * @date 2019-05-30 18:27
 * @description ... ��
 */
public class App implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "��" + i);
        }
    }

    public static void main(String[] args) {
        App app1 = new App();
        //���췽�� ����Ϊ�߳�ȡ���֣�Thread.currentThread().getName() ʹ��
        /* new Thread(app1).start();
        new Thread(app1, "�Լ������߳�����").start();*/
        //�Ƿ���������
        /* System.out.println("app1�Ƿ���" + new Thread(app1).isAlive());*/
        //�����߳����ȼ�
       /* App app2 = new App();
        Thread t1 = new Thread(app2, "�߳�A");
        Thread t2 = new Thread(app2, "�߳�B");
        Thread t3 = new Thread(app2, "�߳�C");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();*/
        //�õ���ǰ�������е��߳�
        /* Thread thread = Thread.currentThread();*/
        //��ǰִ�е��߳����ã�����ȴ����У��ȴ���һ��ʱ��Ƭ
        /* Thread.yield();*/
    }
}
