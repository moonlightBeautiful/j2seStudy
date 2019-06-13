package com.java1234.c14IO.sec03bufferedStream;

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
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("c://java测试目录//java测试文件.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("c://java测试目录//java" +
                "测试文件02.txt"));
        int b = 0;
        long startTime = System.currentTimeMillis();
        while ((b = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(b);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("使用缓冲花费时间：" + (endTime - startTime));
    }


    /**
     * 不使用缓冲
     *
     * @throws Exception
     */
    public static void stream() throws Exception {
        InputStream inputStream = new FileInputStream("c://java测试目录//java测试文件.txt");
        OutputStream outputStream = new FileOutputStream("c://java测试目录//java测试文件02.txt");
        int b = 0;
        long startTime = System.currentTimeMillis();
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
