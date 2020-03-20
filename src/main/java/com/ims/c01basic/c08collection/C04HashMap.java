package com.ims.c01basic.c08collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gaoxu
 * @date 2019-06-03 09:02
 * @description ... ��
 */
public class C04HashMap {
    public static void main(String[] args) {
        HashMap<String, Student> hashMap = new HashMap<String, Student>();
        hashMap.put("1��", new Student("����", 10));
        hashMap.put("2��", new Student("����", 11));
        hashMap.put("3��", new Student("����", 12));

        /*Student s = hashMap.get("1��");
        System.out.println(s);
        // ��ȡkey�ĵ�����
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next(); // ��ȡkey
            Student student = hashMap.get(key); // ��ȡֵ
            System.out.println("key=" + key + ",value=" + student);
        }*/

        //Map��ӳ����Entryѧϰ
        /**
         * Map�в���Entry�ڲ�������ʾһ��ӳ���ӳ�������Key��Value (������˵��ֵ�Լ�ֵ��, ÿһ����ֵ��Ҳ����һ��Entry)
         * Map.Entry�������getKey()��getValue()����
         * entrySet�� java�� ��-ֵ �Եļ��ϣ�һ�����ͨ��map.entrySet()�õ���
         * keySet�� java�� ��-ֵ �Ե�key�ļ��ϣ�һ�����ͨ��map.keySet()�õ���
         */

        //���ֱ���Map��ʽ:
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        //��һ�֣��ձ�ʹ�ã�����Key
        /*System.out.println("ͨ��Map.keySet����key��value��");
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }*/
        //�ڶ��֣�������
        /*System.out.println("ͨ��Map.entrySetʹ��iterator����key��value��");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }*/

        //�����֣��Ƽ���������������ʱ
        System.out.println("ͨ��Map.entrySet����key��value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //������
       /* System.out.println("ͨ��Map.values()�������е�value�������ܱ���key");
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
