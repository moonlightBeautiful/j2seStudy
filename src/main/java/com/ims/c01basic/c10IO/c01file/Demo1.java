package com.ims.c01basic.c10IO.c01file;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    /**
     * �����ļ��л���Ŀ¼
     */
    public static void main(String[] args) throws IOException {
        File file = new File("c://java����Ŀ¼");
        boolean b = file.mkdir(); // ����Ŀ¼
        if (b) {
            System.out.println("����Ŀ¼�ɹ�");
            file = new File("c://java����Ŀ¼//java�����ļ�.properties");
            boolean b2 = file.createNewFile(); // �����ļ�
            if (b2) {
                System.out.println("�����ļ��ɹ�");
            } else {
                System.out.println("�����ļ�ʧ��");
            }
        } else {
            System.out.println("����Ŀ¼ʧ��");
        }
    }
}
