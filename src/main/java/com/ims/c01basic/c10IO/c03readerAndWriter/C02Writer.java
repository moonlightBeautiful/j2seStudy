package com.ims.c01basic.c10IO.c03readerAndWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class C02Writer {

    public static void main(String[] args) throws Exception {
        File file = new File("c://java测试目录//java测试文件03.txt");
        Writer out = new FileWriter(file);
        out.write("你好你好");
        out.close();
    }
}
