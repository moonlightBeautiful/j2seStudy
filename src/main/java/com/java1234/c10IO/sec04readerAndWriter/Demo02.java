package com.java1234.c10IO.sec04readerAndWriter;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Demo02 {

    public static void main(String[] args) throws Exception {
        File file = new File("c://java测试目录//java测试文件.properties");
        Reader reader = new FileReader(file);
        char c[] = new char[1024];
        int len = 0;
        int temp = 0;
        while ((temp = reader.read()) != -1) {
            System.out.println(temp);
            if(len == 1024){
                break;
            }
            c[len++] = (char) temp;
        }
        reader.close();
        System.out.println("读取到的内容是：" + new String(new String(c, 0, len)));
    }
}
