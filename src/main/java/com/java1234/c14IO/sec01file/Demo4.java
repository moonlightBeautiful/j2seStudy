package com.java1234.c14IO.sec01file;

import java.io.File;
import java.io.IOException;

public class Demo4 {
    /**
     * 递归输出目录下的所有文件和目录
     *
     * @param file
     */
    public static void listFile(File file) {
        if (file != null) {
            if (file.isDirectory()) { // 目录情况下
                System.out.println(file);
                File files[] = file.listFiles(); // 目录下的所有文件
                if (files != null) {
                    for (int i = 0; i < files.length; i++) {
                        listFile(files[i]); // 递归调用本身
                    }
                }
            } else { // 文件情况下
                System.out.println(file);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C://GLNPU//TEMP//JZMES//temp");
        listFile(file);
    }
}
