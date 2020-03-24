package com.ims.c01basic.c10IO.c02stream;

import java.io.*;

public class C03BufferedInputStream {

    /**
     * 使用缓冲
     *
     * @throws Exception
     */
    public static void bufferStream() throws Exception {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("java测试文件.properties"));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("java测试文件01.properties"));
        long startTime = System.currentTimeMillis();

        int b;
        while ((b = inputStream.read()) != -1) {
            outputStream.write(b);
        }
        inputStream.close();
        outputStream.close();

        long endTime = System.currentTimeMillis();
        System.out.println("使用缓冲花费时间：" + (endTime - startTime));
    }


    /**
     * 不使用缓冲
     *
     * @throws Exception
     */
    public static void stream() throws Exception {
        InputStream inputStream = new FileInputStream("java测试文件.properties");
        OutputStream outputStream = new FileOutputStream("java测试文件02.txt");
        long startTime = System.currentTimeMillis();

        int b = 0;
        while ((b = inputStream.read()) != -1) {
            outputStream.write(b);
        }
        inputStream.close();
        outputStream.close();

        long endTime = System.currentTimeMillis();
        System.out.println("不使用缓冲花费时间：" + (endTime - startTime));
    }

    public static void main(String[] args) throws Exception {
        stream();
        bufferStream();
    }
}
