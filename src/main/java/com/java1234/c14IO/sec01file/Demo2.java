package com.java1234.c14IO.sec01file;

import java.io.File;
import java.io.IOException;

public class Demo2 {

    public static void main(String[] args) throws IOException {
        File file = new File("c://java测试目录//java测试文件.txt");
        if (file.exists()) { //判断文件是否存在
            boolean b = file.delete(); // 删除已存在的文件
            if (b) {
                System.out.println("删除文件成功");
            } else {
                System.out.println("删除文件失败");
            }
            file = new File("c://java测试目录");
            if (file.exists()) {
                boolean b2 = file.delete();// 删除已存在的目录，只能删除空目录
                if (b2) {
                    System.out.println("删除目录成功");
                } else {
                    System.out.println("删除目录失败");
                }
            }
        }

    }
}
