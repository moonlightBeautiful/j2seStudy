package com.ims.c01basic.c08collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoxu
 * @date 2019-05-31 18:24
 * @description ... 类
 */
public class C01arrayList {
    public static void main(String[] args) {
        /*List<String> arrayList = new ArrayList<String>();
        arrayList.add("张三");
        arrayList.add("李四");
        System.out.println("集合大小，size()");
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("将指定的元素插入此列表中的指定位置add(index,value)");
        // 将指定的元素插入此列表中的指定位置。
        arrayList.add(1, "小张三");
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("用指定的元素替代此列表中指定位置上的元素");
        // 用指定的元素替代此列表中指定位置上的元素。
        arrayList.set(2, "小李四");
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("移除此列表中指定位置上的元素");
        // 移除此列表中指定位置上的元素。
        arrayList.remove(0);
        for (String s : arrayList) {
            System.out.println(s);
        }*/

        /**
         * 交集、并集、差集
         */
        List<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        List<String> list2 = new ArrayList<String>();
        list2.add("C");
        System.out.println(list1.retainAll(list2));//不知道true和false的含义
        System.out.println(list1.size());  //
        System.out.println(list2);
    }
}
