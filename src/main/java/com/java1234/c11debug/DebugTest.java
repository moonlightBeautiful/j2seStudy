package com.java1234.c11debug;

public class DebugTest {
    private static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = add(a, b);
        System.out.println(c);
    }
}
