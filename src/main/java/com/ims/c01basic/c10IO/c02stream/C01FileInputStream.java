package com.ims.c01basic.c10IO.c02stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class C01FileInputStream {

    public static void main(String[] args) throws Exception {
        File file = new File("io�����ļ�.txt");
        InputStream inputStream = new FileInputStream(file);
        byte b[] = new byte[(int) file.length()];
        //һ���Զ�ȡȫ���ֽ�
        int len = inputStream.read(b);
        //һ��һ���ֽڶ�ȡ
         /* int temp = 0;
         int len = 0;
        while ((temp = inputStream.read()) != -1) {
            System.out.println(temp);
            b[len++] = (byte) temp;
        }*/
        inputStream.close();
        for (int i = 0; i < (int) file.length(); i++) {
            System.out.println("��ȡ�����ֽڣ�" + b[i]);
        }
        System.out.println("�ֽ�ת�ַ���" + new String(b, 0, len, "UTF-8"));
       /* System.out.println("ϵͳĬ�ϱ���:" + Charset.defaultCharset());
        System.out.println("�ֽ�ת�ַ�UTF-8��" + new String(b, 0, len,"UTF-8"));
        System.out.println("�ֽ�ת�ַ���" + new String(b, 0, len,"GBK"));*/
    }
}
