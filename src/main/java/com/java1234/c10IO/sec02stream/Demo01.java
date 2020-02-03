package com.java1234.c10IO.sec02stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Demo01 {

    public static void main(String[] args) throws Exception {
        File file = new File("c://java测试文件.properties");
        InputStream inputStream = new FileInputStream(file);
        byte b[] = new byte[1024];
        int len = inputStream.read(b);
        inputStream.close();
        System.out.println("读取到的内容：" + new String(b, 0, len,"UTF-8"));

        /*//获取系统默认编码
        System.out.println("系统默认编码：" + System.getProperty("file.encoding"));//查询结果GBK
        //系统默认字符编码
        System.out.println("系统默认字符编码:" + Charset.defaultCharset()); //查询结果GBK
        //操作系统用户使用的语言
        System.out.println("系统默认语言:" + System.getProperty("user.language")); //查询结果zh*/
    }
}
