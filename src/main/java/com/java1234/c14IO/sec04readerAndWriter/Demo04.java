package com.java1234.c14IO.sec04readerAndWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Demo04 {

    public static void main(String[] args) throws Exception {
        File file = new File("c://java测试目录//java测试文件03.txt");
        Writer out = new FileWriter(file, true);
        out.write("你好你好");
        out.close();
    }
}
