package com.java1234.c05stringBuffer;

public class TestStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("123");	//堆区中 创建了123的空间
		sb.append("abc");	//堆区中 123的空间中追加了abc
		System.out.println(sb.toString());
	}
}
