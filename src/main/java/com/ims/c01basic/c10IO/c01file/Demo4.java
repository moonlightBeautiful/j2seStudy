package com.ims.c01basic.c10IO.c01file;

import java.io.File;
import java.io.IOException;

public class Demo4 {
    /**
     * �ݹ� ���Ŀ¼�µ������ļ����ļ���
     * @param file
     */
    public static void listFile(File file) {
        if (file != null) {
            if (file.isDirectory()) { // Ŀ¼�����
                System.out.println(file);
                File files[] = file.listFiles(); // Ŀ¼�µ������ļ�
                if (files != null) {
                    for (int i = 0; i < files.length; i++) {
                        listFile(files[i]); // �ݹ���ñ���
                    }
                }
            } else { // �ļ������
                System.out.println(file);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C://GLNPU//TEMP//JZMES//temp");
        listFile(file);
    }
}
