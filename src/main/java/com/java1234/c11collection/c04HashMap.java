package com.java1234.c11collection;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author gaoxu
 * @date 2019-06-03 09:02
 * @description ... 类
 */
public class c04HashMap {
    public static void main(String[] args) {
        HashMap<String, Student> hashMap = new HashMap<String, Student>();
        hashMap.put("1号", new Student("张三", 10));
        hashMap.put("2号", new Student("李四", 11));
        hashMap.put("3号", new Student("王五", 12));

        Student s = hashMap.get("1号");
        System.out.println(s);

        Iterator<String> it = hashMap.keySet().iterator(); // 获取key的集合 ，再获取迭代器
        while (it.hasNext()) {
            String key = it.next(); // 获取key
            Student student = hashMap.get(key); // 获取值
            System.out.println("key=" + key + ",value=" + student);
        }
    }
}
