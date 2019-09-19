package com.java1234.c20generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoxu
 * @date 2019-09-19 16:10
 * @description 为什么使用泛型
 */
public class Test01 {
    public static void main(String[] args) {
        /**
         * ArrayList可以存放任意类型，
         * 下面栗子中添加了一个String类型，添加了一个Integer类型，再使用时都以String的方式使用，因此程序崩溃了。
         * 为了解决类似这样的问题（在编译阶段就可以解决），泛型应运而生。
         */
        List arrayList = new ArrayList();
        arrayList.add("aaaa");
        arrayList.add(100);

        for (int i = 0; i < arrayList.size(); i++) {
            String item = (String) arrayList.get(i);
            System.out.println(item);
        }

        List<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("aaaa");
        //arrayList.add(100); 在编译阶段，编译器就会报错，泛型只在编译阶段有效
    }
}
