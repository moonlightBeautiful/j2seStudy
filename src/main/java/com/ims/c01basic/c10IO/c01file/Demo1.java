package com.ims.c01basic.c10IO.c01file;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    /**
     * ����Ŀ¼
     * mkdir��ֻ���ڴ��ڵ�Ŀ¼�´���ָ��Ŀ¼��/mkdirs���ϼ�Ŀ¼�����ڣ���ᴴ������·����Ŀ¼��
     * �����ļ�
     * createNewFile��ָ���ļ���Ŀ¼������ڣ�
     */
    public static void main(String[] args) throws IOException {
        //F:\java����Ŀ¼1 ������
//        File file = new File("F:\\java����Ŀ¼1\\java����Ŀ¼2");
//        boolean b = file.mkdirs(); // ����Ŀ¼ true
//        boolean b = file.mkdir(); // ����Ŀ¼ false
//        System.out.println(b);

        //F:\java����Ŀ¼1\java����Ŀ¼2\  ������
        File file = new File("F:\\java����Ŀ¼1\\java����Ŀ¼2\\java�����ļ�.properties");
        boolean b = file.createNewFile(); // �����ļ�
        System.out.println(b);

    }
}
