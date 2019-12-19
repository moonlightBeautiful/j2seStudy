package com.java1234.c04StringAndStringBuffer;

public class StringBufferStudy {

	public static void main(String[] args) {
		/**
		 * StringBuffer 的 内容放在了堆区中，始终使用的是一个对象，在同一个堆空间内更改
		 */
		StringBuffer sb=new StringBuffer("123");	//堆区中 创建了123的空间
		sb.append("abc");	//堆区中 123的空间中追加了abc
		System.out.println(sb.toString());
		
	}
}
