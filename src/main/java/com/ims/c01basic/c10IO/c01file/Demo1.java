package com.ims.c01basic.c10IO.c01file;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    /**
     * 创建目录
     * mkdir（只能在存在的目录下创建指定目录）/mkdirs（上级目录不存在，则会创建整个路径的目录）
     * 创建文件
     * createNewFile（指定文件的目录必须存在）
     */
    public static void main(String[] args) throws IOException {
        //F:\java测试目录1 不存在
//        File file = new File("F:\\java测试目录1\\java测试目录2");
//        boolean b = file.mkdirs(); // 创建目录 true
//        boolean b = file.mkdir(); // 创建目录 false
//        System.out.println(b);

        //F:\java测试目录1\java测试目录2\  不存在
        File file = new File("F:\\java测试目录1\\java测试目录2\\java测试文件.properties");
        boolean b = file.createNewFile(); // 创建文件
        System.out.println(b);

    }
}
