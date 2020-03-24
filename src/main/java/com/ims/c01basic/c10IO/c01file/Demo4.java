package com.ims.c01basic.c10IO.c01file;

import java.io.File;
import java.io.IOException;

public class Demo4 {
    /**
     * 递归 输出目录下的所有文件和文件夹
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
