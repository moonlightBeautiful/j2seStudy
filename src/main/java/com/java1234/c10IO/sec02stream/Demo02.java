package com.java1234.c10IO.sec02stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Demo02 {

	public static void main(String[] args) throws Exception {
		File file=new File("c://java����Ŀ¼//java�����ļ�.properties");
		InputStream inputStream=new FileInputStream(file);
		int fileLength=(int) file.length();
		byte b[]=new byte[fileLength];
		inputStream.read(b);
		inputStream.close();
		System.out.println("��ȡ�������ݣ�"+new String(b));
	}
}
