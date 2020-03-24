package com.workingGet.c19Serializable;

import java.io.IOException;

/**
 * @author gaoxu
 * @date 2019-09-18 09:14
 * @description 伪序列化
 * DataInput/OutputStream 这个装饰者流，它允许我们以基本数据类型为输入，向文件进行写入和读出操作。
 */
public class Test01 {

    public static void main(String[] args) throws IOException {
        //当前项目的路径
        /*File file = new File("");
        String filePath = file.getCanonicalPath();
        System.out.println(filePath);*/

        //当前项目所在盘的路径
        /*File file = new File("\\");   //或者File file = new File("/");
        String filePath = file.getCanonicalPath();
        System.out.println(filePath);*/

        //ClassPath的绝对URI路径
        /*File file3 = new File(new Test01().getClass().getClassLoader().getResource("").getPath());
        System.out.println(file3);*/

        //获取当前类的所在ClassPath的工程路径
        /*System.out.println(new Test01().getClass().getResource("").getPath());*/

       /* System.out.println(Test01.class.getName());*/

        /*DataOutputStream dataOutputStrean = new DataOutputStream("");*/
    }
}
