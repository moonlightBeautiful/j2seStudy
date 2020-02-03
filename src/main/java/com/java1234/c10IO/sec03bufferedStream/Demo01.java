package com.java1234.c10IO.sec03bufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo01 {

    /**
     * 使用缓冲
     *
     * @throws Exception
     */
    public static void bufferStream() throws Exception {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("c://java测试文件.properties"));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("c://java测试文件2.properties"));
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
        InputStream inputStream = new FileInputStream("c://java测试目录//java测试文件.properties");
        OutputStream outputStream = new FileOutputStream("c://java测试目录//java测试文件02.txt");
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
       /* bufferStream();*/
    }
}
