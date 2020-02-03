package com.java1234.c10IO.sec03bufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo01 {

    /**
     * ʹ�û���
     *
     * @throws Exception
     */
    public static void bufferStream() throws Exception {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("c://java�����ļ�.properties"));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("c://java�����ļ�2.properties"));
        long startTime = System.currentTimeMillis();

        int b;
        while ((b = inputStream.read()) != -1) {
            outputStream.write(b);
        }
        inputStream.close();
        outputStream.close();

        long endTime = System.currentTimeMillis();
        System.out.println("ʹ�û��廨��ʱ�䣺" + (endTime - startTime));
    }


    /**
     * ��ʹ�û���
     *
     * @throws Exception
     */
    public static void stream() throws Exception {
        InputStream inputStream = new FileInputStream("c://java����Ŀ¼//java�����ļ�.properties");
        OutputStream outputStream = new FileOutputStream("c://java����Ŀ¼//java�����ļ�02.txt");
        long startTime = System.currentTimeMillis();

        int b = 0;
        while ((b = inputStream.read()) != -1) {
            outputStream.write(b);
        }
        inputStream.close();
        outputStream.close();

        long endTime = System.currentTimeMillis();
        System.out.println("��ʹ�û��廨��ʱ�䣺" + (endTime - startTime));
    }

    public static void main(String[] args) throws Exception {
        stream();
       /* bufferStream();*/
    }
}
