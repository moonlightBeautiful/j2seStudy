package com.ims.c01basic.c10IO.c03readerAndWriter;

import java.io.*;
import java.nio.charset.Charset;

public class C01Reader {

    public static void main(String[] args) throws Exception {
        System.out.println("ϵͳĬ�ϱ���:" + Charset.defaultCharset());
        File file = new File("java�����ļ�.properties");
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8"); //ָ�������ʽ
        BufferedReader read = new BufferedReader(isr);   */
        Reader reader = new FileReader(file);
        char c[] = new char[1024];
        int len = reader.read(c);
        //һ��һ����ȡ�ֽ�
        /*int temp = 0;
        while ((temp = reader.read()) != -1) {
            System.out.println(temp);
        }*/
        reader.close();
        System.out.println("��ȡ���������ǣ�" + new String(new String(c, 0, len)));
    }
}
