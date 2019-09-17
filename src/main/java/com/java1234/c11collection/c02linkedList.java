package com.java1234.c11collection;

import java.util.LinkedList;

/**
 * @author gaoxu
 * @date 2019-05-31 18:24
 * @description LinkedList 类，有序非重复，链表数据结构，每个元素分配的空间不必连续、插入和删除元素时速度非常快、但访问元素的速度较慢。
 */
public class c02linkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("张三");
        linkedList.add("李四");
        linkedList.add("王五");
        linkedList.add("李四");
        linkedList.add("赵六");
        for (String s : linkedList) {
            System.out.println(s);
        }
        /*System.out.println("返回此列表中首次出现的指定元素的索引，如果此列表中不包含该元素，则返回 -1");
        // 返回此列表中首次出现的指定元素的索引，如果此列表中不包含该元素，则返回 -1。
        System.out.println(linkedList.indexOf("李四"));

        // 获取但不移除此列表的第一个元素；如果此列表为空，则返回 null。
        System.out.println("获取但不移除此列表的第一个元素；如果此列表为空，则返回 null");
        System.out.println(linkedList.peekFirst());
        for (String s : linkedList) {
            System.out.println(s);
        }

        // 获取但不移除此列表的最后一个元素；如果此列表为空，则返回 null。
        System.out.println("获取但不移除此列表的最后一个元素；如果此列表为空，则返回 null。");
        System.out.println(linkedList.peekLast());
        for (String s : linkedList) {
            System.out.println(s);
        }

        // 获取并移除此列表的第一个元素；如果此列表为空，则返回 null。
        System.out.println(linkedList.pollFirst());
        for (String s : linkedList) {
            System.out.println(s);
        }

        // 获取并移除此列表的最后一个元素；如果此列表为空，则返回 null。
        System.out.println(linkedList.pollLast());
        for (String s : linkedList) {
            System.out.println(s);
        }*/
    }
}
