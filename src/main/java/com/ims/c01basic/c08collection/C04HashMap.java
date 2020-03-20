package com.ims.c01basic.c08collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gaoxu
 * @date 2019-06-03 09:02
 * @description ... 类
 */
public class C04HashMap {
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

        //Map的映射项Entry学习
        /**
         * Map中采用Entry内部类来表示一个映射项，映射项包含Key和Value (我们总说键值对键值对, 每一个键值对也就是一个Entry)
         * Map.Entry里面包含getKey()和getValue()方法
         * entrySet是 java中 键-值 对的集合，一般可以通过map.entrySet()得到。
         * keySet是 java中 键-值 对的key的集合，一般可以通过map.keySet()得到。
         */

        //四种遍历Map方式:
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        //第一种：普遍使用，遍历Key
        /*System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }*/
        //第二种：迭代器
        /*System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }*/

        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第四种
       /* System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }*/


        //Set
       /* Set<Map.Entry<String, Student>> entryseSet = hashMap.entrySet();

        for (Map.Entry<String, Student> entry : entryseSet) {

            System.out.println(entry.getKey() + "," + entry.getValue());

        }*/
    }
}
