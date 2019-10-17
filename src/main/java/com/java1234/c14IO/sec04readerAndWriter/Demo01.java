package com.java1234.c14IO.sec04readerAndWriter;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Demo01 {

    public static void main(String[] args) throws Exception {
        File file = new File("c://java测试目录//java测试文件.properties");
        Reader reader = new FileReader(file);
        char c[] = new char[1024];
        int len = reader.read(c);
        reader.close();
        System.out.println("读取到的内容是：" + new String(new String(c, 0, len)));
    }
}
