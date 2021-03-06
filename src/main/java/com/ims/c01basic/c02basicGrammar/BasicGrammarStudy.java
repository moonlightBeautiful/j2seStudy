package com.ims.c01basic.c02basicGrammar;


public class BasicGrammarStudy {
    /**

    /**
     * 运算和表达式
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 数值类，浮点类
         * float占32位（bit），double占 64位（bit）
         * 有效数字:在一个数中，从该数的第一个非零数字起，直到末尾数字止的数字称为有效数字
         * float的精度为6-7位有效数字。double的精度为15-16位。不同的编译器规定不同，有些是7位，有些8位
         */
        float f = 134.123456789f;
        System.out.println(f);
        double d = 123.123123123123;
        System.out.println(d);
        /**
         * 字符：单一的 16 位 Unicode 字符
         *      普通字符：'A'等。
         *      转义字符：不能显示的ASCII字符使用转义字符标识。转义字符标识= \+ASCII字符 ，例如 '\n'、’\\'。
         *      unicode码：斜巷u开头 '\u66f0'
         * 全世界的语言都可以用Unicode码表示
         */
        char a = 'A';
        char b = '\\';
        char c = '\n';
        char h = '\u66f0';

    }
}
