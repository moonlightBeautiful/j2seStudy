package com.java1234.c10IO.sec02stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Demo04 {

    public static void main(String[] args) throws Exception {
        File file = new File("c://java�����ļ�.properties");
        OutputStream out = new FileOutputStream(file);
        String str = "������������������������������������";
        byte b[] = str.getBytes("UTF-8");
        out.write(b);
        out.close();
    }
}
