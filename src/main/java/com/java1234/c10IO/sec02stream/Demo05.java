package com.java1234.c10IO.sec02stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Demo05 {

    public static void main(String[] args) throws Exception {
        File file = new File("c://java测试目录//java测试文件.properties");
        OutputStream out = new FileOutputStream(file, true);
        String str = "爱生活，爱生活，爱生活，爱生活，爱生活，爱生活，爱生活";
        byte b[] = str.getBytes();
        out.write(b);
        out.close();
    }
}
