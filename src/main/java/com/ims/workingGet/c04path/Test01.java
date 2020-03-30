package com.ims.workingGet.c04path;

import java.io.File;
import java.io.IOException;

/**
 * @author gaoxu
 */
public class Test01 {

    public static void main(String[] args) throws IOException {
        //""：代表当前项目的路径  E:\IntelliJ IDEA_workspace\j2seStudy
       /* File file = new File("");
        String filePath = file.getCanonicalPath();
        System.out.println(filePath);*/

        // \\或者/：当前项目所在盘的路径  E:\
       /* File file = new File("/");   //或者File file = new File("\\");
        String filePath = file.getCanonicalPath();
        System.out.println(filePath);*/

        //类全名
        System.out.println(Test01.class.getName());

    }
}
