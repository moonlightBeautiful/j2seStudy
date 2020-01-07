package com.java1234.c05commonUseClass;

public class StringStudy {
    public static void main(String[] args) {
        /**
         * String 的 内容放在了堆区中，堆分为公共堆和私有堆
         */
        /**
         * 公共堆，不使用new，对String对象操作，等同于重新生成一个String对象
         */
        String str1 = "123";    //公共堆区中 创建了123的空间
        str1 += "abc";    //公共堆区中，丢掉了123的空间，然后创建了123abc的空间
        System.out.println(str1);

        /**
         * 私有堆，使用new
         */
        String str2 = new String("123");
        System.out.println(str2);

        /**
         * == 比较的是引用
         * equals() 比较的是具体的内容
         */

        /**
         * String.format("公式",""...)
         */
        //String.format("公式",""...)：输出格式化后的字符串。公式目前就知道%s：用后面的参数替换%s。
        String s1 = String.format("你好：%s，%s！", "刘德华", "张学友");
        System.out.println(s1);

        /**
         * str.chartAt（int index）
         * 返回str的index位置的字符
         */

        /**
         * str.indexOf（char c）
         * 返回str的中第一次出现字符c的index
         */

        /**
         * str.indexOf（char c，int startIndex）
         * 返回str的中从startIndex开始第一次出现字符c的index
         */

        /**
         * str.subString（int startIndex）
         * 返回str的中从startIndex开始到末尾的字符串
         */

        /**
         * str.subString（int startIndex，int endIndex）
         * 返回str的中从startIndex开始到endIndex结束的字符串
         */

        /**
         * str.toUpperCase（）/str.toLowerCase（）
         * 返回转换为大写/小写的str
         */

        /**
         * str.trim（）
         * 返回去掉前后空格的str
         */
    }
}
