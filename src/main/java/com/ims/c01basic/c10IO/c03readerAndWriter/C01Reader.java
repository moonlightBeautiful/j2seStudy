package com.ims.c01basic.c10IO.c03readerAndWriter;

import java.io.*;
import java.nio.charset.Charset;

public class C01Reader {

    public static void main(String[] args) throws Exception {
        System.out.println("系统默认编码:" + Charset.defaultCharset());
        File file = new File("java测试文件.properties");
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8"); //指定编码格式
        BufferedReader read = new BufferedReader(isr);   */
        Reader reader = new FileReader(file);
        char c[] = new char[1024];
        int len = reader.read(c);
        //一个一个读取字节
        /*int temp = 0;
        while ((temp = reader.read()) != -1) {
            System.out.println(temp);
        }*/
        reader.close();
        System.out.println("读取到的内容是：" + new String(new String(c, 0, len)));
    }
}
