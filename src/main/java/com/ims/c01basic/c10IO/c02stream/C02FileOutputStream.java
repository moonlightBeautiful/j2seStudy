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
        File file = new File("F:\\c\\test.txt");
        OutputStream out = new FileOutputStream(file); //这一步 硬盘上就会出现文件
        String str = "爱爱爱爱";
        byte b[] = null;str.getBytes();
      //  byte b[] = str.getBytes("UTF-8");
        out.write(b);
        out.close();
    }
}
