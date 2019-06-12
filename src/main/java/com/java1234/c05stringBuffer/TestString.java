package com.java1234.c05stringBuffer;

public class TestString {

    public static void main(String[] args) {
        String str = "123";    //堆区中 创建了123的空间
        str += "abc";    //堆区中 丢掉了123的空间，然后创建了123abc的空间
        System.out.println(str);
    }
}
