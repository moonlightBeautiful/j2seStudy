package com.ims.c01basic.c10IO.c01file;

import java.io.File;
import java.io.IOException;


public class Demo2 {
    /**
     * �ļ��Ƿ���ڡ�ɾ���ļ�
     */
    public static void main(String[] args) throws IOException {
        File file = new File("F://java����Ŀ¼//java�����ļ�.properties");
        file.getParentFile().delete();
        System.out.println(file.delete());
        /*if (file.exists()) { //�ж��ļ��Ƿ����
            boolean b = file.delete(); // ɾ���Ѵ��ڵ��ļ�
            if (b) {
                System.out.println("ɾ���ļ��ɹ�");
            } else {
                System.out.println("ɾ���ļ�ʧ��");
            }
            file = new File("c://java����Ŀ¼");
            if (file.exists()) {
                boolean b2 = file.delete();// ɾ���Ѵ��ڵ�Ŀ¼��ֻ��ɾ����Ŀ¼
                if (b2) {
                    System.out.println("ɾ��Ŀ¼�ɹ�");
                } else {
                    System.out.println("ɾ��Ŀ¼ʧ��");
                }
            }
        }*/

    }
}
