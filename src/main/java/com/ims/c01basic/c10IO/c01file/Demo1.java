package com.ims.c01basic.c10IO.c01file;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    /**
     * 创建文件夹或者目录
     */
    public static void main(String[] args) throws IOException {
        File file = new File("c://java测试目录");
        boolean b = file.mkdir(); // 创建目录
        if (b) {
            System.out.println("创建目录成功");
            file = new File("c://java测试目录//java测试文件.properties");
            boolean b2 = file.createNewFile(); // 创建文件
            if (b2) {
                System.out.println("创建文件成功");
            } else {
                System.out.println("创建文件失败");
            }
        } else {
            System.out.println("创建目录失败");
        }
    }
}
