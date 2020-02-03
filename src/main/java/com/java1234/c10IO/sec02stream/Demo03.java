package com.java1234.c10IO.sec02stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Demo03 {

    public static void main(String[] args) throws Exception {
        File file = new File("c://java测试目录//java测试文件.properties");
        InputStream inputStream = new FileInputStream(file);
        int fileLength = (int) file.length();
        byte b[] = new byte[fileLength];
        int len = 0;
        int temp = 0;
        while ((temp = inputStream.read()) != -1) {
            System.out.println(temp);
            b[len++] = (byte) temp;
        }
        inputStream.close();
        System.out.println("读取到的内容" + new String(b));
    }
}
