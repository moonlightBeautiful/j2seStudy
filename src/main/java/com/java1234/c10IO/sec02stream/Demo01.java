package com.java1234.c10IO.sec02stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Demo01 {

    public static void main(String[] args) throws Exception {
        File file = new File("c://java�����ļ�.properties");
        InputStream inputStream = new FileInputStream(file);
        byte b[] = new byte[1024];
        int len = inputStream.read(b);
        inputStream.close();
        System.out.println("��ȡ�������ݣ�" + new String(b, 0, len,"UTF-8"));

        /*//��ȡϵͳĬ�ϱ���
        System.out.println("ϵͳĬ�ϱ��룺" + System.getProperty("file.encoding"));//��ѯ���GBK
        //ϵͳĬ���ַ�����
        System.out.println("ϵͳĬ���ַ�����:" + Charset.defaultCharset()); //��ѯ���GBK
        //����ϵͳ�û�ʹ�õ�����
        System.out.println("ϵͳĬ������:" + System.getProperty("user.language")); //��ѯ���zh*/
    }
}
