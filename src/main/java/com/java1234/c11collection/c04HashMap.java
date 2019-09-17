package com.java1234.c11collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        /*Student s = hashMap.get("1号");
        System.out.println(s);
        // 获取key的迭代器
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next(); // 获取key
            Student student = hashMap.get(key); // 获取值
            System.out.println("key=" + key + ",value=" + student);
        }*/

        /**
         * Map中采用Entry内部类来表示一个映射项，映射项包含Key和Value (我们总说键值对键值对, 每一个键值对也就是一个Entry)
         * entrySet里面的类型是Map.Entry，一般可以通过map.entrySet()得到。
         * Map.Entry里面包含getKey()和getValue()方法
         */

        Set<Map.Entry<String, Student>> entryseSet = hashMap.entrySet();

        for (Map.Entry<String, Student> entry : entryseSet) {

            System.out.println(entry.getKey() + "," + entry.getValue());

        }
    }
}
