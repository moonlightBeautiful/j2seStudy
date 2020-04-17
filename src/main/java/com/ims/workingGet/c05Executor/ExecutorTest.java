package com.ims.workingGet.c05Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorTest {

    private static Integer pages = 1; // ��ҳ��

    private static boolean exeFlag = true; // ִ�б�ʶ

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10); // ����ExecutorService ���ӳ�Ĭ������10��
        while (exeFlag) {
            if (pages <= 100) {
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        // TODO Auto-generated method stub
                        System.out.println("��ȡ�˵�" + pages + "��ҳ...");
                        pages++;
                    }
                });
            } else {
                if (((ThreadPoolExecutor) executorService).getActiveCount() == 0) { // ��̸߳�����0
                    executorService.shutdown(); // ���������߳�
                    exeFlag = false;
                    System.out.println("���������Ѿ����");
                }
            }
        }

    }
}
