package com.ims.c01basic.c11debug;

//F9 断点执行
//F8 一行一行执行
//F7 步入，如果没有方法，则一行一行执行，如果多个方法，则按照顺序步入。
//Alt + F8 计算选中表达式调结果
//Ctrl + F8	 设置光标当前行为断点，如果当前已经是断点则去掉断点
//Shift + F7  智能步入。断点所在行上有多个方法调用，会弹出进入哪个方法
//Shift + F8 跳出执行的方法，如果没有进入方法，则和F9一样

public class DebugTest {
    private static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    private static int add2(int a, int b) {
        int c = a + b;
        return c;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = add(a, b); c = add2(a, b);
        System.out.println(c);
    }
}
