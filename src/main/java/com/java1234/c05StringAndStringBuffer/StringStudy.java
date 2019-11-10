package com.java1234.c05StringAndStringBuffer;

public class StringStudy {
    public static void main(String[] args) {
        /**
         * String 的 内容放在了堆区中，堆分为公共堆和私有堆
         */
        String str = "123";    //公共堆区中 创建了123的空间
        str += "abc";    //公共堆区中，丢掉了123的空间，然后创建了123abc的空间
        System.out.println(str);
        //String.format("公式",""...)：输出格式化后的字符串。公式目前就知道%s：用后面的参数替换%s。
        String s1 = String.format("你好：%s，%s！","刘德华","张学友");
        System.out.println(s1);
    }
}
