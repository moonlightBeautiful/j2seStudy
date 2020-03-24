package com.ims.c01basic.c10IO.c02stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class C02FileOutputStream {

    /**
     *
     */
    public static void main(String[] args) throws Exception {
        System.out.println("系统默认编码:" + Charset.defaultCharset());
        File file = new File("输入输出流测试文件.txt");
        OutputStream out = new FileOutputStream(file);
        String str = "爱爱爱爱";
        byte b[] = str.getBytes();
      //  byte b[] = str.getBytes("UTF-8");
        out.write(b);
        out.close();
    }
}
