package com.ims.c01basic.c10IO.c02stream;

import java.io.*;

public class C03BufferedInputStream {

    /**
     * ʹ�û���
     *
     * @throws Exception
     */
    public static void bufferStream() throws Exception {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("java�����ļ�.properties"));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("java�����ļ�01.properties"));
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
        InputStream inputStream = new FileInputStream("java�����ļ�.properties");
        OutputStream outputStream = new FileOutputStream("java�����ļ�02.txt");
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
        bufferStream();
    }
}
