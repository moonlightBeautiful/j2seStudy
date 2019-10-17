package com.java1234.c14IO.sec02stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Demo01 {

    public static void main(String[] args) throws Exception {
        File file = new File("c://java测试目录//java测试文件.properties");
        InputStream inputStream = new FileInputStream(file);
        byte b[] = new byte[1024];
        int len = inputStream.read(b);
        inputStream.close();
        System.out.println("读取到的内容：" + new String(b, 0, len));
    }
}
