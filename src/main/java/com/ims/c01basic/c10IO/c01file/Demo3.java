package com.ims.c01basic.c10IO.c01file;

import java.io.File;
import java.io.IOException;

public class Demo3 {
    /**
     * Ŀ¼�µ��ļ����ļ���
     */
    public static void main(String[] args) throws IOException {
        File file = new File("C://GLNPU//TEMP//JZMES//temp");
        File files[] = file.listFiles(); // ��ȡ�����ļ���Ŀ¼�������Ŀ¼Ϊ��Ŀ¼���򷵻�null��
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
