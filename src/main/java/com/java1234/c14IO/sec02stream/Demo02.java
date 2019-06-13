package com.java1234.c14IO.sec02stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Demo02 {

	public static void main(String[] args) throws Exception {
		File file=new File("c://java测试目录//java测试文件.txt");
		InputStream inputStream=new FileInputStream(file);
		int fileLength=(int) file.length();
		byte b[]=new byte[fileLength];
		inputStream.read(b);
		inputStream.close();
		System.out.println("读取到的内容："+new String(b));
	}
}
