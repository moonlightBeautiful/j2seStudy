package com.ims.c01basic.c10IO.c02stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class C01FileInputStream {

    public static void main(String[] args) throws Exception {
        File file = new File("io测试文件.txt");
        InputStream inputStream = new FileInputStream(file);
        byte b[] = new byte[(int) file.length()];
        //一次性读取全部字节
        int len = inputStream.read(b);
        //一个一个字节读取
         /* int temp = 0;
         int len = 0;
        while ((temp = inputStream.read()) != -1) {
            System.out.println(temp);
            b[len++] = (byte) temp;
        }*/
        inputStream.close();
        for (int i = 0; i < (int) file.length(); i++) {
            System.out.println("读取到的字节：" + b[i]);
        }
        System.out.println("字节转字符：" + new String(b, 0, len, "UTF-8"));
       /* System.out.println("系统默认编码:" + Charset.defaultCharset());
        System.out.println("字节转字符UTF-8：" + new String(b, 0, len,"UTF-8"));
        System.out.println("字节转字符：" + new String(b, 0, len,"GBK"));*/
    }
}
