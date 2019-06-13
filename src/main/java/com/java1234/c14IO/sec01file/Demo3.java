package com.java1234.c14IO.sec01file;

import java.io.File;
import java.io.IOException;

public class Demo3 {

    public static void main(String[] args) throws IOException {
        File file = new File("C://GLNPU//TEMP//JZMES//temp");
        File files[] = file.listFiles(); // 获取所有文件和目录，如果此目录为空目录，则返回null。
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
