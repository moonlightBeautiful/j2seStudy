package com.ims.c01basic.c05commonUseClass;

public class C02StringBuffer {

	public static void main(String[] args) {
		/**
		 * StringBuffer 的 内容放在了私有堆区中
		 */
		StringBuffer sb=new StringBuffer("123");	//堆区中 创建了123的空间
		sb.append("abc");	//堆区中 123的空间中追加了abc
		System.out.println(sb.toString());
		
	}
}
